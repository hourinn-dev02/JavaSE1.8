package cn.hourinn.demo.override;


class A{
	public String fun(String info) {
		return "super class A "+info;
	}
}
class B extends A{
	//覆写super class A fun() 被覆写的方法在 方法名称、方法参数类型以及个数、返回值上与superclass中的该方法完全一致
	public String fun(String info) {
		return "sub class B "+info;
	}
}
class C extends A{
	//覆写super class A fun() 被覆写的方法在 方法名称、方法参数类型以及个数、返回值上与superclass中的该方法完全一致
	public String fun(String info) {
		return "sub class C "+info;
	}
}
public class TestOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		C c = new C();
		System.out.println(b.fun("覆写super class fun()"));
		System.out.println(c.fun("覆写super class fun()"));
	}

}
