package com.driver.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.driver.bean.Driver;
import com.driver.mapper.DriverMapper;

import java.sql.Types;
import java.util.ArrayList;

import java.util.List;

public class DriverDao {
	private JdbcTemplate jdbcTemplate;

	/**
	 * @param jdbcTemplate
	 *            セットする jdbcTemplate
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Driver> queryAll() {
		//定義変数ｓｑｌ　初期化
		String sql = "select id,name,mile,post,code,prefecture,city,town from driver";
		List<Driver> driverList = new ArrayList<Driver>();
		return null;
	}

	// private JdbcTemplate jdbcTemplate;
	//
	// /**
	// * @return jdbcTemplate
	// */
	// public JdbcTemplate getJdbcTemplate() {
	// return jdbcTemplate;
	// }
	//
	// /**
	// * @param jdbcTemplate
	// * セットする jdbcTemplate
	// */
	// public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	// this.jdbcTemplate = jdbcTemplate;
	// }
	// public List<Driver> queryAll() {
	// String sql = "select id,name,mile,post,code,prefecture,city,town from
	// driver";
	// List<Driver> driverList = new ArrayList<Driver>();
	// driverList = jdbcTemplate.query(sql, new DriverMapper());
	// return driverList;
	// }
	public List<Driver> querybyname(String name) {
		String sql = "select id,name,mile,post,code,prefecture,city,town from driver where name like'%" + name + "%'";
		List<Driver> driverList = new ArrayList<Driver>();
		driverList = (ArrayList<Driver>) jdbcTemplate.query(sql, new DriverMapper());
		return driverList;
	}

	public List<Driver> querybyid(String id) {
		String sql = "select * from driver where id =" + id;
		List<Driver> driverList = new ArrayList<Driver>();
		driverList = jdbcTemplate.query(sql, new DriverMapper());
		return driverList;
	}

	public boolean addDri(Driver driver) {
		String sql = "insert into driver(id,name,mile,post,code,prefecture,city,town) values(?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,
				new Object[] { driver.getId(), driver.getName(), driver.getMile(), driver.getPost(), driver.getCode(),
						driver.getPrefecture(), driver.getCity(), driver.getTown() },
				new int[] { Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
						Types.VARCHAR, Types.VARCHAR }) == 1;
	}

	public boolean updateDriver(Driver driver) {
		String sql = "update driver set name=?,mile=?,post=?,code=?,prefecture=?,city=?,town=? where id=?";
		Object driObj[] = new Object[] { driver.getName(), driver.getMile(), driver.getPost(), driver.getCode(),
				driver.getPrefecture(), driver.getCity(), driver.getTown(), driver.getId() };
		return jdbcTemplate.update(sql, driObj) == 1;
	}

	public boolean deleteDri(Integer id) {
		String sql = "delete from driver where id = ?";
		return jdbcTemplate.update(sql, id) == 1;
	}

	public int numCount() {
		String sql = "select count(*) from driver";
		int sumdata = jdbcTemplate.queryForInt(sql);
		return sumdata;
	}

	public List<Driver> queryPageAll(int start, int end) {
		String sql = "select * from driver limit ?,?";
		List<Driver> driverList = new ArrayList<Driver>();
		driverList = (ArrayList<Driver>) jdbcTemplate.query(sql, new Object[] { start, end }, new DriverMapper());
		return driverList;
	}
}
