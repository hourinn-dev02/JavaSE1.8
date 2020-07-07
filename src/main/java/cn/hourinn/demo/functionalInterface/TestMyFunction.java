package cn.hourinn.demo.functionalInterface;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyFunction {

	@Test
	public void test() {
		MyFunction<Person, Student> function = Person::toStudent;
		System.out.println(function.apply(new Person("vsben",22)));
	}
}
