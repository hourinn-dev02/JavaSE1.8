package cn.oracle.tutorials.classesAndObjects.classes;

public class Arguments {

	public static void main(String[] args) {
		
		printMessage("hello"," world","!");
	}
	
	// varargs
	static void printMessage(Object... messages) {
		System.out.print(messages[0]);
		System.out.print(messages[1]);
		System.out.print(messages[2]);    
		System.out.println();
		System.out.printf("%s%s%s",messages);     //hello world!
	}
}
