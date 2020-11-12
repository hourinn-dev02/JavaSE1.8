package cn.oracle.tutorials.interfacesAndinheritance.inheritance;

public class C implements B{
	
	public void printMessage(){
		System.out.println("message from C");
	}

	public static void main(String[] args) {
		B c = new C();
		c.printMessage();
	}
}
