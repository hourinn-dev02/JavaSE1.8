package cn.hourinn.demo.staticfun;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//此类为一个工具类
class MathUtil{
	static int add(int x,int y) {
		return x + y;
	}
}
public class TestStaticMethod {

	public static void main(String[] args) {
		
		MathUtil math = new MathUtil();
		//static方法	通过对象调用
		System.out.println(math.add(1, 2));;
		//static方法  通过类调用  
		System.out.println(MathUtil.add(1, 2));;
	}

}
