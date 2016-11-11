import java.util.Scanner;;
class factorial{
	int calculate(int x){
		int fact=1;
		for(int i=1;i<=x;i++){
			fact=fact*i;
		}
		return fact;
	}
	void fibonacci(int first,int second,int n){
		if(n>0){
		int res=first+second;
		System.out.println(res);
		fibonacci(second,res,n-1);
		}
	}
};
public class RunFactorial {
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
    	factorial f=new factorial();
        System.out.println("Enter the number of terms in fibonacci series:");
        int fn=sc.nextInt();
        if(fn>=2){
        	System.out.println("0");
        	System.out.println("1");
        	f.fibonacci(0, 1, fn-2);
        }
        sc.close();
    	while(true){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the number whose factorial is to be counted:");
    	int n=sc1.nextInt();
    	System.out.println(f.calculate(n));
    	sc1.close();
    	}
    }
}