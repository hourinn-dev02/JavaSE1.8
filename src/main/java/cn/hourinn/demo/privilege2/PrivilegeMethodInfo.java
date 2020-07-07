package cn.hourinn.demo.privilege2;

import cn.hourinn.demo.privilege.PrivilegeField;
import cn.hourinn.demo.privilege.PrivilegeMethod;

public class PrivilegeMethodInfo {
	{
		PrivilegeMethod privilege = new PrivilegeMethod();
		//public method所有地方都可以访问
		privilege.printPublic();
	}

}
