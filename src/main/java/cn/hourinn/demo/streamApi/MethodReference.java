package cn.hourinn.demo.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.ws.util.StringUtils;

//Method Reference are a specical type of lamada expressions
public class MethodReference {
    public static void main(String[] args) {
    	
    	List<People> peoples = new ArrayList<People>(){
			{
				add(new People("zhang",18,People.Gender.female));
				add(new People("wang",20,People.Gender.male));
				add(new People("li",23,People.Gender.male));
				add(new People("chen",25,People.Gender.female));
				add(new People("sun",26,People.Gender.male));
			}
		};
		
		//peoples.forEach(people -> people.setName(StringUtils.capitalize(people.getName())));
		
		peoples.forEach(MethodReference::toUppercaseName);
		
		peoples.forEach(people -> people.Print());
		
		
    	
	}
    
    public static void toUppercaseName(People people) {
		people.setName(StringUtils.capitalize(people.getName()));
	}
}
