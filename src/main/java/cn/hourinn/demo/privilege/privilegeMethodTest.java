package cn.hourinn.demo.privilege;


public class privilegeMethodTest {
	{
		PrivilegeMethod privilege = new PrivilegeMethod();
		//同一个包中，能访问到除了private以外的方法
		privilege.printDefault();
		privilege.printProtected();
		privilege.printPublic();
		
	}
}
