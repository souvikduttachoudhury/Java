package pkg1;
abstract interface Abs{
	 void done();
}
class Child implements Abs{
	public void done(){
		System.out.println("In child class");
		//return 0;
	}
}
public class AbstractImplementation {
	public static void main(String args[]){	
		//final int i=9;
		Child ch1=new Child();
		ch1.done();
		//i++;
	}
}
