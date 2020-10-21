package cn.oracle.tutorials.classesAndObjects.moreOnClasses.one;

public class Alpha {
	
	private String fieldMemberA;
	
	String fieldMemberB;
	
	protected String fieldMemberC;
	
	public String fieldMemberD;
	
	private void methodMemberA() {
		System.out.println("private methodMemberA :" + fieldMemberA);
	}
	
	void methodMemberB() {
		System.out.println("no modifier(package-private) methodMemberB :" + fieldMemberB);
	}
	
	protected void methodMemberC() {
		System.out.println("protected methodMemberC :" + fieldMemberC);
	}
	
	public void methodMemberD() {
		System.out.println("public methodMemberD :" + fieldMemberD);
	}
	
}
