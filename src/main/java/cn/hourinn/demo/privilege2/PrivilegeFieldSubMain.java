package cn.hourinn.demo.privilege2;


public class PrivilegeFieldSubMain {
	public static void main(String[] args) {
		PrivilegeFieldSub privilegeFieldSub  = new PrivilegeFieldSub();
		privilegeFieldSub.publicInfo = "public field info";
		
		//在与sub类同包的其他类中不能通过sub类的对象访问super类的protected成员变量
		//privilegeFieldSub.protectedInfo = "protected field info";
	}
}
