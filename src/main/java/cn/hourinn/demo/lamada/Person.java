package cn.hourinn.demo.lamada;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
	
	public enum Sex{
		MALE,FEMALE
	}
	
	private String name;
	private int age;
	
	private Sex gender;
	
	private String emailAddress;
	
	private LocalDate birthdayDate;
	
	public static List<Person> createRoster(){
		List<Person> list = new ArrayList<>();
		list.add(new Person("jessica",15,Sex.FEMALE,"jessica@gmail.com", LocalDate.now()));
		list.add(new Person("sakura",18,Sex.FEMALE,"sakura@gmail.com", LocalDate.now()));
		list.add(new Person("naoki",20,Sex.FEMALE,"naoki@gmail.com", LocalDate.now()));
		list.add(new Person("kasumi",25,Sex.FEMALE,"kasumi@gmail.com", LocalDate.now()));
		list.add(new Person("nao",30,Sex.FEMALE, "nao@gmail.com",LocalDate.now()));
		return list;
	}
	

	public void printPerson() {
		System.out.println("Person [name=" + name + ", age=" + age + ", gender=" + gender + ", emailAddress=" + emailAddress
				+ ", birthdayDate=" + birthdayDate + "]"); ;
	}
	

	public Person(String name,int age,Sex gender,String emailAddress, LocalDate birthdayDate) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.emailAddress = emailAddress;
		this.birthdayDate = birthdayDate;
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	public Sex getGender() {
		return gender;
	}
	
	public void setGender(Sex gender) {
		this.gender = gender;
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

	public LocalDate getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(LocalDate birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	
	

}
