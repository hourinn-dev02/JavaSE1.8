package cn.hourinn.demo.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person{
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Student becomeStudent(String school) {
		Student stu = new Student();
		stu.setName(this.name);
		stu.setAge(this.age);
		stu.setSchool(school);
		return stu;
	}
	
}

class Student{
	String name;
	int age;
	String school;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}
	
	
}

public class StreamFun {
	
	public static void main(String[] args) {
		
		//create stream from arrays
		int [] nums = {5,4,-2,7,3};
		IntStream s1 = Arrays.stream(nums);
		
		
		//create stream from collection
		List<String> names = new ArrayList<String>(); 
		names.add("zhang");
		names.add("wang");
		names.add("li");
		names.add("chen");
		Stream<String> s2 = names.stream();
		
		
		//two operations on a stream: intermediate operations or terminal operations 
		s2.distinct().count();
		
		
		//iterating
		//boolean isExist = s2.anyMatch(element -> element.contains("li"));
		//System.out.println(isExist);
		
		//Filtering
		Stream<String>  s3 = names.stream().filter(element -> element.contains("a"));
		System.out.println(s3.count());
		
		//Mapping
		//to convert elements of a stream
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("zhang",18));
		persons.add(new Person("wang",19));
		persons.add(new Person("li",20));
		
		//Stream<Student> students = persons.stream().map(person -> person.becomeStudent("TOKYO University"));
		
		//Collecting
		List<Student> students2 = persons.stream().map(person -> person.becomeStudent("TOKYO University")).collect(Collectors.toList());
		System.out.println(students2.toString());
		
	}
	
	
}
