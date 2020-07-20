package cn.hourinn.demo.lamada;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class RosterTest {
	public interface CheckPerson {
		boolean test(Person person);
	}
	
	//Approach2 Create More Generailized Methods
	public static void printPersonsWithinAgeRange(List<Person> roster,int low,int high) {
		for (Person person : roster) {
			if(low <= person.getAge() && person.getAge() <= high && person.getGender() == Person.Sex.FEMALE)
				person.printPerson();
		}
	}
	
	
	
	
	//Approach3 Specify search Criteria Code in a Local Class
	//Approach4 Specify search Criteria Code in an Anonymous Class
	//Approach5 Specify Search Criteria Code with a Lambda Expression
	public static void printPersons(List<Person> roster,CheckPerson checkPerson) {
		for (Person person : roster) {
			if(checkPerson.test(person))
				person.printPerson();
		}
	}
	
	//Approach6 Use Standard Functional Interfaces with Lambda Expressions
	public static void printPersonsWithPredicate(List<Person> roster,Predicate<Person> tester) {
		for (Person person : roster) {
			if(tester.test(person))
				person.printPerson();
		}
	}
	
	
	//Approach7 Use Lambda Expressions Throughout Your Application
	
	//Instead of invoking the method printPerson, you can specify a different action to perform on those Person instances that satisfy the criteria specified by tester by Consumer<T> interface
	public static void processPersons(List<Person> roster,Predicate<Person> tester,Consumer<Person> action) {
		for (Person person : roster) {
			if(tester.test(person))
				action.accept(person);
		}
	}
	
	//What if you want to do more with your members' profiles than printing them out. Suppose that you want to validate the members' profiles or retrieve their contact information by Function<T,R> interface
	public static void processPersonsWithFunction(List<Person> roster,Predicate<Person> tester,Function<Person, String> mapper,Consumer<String> action) {
		for (Person person : roster) {
			if(tester.test(person)) {
				String data = mapper.apply(person);
				action.accept(data);
			}
		}
	}
	
	
	//Approach8 Use Generics More Extensively
	public static<X,Y> void processElements(
			Iterable<X> source,
			Predicate<X> tester,
			Function<X, Y> mapper,
			Consumer<Y> action ){
		for (X p : source) {
			if(tester.test(p)) {
				Y data = mapper.apply(p);
				action.accept(data);
			}
		}
	}
	
	//Approach9 Use Aggregate Operations That Accept Lambda Expressions as Parameters
	
	/*
	processElements Action	                                                            Aggregate Operation
	Obtain a source of objects	                                        <=>                	Stream<E> stream()
	Filter objects that match a Predicate object                        <=>  				Stream<T> filter(Predicate<? super T> predicate)
	Map objects to another value as specified by a Function object  	<=>  				<R> Stream<R> map(Function<? super T,? extends R> mapper)
	Perform an action as specified by a Consumer object    				<=>  				void forEach(Consumer<? super T> action) 
	*/
	
	public static void main(String[] args) {
		List<Person> roster = Person.createRoster();
		
		for (Person person : roster) {
			person.printPerson();
		}
		
		System.out.println("----------------------------------Approach2------------------------------------------");
		
		RosterTest.printPersonsWithinAgeRange(roster, 18, 25);
		
		System.out.println("----------------------------------Approach3------------------------------------------");
		
		class CheckPersonLocalClass implements CheckPerson{
			
			int low = 18;
		    int high = 25;

			@Override
			public boolean test(Person person) {
				return low <= person.getAge() && person.getAge() <= high && person.getGender() == Person.Sex.FEMALE;
					
			}
			
		}
		
		RosterTest.printPersons(roster,new CheckPersonLocalClass());
		
		System.out.println("----------------------------------Approach4------------------------------------------");
		
		RosterTest.printPersons(roster,new CheckPerson() {
			int low = 18;
		    int high = 25;
		    
			@Override
			public boolean test(Person person) {
				return low <= person.getAge() && person.getAge() <= high && person.getGender() == Person.Sex.FEMALE;
			}
		});
		
		System.out.println("----------------------------------Approach5------------------------------------------");
		
		RosterTest.printPersons(roster,(Person p) -> 18 <= p.getAge() && p.getAge() <= 25 && p.getGender() == Person.Sex.FEMALE);
		
		System.out.println("----------------------------------Approach6------------------------------------------");
		
		RosterTest.printPersonsWithPredicate(roster,(Person p) -> 18 <= p.getAge() && p.getAge() <= 25 && p.getGender() == Person.Sex.FEMALE);
		
		
		System.out.println("----------------------------------Approach7------------------------------------------");
		
		System.out.println();
		System.out.println("----------------------------------action1------------------------------------------");
		//action1 printPerson()
		RosterTest.processPersons(
				roster,
				(Person p) -> 18 <= p.getAge() && p.getAge() <= 25 && p.getGender() == Person.Sex.FEMALE,
				(Person p) -> p.printPerson()
		);
		
		System.out.println("----------------------------------action2------------------------------------------");
		
		//action2 getName()
		RosterTest.processPersons(
				roster,
				(Person p) -> 18 <= p.getAge() && p.getAge() <= 25 && p.getGender() == Person.Sex.FEMALE,
				(Person p) -> System.out.println(p.getName())
		);
		
		System.out.println("---------------------------------retrieve their contact information-------------------------------------------");
		
		RosterTest.processPersonsWithFunction(roster,
				(Person p) -> 18 <= p.getAge() && p.getAge() <= 25 && p.getGender() == Person.Sex.FEMALE,
				(Person p) -> p.getEmailAddress(),
				(String data) -> System.out.println(data));
		
		System.out.println("----------------------------------Approach8------------------------------------------");
		
		RosterTest.processElements(roster,
				(Person p) -> 18 <= p.getAge() && p.getAge() <= 25 && p.getGender() == Person.Sex.FEMALE,
				(Person p) -> p.getEmailAddress(),
				(String data) -> System.out.println(data));
		
		System.out.println("----------------------------------Approach9------------------------------------------");
		
		roster.stream().filter( p -> 18 <= p.getAge() && p.getAge() <= 25 && p.getGender() == Person.Sex.FEMALE).map(p -> p.getEmailAddress()).forEach(email -> System.out.println(email));
		
	}
	
}
