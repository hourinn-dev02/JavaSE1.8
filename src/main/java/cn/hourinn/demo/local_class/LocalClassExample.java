package cn.hourinn.demo.local_class;

public class LocalClassExample {
	
	private static String regularExression = "[^0-9]";
	
	
	
	public static void validatePhoneNumber(String  phoneNumber1,String phoneNumber2) {
		
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
    			System.out.println("Original PhoneNumber is " + phoneNumber1 + ";" + phoneNumber2);
    		}
    		
		}
		
		
		PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
		
		PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);
		
		myNumber1.printOriginalNumber();
		
		System.out.println("-----------------------------------------------------------");
		
		if (myNumber1.getNumber() == null)
			System.out.println("PhoneNumber is invalid");
		else 
			System.out.println("Formatted PhoneNumber is " + myNumber1.getNumber());
		
		if (myNumber2.getNumber() == null)
			System.out.println("PhoneNumber is invalid");
		else 
			System.out.println("Formatted PhoneNumber is " + myNumber2.getNumber());
		
		
	}
	 
	 
	 
	 
	public static void main(String[] args) {
		
		validatePhoneNumber("070-4283-5107","70-4283-5107");
	}
}	
