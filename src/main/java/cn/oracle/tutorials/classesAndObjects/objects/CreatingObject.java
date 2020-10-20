package cn.oracle.tutorials.classesAndObjects.objects;

class Point{
	int x;
	int y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

class Rectangle{
	int width;
	int height;
	Point point;
	public Rectangle(Point p,int w,int h){
		point = p;
		width = w;
		height = h;
	}
}

public class CreatingObject {
	public static void main(String[] args) {
		//an object can have multiple references to it.
		
		Point originOne = new Point(10,30);
		Rectangle rectangle = new Rectangle(originOne, 50, 100);
	}
}
