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
	public static void main(String args[]){
		Child ch=new Child(9); 
		ch.p_method();
		Parent p=new Parent(8);
		p.p_method();
		/*accm cks1=new accm();
   	    cks1.c_method();*/
	}
}
