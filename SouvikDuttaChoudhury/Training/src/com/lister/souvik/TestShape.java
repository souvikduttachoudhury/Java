package com.lister.souvik;
class Shape{
	String colour="";
	Shape(String colour){
		this.colour=colour;
	}
	void toStrin(){
		System.out.println("The colour of the shape is "+colour);
	}
	double getArea(){
		return 0;
	}
}
class Rectangle extends Shape {
	int length;
	int breadth;
	Rectangle(String c,int l,int b){
		super(c);
		length=l;
		breadth=b;
	}
	void toStrin(){
		super.toString();
		System.out.println("The length of the shape is "+length);
		System.out.println("The breatdth of the shape is "+breadth);
	}
	 double getArea(){
		 double area=length*breadth;
		 return area;
	 }
}
class Triangle extends Shape {
	int base;
	int height;
	Triangle(String c,int b,int h){
		super(c);
		base=b;
		height=h;
	}
	void toStrin(){
		super.toString();
		System.out.println("The base of the shape is "+base);
		System.out.println("The height of the shape is "+height);
	}
	 double getArea(){
		 double area=0.5*base*height;
		 return area;
	 }
}
public class TestShape {
	
}
