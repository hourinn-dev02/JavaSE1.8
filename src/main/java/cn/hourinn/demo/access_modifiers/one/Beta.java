package cn.hourinn.demo.access_modifiers.one;

public class Beta {
	
	public static void print() {
		
		Alpha alpha = new Alpha();
		
		alpha.fieldMemberB = "no modifier(package-private) filedMemberB can be accessed";
		
		alpha.fieldMemberC = "protected filedMemberC can be accessed";
		
		alpha.fieldMemberD = "public filedMemberD can be accessed";
		
		alpha.methodMemberB();
		
		alpha.methodMemberC();
		
		alpha.methodMemberD();
	}
	
	public static void main(String[] args) {
		
		print();
		
	}
}
