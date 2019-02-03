package com.driver.bean;


public class Driver {
	private int id;
	private String name;
	private int mile;
	private String city;
	private String post;
	private String code;
	private String prefecture;
	private String town;


	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id �Z�b�g���� id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name �Z�b�g���� name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return mile
	 */
	public int getMile() {
		return mile;
	}

	/**
	 * @param mile �Z�b�g���� mile
	 */
	public void setMile(int mile) {
		this.mile = mile;
	}

	/**
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city �Z�b�g���� city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return post
	 */
	public String getPost() {
		return post;
	}

	/**
	 * @param post �Z�b�g���� post
	 */
	public void setPost(String post) {
		this.post = post;
	}

	/**
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code �Z�b�g���� code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return prefecture
	 */
	public String getPrefecture() {
		return prefecture;
	}

	/**
	 * @param prefecture �Z�b�g���� prefecture
	 */
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}

	/**
	 * @return town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * @param town �Z�b�g���� town
	 */
	public void setTown(String town) {
		this.town = town;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", mile=" + mile + ", city=" + city + ", post=" + post
				+ ", code=" + code + ", prefecture=" + prefecture + ", town=" + town + ", getPost()=" + getPost()
				+ ", getCode()=" + getCode() + ", getPrefecture()=" + getPrefecture() + ", getTown()=" + getTown()
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getMile()=" + getMile() + ", getCity()="
				+ getCity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Driver(int id, String name, int mile, String city, String post, String code, String prefecture,
			String town) {
		super();
		this.id = id;
		this.name = name;
		this.mile = mile;
		this.city = city;
		this.post = post;
		this.code = code;
		this.prefecture = prefecture;
		this.town = town;
	}

	public Driver() {
		super();
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}

}
