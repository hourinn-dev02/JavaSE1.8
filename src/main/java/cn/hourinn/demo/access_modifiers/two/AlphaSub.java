package cn.hourinn.demo.access_modifiers.two;

import cn.hourinn.demo.access_modifiers.one.Alpha;


public class AlphaSub extends Alpha {
	
	public  void print() {
		
		super.fieldMemberC = "protected filedMemberC can be accessed";
		
		super.fieldMemberD = "public filedMemberD can be accessed";
		
		super.methodMemberC();
		
		super.methodMemberD();
	}
	
	/*在该类包外的子类中能“看到“的只是子类自己继承来的protected 方法和属性，它是不能“看到“它的父类对象的protected方法和属性的。
		也就是说你可以new 子类然后子类对象.protected属性..但是这样实际上访问的是子类继承来的属性..并不是父类的属性。*/
	public  void print1() {
		
		
		this.fieldMemberC = "protected filedMemberC can be accessed";
		
		this.fieldMemberD = "public filedMemberD can be accessed";
		
		this.methodMemberC();
		
		this.methodMemberD();
	}
	
	
	/*protected的意思是本包可以访问。子类可以继承。所以在包外是不能通过该类对象进行访问的,
		哪怕是在该类的子类中也不可以这样做*/
	public static void print2() {
		
		Alpha alpha = new Alpha();
		
		alpha.fieldMemberD = "public filedMemberD can be accessed";
		
		alpha.methodMemberD();
	}
	
	
	
	public static void main(String[] args) {
		
		AlphaSub alphaSub = new AlphaSub();
		alphaSub.print();
		System.out.println("--------------------------------------------------");
		alphaSub.print1();
		System.out.println("--------------------------------------------------");
		print2();
	}
}
