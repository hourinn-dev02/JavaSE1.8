package cn.hourinn.demo.privilege;


public  class PrivilegeField {
	//同类中可访问
	private String privateInfo;
	//同类中可访问，同一个包中可访问
	String defaultInfo;
	//同类中可访问，同一个包中可访问，不同包的子类可访问
	protected String protectedInfo;
	//所有地方都可访问
	public String publicInfo;
}
