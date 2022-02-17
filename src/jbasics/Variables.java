package jbasics;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nameVariable = "Wessel";
		System.out.println(nameVariable);
		
		int myNum = 15;
		System.out.println(myNum);
		
		char myChar = 'A';
		System.out.println(myChar);
		
		boolean val1, val2;
		System.out.println("This is my Boolean");
		val1 = true;
		if (val1)
			System.out.println("This is val1" + " " +val1);				
		val2 = false;
		if(val2)
			System.out.println(val2);
		
		System.out.println("This is the last Value" + " " + val2);
		
		float myFloat = (float) 9.99;
		System.out.println(myFloat);
		
		
		
		
		//primitive data types - includes int double bool char
		// non primitive data type - string array class
		
		//Operators
		int sum1 = 100+50;
		int sum2 = sum1 + 250;
		System.out.println(sum1 + " and " + sum2);
		int sum3 = sum1 + sum2;
		System.out.println(sum3);
		
		/*other operators
		 * - substraction
		 * * multiplication
		 * \/ Division
		 */
		
		int sum4 = 100;
		int sum5 = sum4 * 4;
		System.out.println(sum5);
		
		int sum6 = 1000;
		int sum7 = sum6 - 782;
		System.out.println(sum7);
		
		int sum8 = 500;
		int sum9 = sum8 / 4;
		System.out.println(sum9);
		
		//Modus
		//int x = 5;
		//int y = 2;
		//System.out.println(x % y);
		
		//Increment
		//int x = 5;
		//++x;
		//System.out.println(x);
		
		//Decrement
		//int x = 5;
		//--x;
		//System.out.println(x);
		
		//assignment operators
		//int x = 5;
		//x = x + 3;
		//System.out.println(x);
		
		//other assignment operators
		/*=-
		 * \/*
		 * %=
		 */
		
		//Java Comparison operators
		// == Equal to
		// != not equal to
		// > greater than
		// < smaller than
		// >= greater than or equal to
		// <= smaller than or equal to
		
		//int x = 10;
		//int y = 10;
		//System.out.println(x == y);
		
		//Logical operators
		//int x = 5;
		//and //System.out.println(x > 3 && x < 10);
		//or //System.out.println(x > 3 || x < 2);
		//not //System.out.println(!(x > 3 && x < 10));
		
		// the string object
		//String txt = "ABCDEFGHIJKLMNOP";
		//System.out.println("The lenght of the txt string is " + txt.length());
		
		// other string methods toUpperCase and toLowerCase
		//String txt = "Hello World";
		//System.out.println(txt.toUpperCase());
		//System.out.println(txt.toLowerCase());
		
		// Index of
		//String txt = "Please locate where 8 the chat is";
		//System.out.println(txt.indexOf("8"));
		//System.out.println(txt.indexOf("P"));
		//System.out.println(txt.indexOf("e"));
		//System.out.println(txt.indexOf("o"));
		//System.out.println(txt.indexOf("7"));
		
		//String firstName = "John";
		//String lastName = "Doe";
		//int x = 5
		//System.out.println(firstName + " " + lastName);
		
		//System.out.println(firstName.concat(lastName));
		
		// the int will be automatically converted to a string when concatted in this manner
		//System.out.println(firstName + " " + x);
		
		//Special Char
		//String txt = "We are the so-called \"Vikings\" from the north";
		//System.out.println(txt);
		
		//String txt1 = "We are the so-called 'Vikings' from the north";
		//System.out.println(txt1);
		
		//String txt3 = "We are the so-called \\Vikings\\ from the north";
		//System.out.println(txt3);
		
		//String txt4 = "We are the so-called Vikings' from the north";
		//System.out.println(txt4);
		
		//String txt5 = "We are the so-called Vikings \n from the north";
		//System.out.println(txt5);
		
		//String txt6 = "We are the so-called Vikings \t from the north";
		//System.out.println(txt6);
		
		//int x = 10;
		//int y = 10;
		//int z = x + y;
		//System.out.println(z);
		
		//String xx = "10";
		//String yy = "20";
		//String zz = xx + yy;
		//System.out.println(zz);
		
		String s1 = "AutomationProgramS12022";
		System.out.println(s1.substring(2,4));
		System.out.println(s1.substring(5,7));
		
	}

		
			
}
