package basics;

import java.util.Scanner;

public class TypeCastandDoubleIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int n = Integer.parseInt(num);
		System.out.println(n * 2);
		sc.close();
	}

}

output:
6
12

