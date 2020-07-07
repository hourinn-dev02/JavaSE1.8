package cn.hourinn.demo.staticfun;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//此类为一个工具类
class MathUtil2{
	public static String info = "静态属性";
	
	static void add(int x,int y) {
		 System.out.println(x + y);
	}
	
	public void fun() {
		System.out.println("非静态方法"+info);   //调用静态属性
		add(1, 3);    //调用静态方法
	}
}
public class TestStaticMethod2 {

	public static void main(String[] args) {
		
		MathUtil2 math = new MathUtil2();
		math.fun();
		
		
	}

}
