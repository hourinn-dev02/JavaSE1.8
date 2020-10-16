package cn.oracle.tutorials.languageBasics.variables;

public class Variables {
	
	//If your variable stores a constant value, such as static final int NUM_GEARS = 6
	//the convention,capitalizing every letter and separating subsequent words with the underscore character. 
	//By convention, the underscore character is never used elsewhere.
	static int NUM_GEARS = 6;
	
	public static void main(String[] args) {
		// A variable's name can be any legal identifier — an unlimited-length sequence of Unicode letters and digits
		String _你好 = "hello";
		String $ = "dollar";
		System.out.println(_你好);
		System.out.println($);
	}
}
