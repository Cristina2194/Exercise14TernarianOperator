package com.execise14ternarianoperator;

import java.util.Scanner;

public class Ternarian 
{
	public static void main (String[] args []) {
	
		int num1=0;
		String msg= "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give a number: ");
		
		num1 = input.nextInt();
		
	//(Evaluation)? true:False;
	System.out.println(num1>5?"great":"lower");
		
	msg = (num1>5)?"Number greater that 5 ": "number lower than 5";
	
	//num1>5?msg";:System.out.println("Number less than 5")
	}
}
