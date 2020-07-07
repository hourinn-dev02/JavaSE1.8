package cn.hourinn.demo.override;


class AA{
	public String fun(String info) {
		return "super class A "+info;
	}
	private void print() {
		System.out.println("我是私有方法，覆写无效");
	}
}
class BB extends AA{
	//覆写super class A fun() 
	public String fun(String info) {
		return "sub class B "+info;
	}
}
class CC extends AA{
	//覆写super class A fun() default < public 此时不被允许
//	default String fun(String info) {
//		return "sub class C "+info;
//	}
}
public class TestOverridePrivilige {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB b = new BB();
		CC c = new CC();
		System.out.println(b.fun("覆写super class fun()"));
		System.out.println(c.fun("覆写super class fun()"));
	}

}
