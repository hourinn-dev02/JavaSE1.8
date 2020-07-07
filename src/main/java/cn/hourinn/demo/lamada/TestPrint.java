package cn.hourinn.demo.lamada;

import org.junit.Test;

public class TestPrint {
	
	//没有参数且函数体为语句块
	@Test
	public  void TestPrintNull() {
		// TODO Auto-generated method stub
//		Print print = () -> {System.out.println("lamda表达式实现接口");};
//		print.printNull();
	}
	
	//有参数且函数体为语句块
	@Test
	public  void TestPrintInfo() {
		// TODO Auto-generated method stub
//		Print print = (info) -> {System.out.println("lamda表达式实现接口"+info);};
//		print.printInfo("print one message");     
	}
	
	//有参数且函数体为表达式
	@Test
	public  void TestPrintAdd() {
		// TODO Auto-generated method stub
//		Print print = (x,y) -> x+y;
//		int sum = print.printAdd(2,3);
//		System.out.println(sum);
	}
	
	//有参数且函数体为语句块
	@Test
	public  void TestPrintAdd2() {
		// TODO Auto-generated method stub
		Print print = (x,y) -> {
			if(x>y) {
				return x+y;
			}else {
				return 0;
			}
		};
		int sum = print.printAdd(2,3);
		System.out.println(sum);   
	}
}
