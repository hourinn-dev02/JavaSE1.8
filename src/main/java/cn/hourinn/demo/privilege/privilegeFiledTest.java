package cn.hourinn.demo.privilege;


public class privilegeFiledTest {
	{
		PrivilegeField privilege = new PrivilegeField();
		//同一个包中，能访问到除了private以外的变量
		privilege.defaultInfo = "default field info";
		privilege.protectedInfo = "protected field info";
		privilege.publicInfo = "public field info";
		
	}
}
