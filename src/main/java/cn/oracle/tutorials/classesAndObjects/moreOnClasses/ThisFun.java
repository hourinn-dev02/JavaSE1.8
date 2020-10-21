package cn.oracle.tutorials.classesAndObjects.moreOnClasses;


class Rectangle {
    private int x, y;
    private int width, height;
        
    public Rectangle() {
        this(0, 0, 1, 1);
    }
    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

public class ThisFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Rectangle();
		System.out.println(Bicycle.numberOfBicycles);
	}

}
