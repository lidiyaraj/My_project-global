package project2;

import java.util.Scanner;

public class Scanner_1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string=");

		String s=in.nextLine();
		System.out.println("Welcome hi"+s);
		
		System.out.println("Enter the integer value=");
		
		int a=in.nextInt();
		System.out.println("34 "+a);
		
		System.out.println("Enter the float value=");
		
		float b=in.nextFloat();
		System.out.println("12.5"+b);
		
		

	}

}
