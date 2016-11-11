package com.lister.souvik;
import java.util.Scanner;


public class SwitchCase {
	static void add(){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		System.out.println("Enter the two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+b);
		sc.close();
	}
	static void sub(){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		System.out.println("Enter the two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a-b);
		sc.close();
	}
	static void mult(){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		System.out.println("Enter the two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a*b);
		sc.close();
	}
	static void div(){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		System.out.println("Enter the two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(b!=0){
		System.out.println(a/b);
		}
		else{
			System.out.println("Division not possible");
		}
		sc.close();
	}
	
	
}
