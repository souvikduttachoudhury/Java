package pkg1;

class Checkaccess{
	 void ckmethod(){
		 System.out.println("Inside package pkg1");
	 }
}

public class accm{
     public static void main(String args[]){
    	 Checkaccess ck=new Checkaccess();
    	 ck.ckmethod();
     }
}

