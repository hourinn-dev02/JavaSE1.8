package cn.hourinn.demo.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.sun.xml.internal.ws.util.StringUtils;

class People{
	public enum Gender{male,female};
	String name;
	int age;
	Gender sex;
	public People(String name,int age,Gender sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public void Print() {
		System.out.println("People [name=" + name + ", age=" + age + ", sex=" + sex + "]");
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
}

interface CheckPeople {
	boolean test(People people);
}

class CheckPeopleImpl implements CheckPeople{

	@Override
	public boolean test(People people) {
		return 20 <= people.age && people.age <= 25 && people.sex == People.Gender.male;
	}
	
}

public class LamadaFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<People> peoples = new ArrayList<People>(){
			{
				add(new People("zhang",18,People.Gender.female));
				add(new People("wang",20,People.Gender.male));
				add(new People("li",23,People.Gender.male));
				add(new People("chen",25,People.Gender.female));
				add(new People("sun",26,People.Gender.male));
			}
		};
		
		//1
		for(People people : peoples) {
			if(20 <= people.age && people.age <= 25 && people.sex == People.Gender.male) {
				people.Print();
			}
		}
		
		System.out.println("---------------------2--------------------");
	
		//2
		printByInterface(peoples,new CheckPeopleImpl());
		
		System.out.println("--------------------3---------------------");

		//3
		printByInterface(peoples,new CheckPeople() {
			@Override
			public boolean test(People people) {
				// TODO Auto-generated method stub
				return 20 <= people.age && people.age <= 25 && people.sex == People.Gender.male;
			}
		});
		
		printByInterface(peoples,people -> 20 <= people.age && people.age <= 25 && people.sex == People.Gender.male);
		
		System.out.println("--------------------4---------------------");
		
		//4
		printByFunctionalInterface(peoples,new Predicate<People>() {
			@Override
			public boolean test(People people) {
				// TODO Auto-generated method stub
				return 20 <= people.age && people.age <= 25 && people.sex == People.Gender.male;
			}
		});
		
		System.out.println("-----------------------------------------");
		
		//5
		printByFunctionalInterface(peoples,people -> 20 <= people.age && people.age <= 25 && people.sex == People.Gender.male);
		printByFunctionalInterface(peoples,people -> 20 <= people.age && people.age <= 25 && people.sex == People.Gender.male);
		
		
		System.out.println("-------------------6----------------------");	
		
		//6
		printByFunctionalInterface2(peoples,people -> 20 <= people.age && people.age <= 25 && people.sex == People.Gender.male,people -> people.Print());

	}	
	
	public static void printByInterface(List<People> peoples,CheckPeople check) {
		for(People people : peoples) {
			if(check.test(people)) {
				people.Print();
			}
		}
	}
	
	public static void printByFunctionalInterface(List<People> peoples,Predicate<People> check) {
		for(People people : peoples) {
			if(check.test(people)) {
				people.Print();
			}
		}
	}
	
	public static void printByFunctionalInterface2(List<People> peoples,Predicate<People> check,Consumer<People> apply) {
		for(People people : peoples) {
			if(check.test(people)) {
				apply.accept(people);
			}
		}
	}
}
