package cn.hourinn.demo.privilege2;

import cn.hourinn.demo.privilege.PrivilegeField;

public class PrivilegeFiledInfo {
	{
		PrivilegeField privilege = new PrivilegeField();
		//public field所有地方都可以访问
		privilege.publicInfo = "public field info";
	}

}
