package basics;

import java.util.Scanner;

	public class InputAndOuputExamples{

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // 1. Input String
	        String str = sc.nextLine();
	        System.out.println(str);

	        // 2. Input Floating Number
	        float f = sc.nextFloat();
	        System.out.println(f);

	        // 3. Print Statement
	        System.out.println("Hello Java");

	        // 4. Print Without New Line
	        System.out.print("Hello ");
	        System.out.print("World");

	        // 5. Print With Space
	        System.out.println("Hello" + " " + "Java");

	        // 6. Print With Separator
	        System.out.println("Hello" + "-" + "Java");

	        // 7. Print Without Space
	        System.out.println("Hello"+"Java");

	        sc.close();
	    }
	}
