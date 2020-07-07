package cn.hourinn.demo.privilege2;

import cn.hourinn.demo.privilege.PrivilegeMethod;

public class PrivilegeMethodSub extends PrivilegeMethod{
	{
		PrivilegeMethod privilege = new PrivilegeMethod();
		//public field所有地方都可以访问
		privilege.printPublic();
	    //在sub类中不能通过super类对象访问pretected方法
		//privilege.printProtect = "protected field info";  //出现错误
		
		//在不同包的子类中 ，只能访问protected 和public的方法
	    super.printProtected();
		super.printPublic();
		
		//子类通过extends得到super类的所有方法(private,default,protected,public)
		//对于default、private 方法不能显示访问，对于protected、public方法可以显示访问
	    this.printProtected();
		this.printPublic();
		//this.printDefault;    虽然此时存在这个方法，但是不能显示访问
		//this.printPrivate;	虽然此时存在这个方法，但是不能显示访问
		
		
	}
}
