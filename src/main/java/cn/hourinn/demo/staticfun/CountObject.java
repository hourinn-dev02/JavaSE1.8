package cn.hourinn.demo.staticfun;
class  Apple{
	private static int count = 0;
	public Apple() {
		System.out.println("第"+ ++count + "个对象");
	}
}
//静态方法的应用->实现实例化对象的计数
public class CountObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Apple();
        new Apple();
        new Apple();
        new Apple();
        new Apple();
        new Apple();
	}

}
