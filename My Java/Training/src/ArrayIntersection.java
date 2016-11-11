import java.util.Scanner;


public class ArrayIntersection {
   static int smallerOf(int a,int b){
	   if(a>b){
		   return b;
	   }
	   return a;
   }
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   sc.useDelimiter(System.getProperty("line.separator"));
	   System.out.println("Enter the sizes of the arrays:");
	   int n1=sc.nextInt();
	   int n2=sc.nextInt();
	   int n3=smallerOf(n1,n2);
	   int arr1[]=new int[n1];
	   int arr2[]=new int[n2];
	   int arr3[]=new int[n3];
	   int ck[]=new int[10000];
	   System.out.println("Enter the elements in the first array:");
	   for(int i=0;i<n1;i++){
		   arr1[i]=sc.nextInt();
	   }
	   System.out.println("Enter the elements in the second array:");
	   for(int i=0;i<n2;i++){
		   arr2[i]=sc.nextInt();
	   }
	   for(int i=0;i<10000;i++){
		   ck[i]=0;
	   }
	   int mrk=0;
	   for(int i=0;i<n1;i++){
		   for(int j=0;j<n2;j++){
			   if(arr1[i]==arr2[j] && ck[arr1[i]]==0){
				   arr3[mrk++]=arr1[i];
				   ck[arr1[i]]++;
				   break;
			   }
		   }
	   }
	   for(int i=0;i<mrk;i++){
		   System.out.print(arr3[i]+" , ");
	   }
	   sc.close();
   }
}
