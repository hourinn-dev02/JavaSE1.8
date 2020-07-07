package cn.hourinn.demo.functionalInterface;

public class Person {
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public Student toStudent() {
		Student student = new Student();
		student.setName(this.name);
		student.setAge(this.age);
		student.setSchool("hafo collage");
		return student;
	}
}
