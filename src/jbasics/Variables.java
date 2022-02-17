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
		
		//String s1 = "AutomationProgramS12022";
		//String s2 = "2022-02-08";
		//System.out.println(s1.substring(2,4));
		//System.out.println(s1.substring(5,7));
		//System.out.println(s1.substring(0,4));
		//System.out.println(s1.substring(10));
		
		//int randomNum = (int)(Math.random()*101);
		//System.out.println(randomNum);
		
		//Boolean Values
		//boolean isJavaFun = true;
		//boolean isFishTasty = false;
		//System.out.println(isJavaFun);
		//System.out.println(isFishTasty);
		
		
		//int x = 10;
		//int y = 9;
		//System.out.println(x > y);
		
		//System.out.println(8 > 10);
		
		//System.out.println(x == 10);
		
		// use if to specify a block of code to be executed, if a specific condition is true
		// use else to specify a blck of code to be executed, if the same condition is false
		// use else if to specify a new condition to test, if the first condition is false
		// use switch to specify many alternative blocks of code to be executed 
		
		//if (20 > 18) {
			//System.out.println("20 is greater than 18");
		//}
		
		
		//int x = 20;
		//int y = 18;
		//if (x > y) {
		//	System.out.println("20 is greater than 18");
		//}
		
		//int time1 = 20;
		//if (time1 < 18) {
			//System.out.println("Good day");
		//} else {	
		// System.out.println("Good evening");
		//}
		
		
		//int time1 = 22;
		//if (time1 < 10) {
			//System.out.println("Good Morning");
		//} else if (time1 < 20) {	
		 //System.out.println("Good day");
		//} else { 
			//System.out.println("Good Evening");
		//}
		
//		int time1 =25;
//		if (time1 < 13) {
//			System.out.println("You are a child");
//		} else if (time1 >= 13 && time1 < 21) {	
//		 System.out.println("You are a teen");
//		} else { 
//			System.out.println("You are an adult");
//		}
		
		
//		int time1 = 20;
//		String result1 = (time1 < 18) ? "good day." : "Good evening";
//		System.out.println(result1);
		
//		int day1 = 6;
//		switch (day1) {
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saterday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		default:
//			System.out.println("Error:There is no such day of the week");
	
		// using a switch statement
		// day is 6 then print Saturday
		// day 7 thing print it's Sunday
		// otherwise print "Looking forward to the Weekend"
		
//			int day1 = 2;
//			switch (day1) {
//			case 6:
//				System.out.println("It's Saterday");
//				break;
//			case 7:
//				System.out.println("It's Sunday");
//				break;
//			default:
//				System.out.println("Looking Forward To The Weekend");
			
		//while loops
//		int i = 0;
//		while (i < 5) {
//			System.out.println(i);
//			i++;
//	}
		
		//do/while
//		int i = 0;
//			do {
//				System.out.println(i);
//				i++;
//			}
//		
//		while (i < 5);
		
		//for loop
		// template
		//for (statement 1; statement 2; statement 3) {
		// 		code block
		//}
		
		// statement 1 is executed on time before the execution of the code block
		// statement 2 defines the condition for the executing the code block
		// statement 3 is executed every time after the code block has been executed
		
//		for (int i =0; i < 5; i++) {
//			System.out.println(i);
//		}
//		
		
//		for (int i =0; i<=10; i=i+2) {
//			System.out.println(i);
//		}
//	
		
//		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//		for (String i : cars) {
//			System.out.println(i);
//		}
		
//		String[] fruit = {"Banana", "Grape", "Watermelon", "Kiwi", "Orange"};
//		for (String i : fruit) {
//			System.out.println("The fruit is" + " " + (i));
//			
//		}	
		
		String[] name = {"Dee", "Peet", "Chris", "Lucy", "Arno"};
		for (String i : name) {
		System.out.println("The is my friend" + " " + (i));
		
		}
		
		String hello = "Hello";
		String name1 = "Wessel";
		System.out.println(hello);
		System.out.println(name1);
		
		
		
	}

		
			
}
