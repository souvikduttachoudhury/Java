package com.lister.souvik;
//import pkg1.accm;

class Parent{
	int id;
	Parent(){
		System.out.println("empty");
	}
	Parent(int i){
		id=i;
	}
	void p_method(){
		System.out.println("Inside parent method");
	}
}
class Child extends Parent{
	Child(int i){
		//super(i);
	}
	void p_method(){
		System.out.println("Inside child method");
	}
}
public class Inheritence {
	
}
