package cn.hourinn.demo.lamada;


@FunctionalInterface    //声明此接口为一个函数式接口，编译器会在编译时其是否符合函数式接口的条件
public interface Print {
	//void printNull();    //没有参数，没有返回值
	
	//void printInfo(String info);   //有参数，没有返回值
	
	int  printAdd(int x,int y);     //有参数，有返回值
	
}

