package com.driver.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;

import com.driver.bean.Driver;
import com.driver.dao.DriverDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public class DriverController {
	// @RequestMapping(value="/pageall")
	// public String queryAll(Model model) {
	// ApplicationContext context = new
	// ClassPathXmlApplicationContext("applicationContext.xml");
	// DriverDao dao = (DriverDao) context.getBean("dao");
	// ArrayList<Driver> driverList = new ArrayList<Driver>();
	// driverList = (ArrayList<Driver>) dao.queryAll();
	// model.addAttribute("drivers", driverList);
	// return "index";
	// }
	private static final String INDEX = "index";
	/**
	 * DB����w���������炤�@INDEX�֖߂�
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/dall")
	public String qureyAll(Model model){
		//�t�@���_�|���̔z�u
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");
		//ioc����dao�����
		DriverDao dao = (DriverDao) context.getBean("dao");
		//�V�w�����X�g�𐶐�����
		List<Driver>driverList = new ArrayList<Driver>();
		//dao��������queryAll���\�b�h�Ŋw������studentlist�֖߂�
		driverList = dao.queryAll();
		model.addAttribute("drivers", driverList);
		return INDEX;
	}

	@RequestMapping(value = "/dall")
	public String querydAll(Model model) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DriverDao dao = (DriverDao) context.getBean("dao");
		model.addAttribute("drivers", dao.queryAll());
		return "driver";
	}

	@RequestMapping(value = "/querybyid")
	public String querybyid(String id, Model model) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DriverDao dao = (DriverDao) context.getBean("dao");
		model.addAttribute("drivers", dao.querybyid(id));
		return "index";
	}

	@RequestMapping(value = "/querybyname")
	public String querybyname(String name, Model model) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DriverDao dao = (DriverDao) context.getBean("dao");
		model.addAttribute("drivers", dao.querybyname(name));
		return "index";
	}

	@RequestMapping(value = "/update")
	public String updateDriver(String id, String name, String mile, String post, String code, String prefecture,
			String city, String town, Model model) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DriverDao dao = (DriverDao) context.getBean("dao");
		Driver driver = new Driver();
		driver.setId(Integer.parseInt(id));
		driver.setName(name);
		driver.setMile(Integer.parseInt(mile));
		driver.setPost(post);
		driver.setCode(code);
		driver.setPrefecture(prefecture);
		driver.setCity(city);
		driver.setTown(town);
		boolean result = dao.updateDriver(driver);
		if (result) {
			System.out.println("update����");
		} else {
			System.out.println("update���s");
		}
		model.addAttribute("drivers", dao.queryAll());
		return "index";
	}

	@RequestMapping(value = "/delbyid")
	public String deleteDri(String id, Model model) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DriverDao dao = (DriverDao) context.getBean("dao");
		boolean result = dao.deleteDri(Integer.parseInt(id));
		if (result) {
			System.out.println("Delete����");
		} else {
			System.out.println("Delete���s");
		}
		model.addAttribute("drivers", dao.queryAll());
		return "index";
	}

	@RequestMapping(value = "/add")
	public String addDri(String id, String name, String mile, String post, String code, String prefecture, String city,
			String town, Model model) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DriverDao dao = (DriverDao) context.getBean("dao");
		Driver driver = new Driver();
		driver.setId(Integer.parseInt(id));
		driver.setName(name);
		driver.setMile(Integer.parseInt(mile));
		driver.setPost(post);
		driver.setCode(code);
		driver.setPrefecture(prefecture);
		driver.setCity(city);
		driver.setTown(town);
		boolean result = dao.addDri(driver);
		if (result) {
			System.out.println("Add����");
		} else {
			System.out.println("Add���s");
		}
		model.addAttribute("drivers", dao.queryAll());
		return "index";
	}

	@RequestMapping(value = "/all")
	public String queryPageAll(String sPage, String ePage, Model model) {
		if (sPage == null) {
			sPage = "0";
		}
		if (ePage == null) {
			ePage = "5";
		}
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DriverDao dao = new DriverDao();
		dao = (DriverDao) context.getBean("dao");
		ArrayList<Driver> driverList = new ArrayList<Driver>();
		driverList = (ArrayList<Driver>) dao.queryAll();
		int count = driverList.size();
		int start = Integer.valueOf(sPage) * Integer.valueOf(ePage);
		int pageCount = (int) Math.ceil(Integer.valueOf(count) / Integer.valueOf(ePage));
		driverList = (ArrayList<Driver>) dao.queryPageAll(start, Integer.parseInt(ePage));
		model.addAttribute("drivers", driverList);
		model.addAttribute("pageCounts", pageCount);
		return "driver";
	}
}
