package com.lister.souvik;
import java.util.Scanner;;
class factorial{
	public int calculate(int x){
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
	
}
