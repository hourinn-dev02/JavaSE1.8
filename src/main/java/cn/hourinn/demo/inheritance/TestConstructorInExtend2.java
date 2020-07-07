package cn.hourinn.demo.inheritance;
//
class AA {
	public AA(String info){
		System.out.println("AA constructor " + info);
	}
}
class BB extends AA{
	public BB(String info){
		super(info);  //被扩展类没有无参构造方法，此时super()必须显式写出
		System.out.println("BB constructor");
	}
}
public class TestConstructorInExtend2 {

	public static void main(String[] args) {
		//先调用A的无参构造(super())，在调用B类无参构造
		new BB("hello");
		
		//AA constructor hello
		//B constructor
	}

}
