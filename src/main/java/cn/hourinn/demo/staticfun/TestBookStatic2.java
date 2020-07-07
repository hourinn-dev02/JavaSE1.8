package cn.hourinn.demo.staticfun;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestBookStatic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//一千本书都来自同一家出版社
		List<BookStaticPublish> books = new ArrayList<>();
		for(int i=1;i<1000;i++) {
			BookStaticPublish book = new BookStaticPublish("funny book",i);
			books.add(book);
		}
		//修改出版社名称，此时publish为static属性，类直接调用
		BookStaticPublish.publish ="我要修改出版社名称";
		
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).toString());
		}
	}

}
