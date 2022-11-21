package com.fundamental;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int a,b,c,d;
		String choice;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("******************************");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.println("******************************");
			System.out.print("Enter Your Choice : ");
			d=sc.nextInt();
			System.out.println("******************************");
			System.out.print("Enter A:");
			a=sc.nextInt();
			System.out.print("Enter B:");
			b=sc.nextInt();
			System.out.println("******************************");
			switch(d)
			{
				case 1:
					c=a+b;
					System.out.println("Addition : "+c);
					break;
				case 2:
					c=a-b;
					System.out.println("Subtraction : "+c);
					break;
				case 3:
					c=a*b;
					System.out.println("Multiplication : "+c);
					break;
				case 4:
					c=a/b;
					System.out.println("Division : "+c);
					break;
				case 5:
					break;
				default:
					System.out.println("Invalid Choice");
					break;
			}
			System.out.println("******************************");
			System.out.print("Do You Want To Continue?(yes/no) : ");
			choice=sc.next();
			System.out.println("******************************");
		}while(choice.equals("yes"));
		
	}
}
