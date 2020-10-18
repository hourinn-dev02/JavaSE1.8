package cn.oracle.tutorials.classesAndObjects.classes;

class SuperClass{
	int num;
	public SuperClass(int num) {
		this.num = num;
	}
}

class SubClass extends SuperClass{
	public SubClass(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}
}

public class Constructors{

	public static void main(String[] args) {
		
	}
}
