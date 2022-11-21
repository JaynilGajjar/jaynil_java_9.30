/*
 * 
 * For Loop
 * 
 * for(initialization;condition;incre/decre)
 * {
 * 		body of the loop;
 * }
 * 
 * */

package com.fundamental;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N : ");
		n=sc.nextInt();
		
		for(i=n;i>=1;i--)
		{
			sum=sum+i;
		}
		System.out.println("Sum : "+sum);
	}
}
