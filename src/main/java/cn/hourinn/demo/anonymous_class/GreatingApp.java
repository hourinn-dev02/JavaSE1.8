package cn.hourinn.demo.anonymous_class;

public class GreatingApp {
	  
    interface Greating {
         void greet();
         void greetSomeone(String someone);
    }
    
    public void greating () {
    
	    class EnglishGreating implements Greating{
	
			@Override
			public void greet() {
				System.out.println("hello!");
			}
	
			@Override
			public void greetSomeone(String someone) {
				System.out.println("hello! " + someone);
			}
	    }
	    
	    EnglishGreating englishGreating = new EnglishGreating();
	    
	    Greating frenchGreeting = new Greating() {

			@Override
			public void greet() {
				System.out.println("Salut!");
			}

			@Override
			public void greetSomeone(String someone) {
				System.out.println("Salut! " + someone);
			}
	    };
	    
	    Greating spanishGreeting = new Greating() {

			@Override
			public void greet() {
				System.out.println("Hola!");
			}

			@Override
			public void greetSomeone(String someone) {
				System.out.println("Hola! " + someone);
			}
	    };
	    
	    englishGreating.greet();
	    englishGreating.greetSomeone("pulin");
	    frenchGreeting.greet();
	    frenchGreeting.greetSomeone("pulin");
	    spanishGreeting.greet();
	    spanishGreeting.greetSomeone("pulin");
    }
    
    public static void main(String[] args) {
    	
    	GreatingApp greatingApp = new GreatingApp();
    	greatingApp.greating();
	}
}