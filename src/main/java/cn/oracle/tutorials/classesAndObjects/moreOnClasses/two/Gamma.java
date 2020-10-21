package cn.oracle.tutorials.classesAndObjects.moreOnClasses.two;

import cn.hourinn.demo.access_modifiers.one.Alpha;

public class Gamma {
	
	public static void print() {
			
			Alpha alpha = new Alpha();
			
			alpha.fieldMemberD = "protected filedMemberC can be accessed";
			
			alpha.methodMemberD();
	}
	
	public static void main(String[] args) {
		print();
	}
}
