package com.lister.souvik;

public class Str_manip {
	public static void main(String args[]){
		String a="Hello";
		String b="Hello";
		String c=new String("Hello");
		String d=new String("Hello");
		if(a==b){
			System.out.println("1st condition true");
		}
		if(a.equals(c)){
			System.out.println("2nd condition true");
		}
		if(a==c){
			System.out.println("3rd condition true");
		}
		if(d==c){
			System.out.println("4th condition true");
		}
	}
}
