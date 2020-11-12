package cn.oracle.tutorials.interfacesAndinheritance.inheritance;

public interface B {
	public default void  printMessage(){
		System.out.println("message from B");
	}
}
