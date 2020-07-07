package cn.hourinn.demo.privilege;


public  class PrivilegeMethod {
	//所有地方都可访问
    public void printPublic() {
        System.out.println("public method");
    }
    //同类中可访问，同一个包中可访问，不同包的sub类可访问（通过父类对象依然不能访问，只能通过子类对象）
    protected void printProtected() {
        System.out.println("protected method");
    }
    //同类中可访问，同一个包中可访问
    void printDefault() {
        System.out.println("default method");
    }
    
    //同类中可访问
    private void printPrivate() {
        System.out.println("private method");
    }
}
