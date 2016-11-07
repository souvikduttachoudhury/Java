package pkg1;

import java.util.Scanner;

class Student{
	private String name;
	private int age;
	private String dept;
	public void setAge(int age){
		this.age=age;
		//this.name=name;
		//this.dept=dept;
	}
	public void setName(String name){
		//this.age=age;
		this.name=name;
		//this.dept=dept;
	}
	public void setDept(String dept){
		//this.age=age;
		//this.name=name;
		this.dept=dept;
	}
	public void getAge(){
		//System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		//System.out.println("Department : "+dept);
	}
	public void getName(){
		System.out.println("Name : "+name);
		//System.out.println("Age : "+age);
		//System.out.println("Department : "+dept);
	}
	public void getDept(){
		//System.out.println("Name : "+name);
		//System.out.println("Age : "+age);
		System.out.println("Department : "+dept);
	}
}
public class AccesVariables {
     public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
  	    sc.useDelimiter(System.getProperty("line.separator")); 
    	Student s1=new Student();
    	System.out.println("Enter the name age and department of the student :");
    	String n=sc.next();
    	int a=sc.nextInt();
    	String d=sc.next();
    	s1.setName(n);
    	s1.setAge(a);
    	s1.setDept(d);
    	s1.getName();
    	s1.getAge();
    	s1.getDept();
    	sc.close();
     }
}
