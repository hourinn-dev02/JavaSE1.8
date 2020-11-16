package cn.oracle.tutorials.languageBasics.variables;

public class PrimitiveDataTypes {
	
	static byte byteDefault;
	static short shortDefault;
	static int intDefault;
	static long longDefault;
	static float floatDefault;
	static double doubleDefault;
	static boolean booleanDefault;
	static char charDefault;
	
	
	public static void main(String[] args) {
		
		//minimum and maximum value of the primitive types
		System.out.println("----------------------minimum and maximum value--------------------------");
		bytePrint();
		shortPrint();
		intPrint();
		longPrint();
		floatPrint();
		doublePrint();
		charPrint();
		
		System.out.println("----------------------default value--------------------------");
		//default value of the primitive types
		printDefaultValue();
		
		System.out.println("----------------------integer literals--------------------------");
		integerLiterals();
		
		System.out.println("----------------------float-point literals--------------------------");
		floatPointLiterals();
		
		System.out.println("----------------------character and String literals--------------------------");
		characterAndStringLiterals();
	}
	
	static void printDefaultValue() {
		
		// the compiler never assigns a default value to an uninitialized local variable Accessing an uninitialized local variable will result in a compile-time error.
		byte a;
		short  b;
		int c;
		long d = 100;
		float e = 0.0f;
		double f = 0.0D;
		char g ;
		boolean h;
		
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
//		System.out.println(g);
//		System.out.println(h);
		
		System.out.println("Byte: " + byteDefault);                    	//0
		System.out.println("short: " + shortDefault);					//0
		System.out.println("int: " + intDefault);						//0
		System.out.println("long: " + longDefault);						//0L
		System.out.println("float: " + floatDefault);                   //0.0f
		System.out.println("double: " + doubleDefault);					//0.0d
		System.out.println("boolean: " + booleanDefault);				//false
		System.out.println("char: " + charDefault);						//'\u0000'
	}
	
	static void bytePrint() {
		
		
		byte byteMin = Byte.MIN_VALUE;
		byte byteMax = Byte.MAX_VALUE;
		System.out.println("minimum of byte:"+ byteMin + " && maximum of byte:" + byteMax);
	}
	
	static void shortPrint() {
		short shortMin = Short.MIN_VALUE;
		short shortMax = Short.MAX_VALUE;
		System.out.println("minimum of short:"+ shortMin + " && maximum of short:" + shortMax);
	}
	
	static void intPrint() {
		int intMin = Integer.MIN_VALUE;
		int intMax = Integer.MAX_VALUE;
		System.out.println("minimum of int:"+ intMin + " && maximum of int:" + intMax);
	}
	
	static void longPrint() {
		long longMin = Long.MIN_VALUE;
		long longMax = Long.MAX_VALUE;
		long longValue = 1234567;
		System.out.println("minimum of long:"+ longMin + " && maximum of long:" + longMax);
	}
	
	static void floatPrint() {
		float floatMin = Float.MIN_VALUE;
		float floatMax = Float.MAX_VALUE;
		float floatValue = 1.01f;
		System.out.println("minimum of float:"+ floatMin + " && maximum of float:" + floatMax);
	}
	
	static void doublePrint() {
		double doubleMin = Double.MIN_VALUE;
		double doubleMax = Double.MAX_VALUE;
		double doubleValue = 1.01f;
		System.out.println("minimum of double:"+ doubleMin + " && maximum of double:" + doubleMax);
	}
	
	static void charPrint() {
		char charMin = '\u0000';
		char charMax = '\uffff';
		System.out.println("minimum of char:"+ charMin + " && maximum of char:" + charMax);
	}
	
	
	static void integerLiterals() {
		int decVal = 26;
		int hexVal = 0x1a;
		int binVal = 0b11010;
		System.out.println("decimal: " + decVal + ", hexaDecimal:" +hexVal +", binary:" +binVal);
	}
	
	static void floatPointLiterals() {
		double d1 = 123.4;
		double d2 = 1.234e2;
		float f1 = 123.4f;
		float f2 = 1.234e2f;
		System.out.println("32-bit float literal:" + f1 +" , " + f2 + "; 64-bit double literal:" + d1 + " , " + d2);
	}
	
	static void characterAndStringLiterals() {
		char c = '\u0108';
		char tab = '\t';  				//equels '\u0009'
		char carriageReturn = '\r';  	//equels '\u240D'
		
		
		String lineFeed = "\thello\nworld\u0108";  			
		String doubleQuote = "hello world\"";  		
		String singleQuote = "hello world\'";  		
		String backslash = "hello world\\";			
		String backspace = "hello world\b";
		
		System.out.println(lineFeed);
	}
	
	

}
