package cn.hourinn.demo.privilege2;


public class PrivilegeMethodSubMain {
	public static void main(String[] args) {
		PrivilegeMethodSub privilegMethodSub  = new PrivilegeMethodSub();
		privilegMethodSub.printPublic();
		
		//在与sub类同包的其他类中不能通过sub类的对象访问super类的protected方法
		//privilegeFieldSub.printProtected() ; //出现错误
	}
}
