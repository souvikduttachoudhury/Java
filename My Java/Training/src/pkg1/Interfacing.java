package pkg1;
interface Animal{
	void set_age();
}
class Camel implements Animal{
	public void set_age(){
		//age=20;
		System.out.println("Inside Camel");
	}
}
class Tiger implements Animal{
	public void set_age(){
		//age=20;
		System.out.println("Inside Tiger");
	}
}
public class Interfacing {
	public static void main(String args[]){
		Animal a=new Tiger();
		a.set_age();
		Animal b=new Camel();
		b.set_age();
	}
}
