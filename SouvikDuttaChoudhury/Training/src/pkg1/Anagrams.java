package pkg1;

import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x,y;
		String a; String b;
		System.out.println("Enter the strings:");
		Scanner s = new Scanner(System.in);
		a=s.next(); b=s.next();
		s.close();
if (a.length()!=b.length()){
	System.out.println("Not anagrams");
}
else{	
		if (subset(a,b)==1)
		if (subset (b,a)==1)
			System.out.println("Anagrams");
}	//else closes
}	
static	int in (char a,String S){
		int flag=0;
		char[] s1= S.toCharArray(); 
		for (int i=0;i<s1.length;i++){
		if (a==s1[i]){
			flag=1;
			break;
			}
		}	//for closes
		return flag;
	}	//in closes

static int subset (String a,String b){
	int flaga=1;
	char[] s1= a.toCharArray();
	for (int i=0;i<s1.length;i++){
		if (in(s1[i],b)==1)
		continue;
		else{
			System.out.println("Not anagrams");
			flaga=0;
			break;
		}	//else closes
	}	//for closes
	return flaga;

}	//subset closes
}	//Anagrams closes

