package cn.hourinn.demo.vo;

import java.util.Date;

public class Member {
	private String name;
	private int age;
	private Date birthday;
	
	public Member(String name, int age, Date birthday) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
	}
	
	
}
