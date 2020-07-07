package cn.hourinn.demo.abstractfun;

public class TestAbstractMain {

	public static void main(String[] args) {
		
		//发生向上转型
		AbstractDemo ad = new AbstractDemoExtend();
		
		AbstractDemoExtend ade = new AbstractDemoExtend();
		
		
		//ad.print();
		//调用被覆写的方法
		System.out.println(ade.fun("AAAAA"));;
		
		
	}	

}
