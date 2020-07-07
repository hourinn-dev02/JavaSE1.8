package cn.hourinn.demo.override;


class D{
	public void fun(String info) {
		System.out.println("super class D.fun() "+info);
	}
}
class E extends D{
	//覆写super class A fun() 
	public void fun(String info) {
		super.fun(info);       //调用superclass的方法
		System.out.println("sub class E.fun() "+info);;
	}
}

public class TestOverrideSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e = new E();
		e.fun("覆写super class D.fun()");
	}

}
