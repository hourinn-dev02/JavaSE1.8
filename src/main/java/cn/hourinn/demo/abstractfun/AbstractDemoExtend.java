package cn.hourinn.demo.abstractfun;


public class AbstractDemoExtend extends AbstractDemo{
	
	//覆写抽象类方法
	public  String fun(String info) {
		return "sub class " + info;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "AbstractDemoExtend";
	}

}
