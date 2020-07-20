package cn.hourinn.demo.local_class;

public class LocalClassExample2 {
	
	private  String regularExression = "[^0-9]";
	
	
	
	public  void validatePhoneNumber(String  phoneNumber) {
		
		int numberLength = 11;
		
		//int numberLength = 11   //java1.8之后,可以不用声明为final,但是必须保证此变量值不被改变
		
		class PhoneNumber {
			
		    String formattedNumber = null;	
			
		    PhoneNumber (String  phoneNumber) {
		    	String currentNumber = phoneNumber.replaceAll(regularExression, "");
				
				if(currentNumber.length() == numberLength)
					formattedNumber = currentNumber;
				else 
					formattedNumber = null;
		    }
		    
    		String  getNumber() {
    			return formattedNumber;
    		}
    		
    		void printOriginalNumber() {
    			System.out.println("Original PhoneNumber is " + phoneNumber);
    		}
    		
    		//The method fun cannot be declared static;static methods can only be declared in a static or top level type
    		//static void fun() {} 
    		
    		static final String errorInfo = "PhoneNumber is invalid";
		}
		
		
		PhoneNumber myNumber = new PhoneNumber(phoneNumber);
		
		myNumber.printOriginalNumber();
		
		if (myNumber.getNumber() == null)
			System.out.println(myNumber.errorInfo);
		else 
			System.out.println("Formatted PhoneNumber is " + myNumber.getNumber());
		
		
	}
	 
	 
	 
	 
	public static void main(String[] args) {
		LocalClassExample2 localClassExample2 = new LocalClassExample2();
		localClassExample2.validatePhoneNumber("070-4283-5107");
		System.out.println("-----------------------------------------------------------");
		localClassExample2.validatePhoneNumber("70-4283-5107");
	}
}	
