package cn.hourinn.demo.privilege2;

import cn.hourinn.demo.privilege.PrivilegeField;

public class PrivilegeFieldSub extends PrivilegeField{
	{
		PrivilegeField privilege = new PrivilegeField();
		//public field所有地方都可以访问
		privilege.publicInfo = "public field info";
	    //在sub类中反而不能通过super类的对象访问父类的protected成员变量
		//privilege.protectedInfo = "protected field info";  //出现错误
		
		//在不同包的子类中 ，只能访问protected 和public的变量
	    super.protectedInfo = "protected field info";
		super.publicInfo = "public field info";
		
		//子类通过extends得到super类的所有变量(private,default,protected,public)
		//对于default、private 变量不能显示访问，对于protected、public变量可以显示访问
	    this.protectedInfo = "protected field info";
		this.publicInfo = "public field info";
		//this.defaultInfo = "default field info";  虽然此时存在这个变量，但是不能显示访问
		//this.privateInfo = "private field info";	虽然此时存在这个变量，但是不能显示访问
		
		
	}
}
