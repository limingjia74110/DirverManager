package com.student.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 学生エンティティ.
 *
 * @author limingjia123
 *
 */
public class StudentEntity implements Serializable {
	/**
	 *シリアル.バッジョID
	 */
	private static final long serialVersionUID = -933478615781297614L;
	/**
	 *学生のid
	 */
	private int id;
	/**
	 * 氏名
	 */
	private String name;
	/**
	 *生年月日
	 */
	private Date bidthday;
	/**
	 *年齢
	 */
	private String age;
	/**
	 *分数
	 */
	private int score;

}
