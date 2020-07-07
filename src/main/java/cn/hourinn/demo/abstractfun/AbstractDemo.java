package cn.hourinn.demo.abstractfun;

public abstract class AbstractDemo  {
	public String getInfo(String info) {
		return "abstract class " +info;
	}
	//定义一个抽象方法，那么类必须也要有abstract关键字进行声明
	public abstract String print();
}
