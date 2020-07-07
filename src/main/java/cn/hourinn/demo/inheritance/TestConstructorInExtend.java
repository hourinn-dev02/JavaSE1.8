package cn.hourinn.demo.inheritance;
class A {
	public A(){
		System.out.println("A constructor");
	}
}
class B extends A{
	public B(){
		//super()  此时super()写与不写效果都是一样
		System.out.println("B constructor");
	}
}
public class TestConstructorInExtend {

	public static void main(String[] args) {
		//先调用A的无参构造(super())，在调用B类无参构造
		new B();
		
		//A constructor
		//B constructor
	}

}
