package com.driver.bean;

public class Student {
private int id;
private String name;
private int birthday;
private String age;
private int score;
/**
 * @return id
 */
public int getId() {
	return id;
}
/**
 * @param id セットする id
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
 * @param name セットする name
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return birthday
 */
public int getBirthday() {
	return birthday;
}
/**
 * @param birthday セットする birthday
 */
public void setBirthday(int birthday) {
	this.birthday = birthday;
}
/**
 * @return age
 */
public String getAge() {
	return age;
}
/**
 * @param age セットする age
 */
public void setAge(String age) {
	this.age = age;
}
/**
 * @return score
 */
public int getScore() {
	return score;
}
/**
 * @param score セットする score
 */
public void setScore(int score) {
	this.score = score;
}
/* (非 Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((age == null) ? 0 : age.hashCode());
	result = prime * result + birthday;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + score;
	return result;
}
/* (非 Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (age == null) {
		if (other.age != null)
			return false;
	} else if (!age.equals(other.age))
		return false;
	if (birthday != other.birthday)
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (score != other.score)
		return false;
	return true;
}
/* (非 Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", age=" + age + ", score=" + score
			+ ", getId()=" + getId() + ", getName()=" + getName() + ", getBirthday()=" + getBirthday() + ", getAge()="
			+ getAge() + ", getScore()=" + getScore() + ", hashCode()=" + hashCode() + "]";
}
public Student(int id, String name, int birthday, String age, int score) {
	super();
	this.id = id;
	this.name = name;
	this.birthday = birthday;
	this.age = age;
	this.score = score;
}
public Student() {
	super();
	// TODO 自動生成されたコンストラクター・スタブ
}

}
