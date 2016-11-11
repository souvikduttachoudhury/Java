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
	public static void main(String args[]){
		while(true){
		System.out.println("Enter 1 to add 2 to subtract 3 to multiply and 4 to divide:");
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		int cs=sc.nextInt();
		sc.close();
		switch(cs){
		case 0:
			System.exit(0);
		case 1:
			add();
			break;
		case 2:
			sub();
			break;
		case 3:
			mult();
			break;
		case 4:
			div();
			break;
		default:
			System.out.println("Not a valid option");
		}
		}
	}
}