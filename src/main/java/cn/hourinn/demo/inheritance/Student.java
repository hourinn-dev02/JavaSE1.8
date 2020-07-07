package cn.hourinn.demo.inheritance;

//在student中也定义name,age属性
public class Student {
	private String name;
	private int age;
	//学生的特有属性
	private String school;

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

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	

}
