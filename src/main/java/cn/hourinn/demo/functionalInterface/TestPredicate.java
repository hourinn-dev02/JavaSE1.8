package cn.hourinn.demo.functionalInterface;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

//测试函数
public class TestPredicate {
	
	public static void main(String[] args) {
		Map<String, Integer> persons  = new ConcurrentHashMap<String,Integer>(){
			{put("smith", 20);put("jim", 30);put("michle", 40);}
		};
		System.out.println(persons);
		//得到Map.Entry对象 entrySet方法将map集合封装成set集合，只有封装成了collection集合才可以进行迭代输出
		Set<Map.Entry<String, Integer>> mapEntry =  persons.entrySet();
		//default boolean removeIf(Predicate<? super E> filter) 
		mapEntry.removeIf(person -> person.getValue()>30);
		System.out.println(persons);
		
	}
}