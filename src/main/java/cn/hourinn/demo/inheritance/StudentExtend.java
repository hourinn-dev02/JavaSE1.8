package cn.hourinn.demo.inheritance;

//拿到了person的所有属性和方法，同时扩充自己的属性和方法
public class StudentExtend extends Person{
	//student的特有属性
	private String school;
	//student的特有方法
	public String getSchool() {
		return school;
	}
	//student的特有方法
	public void setSchool(String school) {
		this.school = school;
	}
	
	

}
