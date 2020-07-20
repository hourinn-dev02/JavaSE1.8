package cn.hourinn.demo.anonymous_class;

public class GreatingApp2 {
	  
    class GreatingBase {
    	 String language;
    	 GreatingBase(String language) {
    		 this.language = language;
    	 }
         void greet() {};
         void greetSomeone(String someone) {};
    }
    
    public void greating () {
    
	    class EnglishGreating extends GreatingBase{
	
			EnglishGreating(String language) {
				super(language);
			}

			@Override
			public void greet() {
				System.out.println(language + " greating :hello!");
			}
	
			@Override
			public void greetSomeone(String someone) {
				System.out.println(language + " greating :hello! " + someone);
			}
	    }
	    
	    EnglishGreating englishGreating = new EnglishGreating("English");
	    
	    GreatingBase frenchGreeting = new GreatingBase("french") {

			@Override
			public void greet() {
				System.out.println(language + " greating :Salut!");
			}

			@Override
			public void greetSomeone(String someone) {
				System.out.println(language + " greating :Salut! " + someone);
			}
	    };
	    
	    GreatingBase spanishGreeting = new GreatingBase("spanish") {

			@Override
			public void greet() {
				System.out.println(language + " greating :Hola!");
			}

			@Override
			public void greetSomeone(String someone) {
				System.out.println(language + " greating :Hola! " + someone);
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
    	
    	GreatingApp2 greatingApp = new GreatingApp2();
    	greatingApp.greating();
	}
}