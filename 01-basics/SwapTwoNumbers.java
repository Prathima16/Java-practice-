package basics;

import java.util.Scanner;
public class SwapTwoNumbers {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Write Code to Swap
        
    a=a+b;
    b=a-b;
    a=a-b;
        System.out.println(a + " " + b);
        
        sc.close();
	}

}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
        int a = sc.nextInt();
        
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        
        int temp = a;
        a=b;
        b=temp;
        
        System.out.println("After swapping: " + a + " " + b);
        sc.close();
        
	}
}
        
