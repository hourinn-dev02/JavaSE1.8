package cn.hourinn.demo.inheritance;


//扩展性的限制

class Message{
	//私有属性
	 private String msg;
	
	//非私有操作
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
class Printer extends Message{
	public Printer() {
		//虽然此时在Printer中有了msg这个属性，但是不能被直接访问 因为此时的属性访问控制权限为private
		//System.out.println(msg);  //不能够直接访问msg
	}
}
public class TestMessageExtend {
	public static void main(String[] args) {
		
		Printer printer = new Printer();
		
		printer.setMsg("today is a hot");
		System.out.println(printer.getMsg());  //today is a hot
		
		//此时代表printer这个对象有msg这个属性
	}
}
