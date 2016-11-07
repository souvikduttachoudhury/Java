import java.util.*;
public class ArrayDuplicates {
	public static void main(String args[]){
		int map[]=new int[100000];
		int arr[]=new int[100];
		for(int i=0;i<100000;i++){
			map[i]=0;
		}
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		System.out.println("Enter the size of the array:");
		int x=sc.nextInt();
		System.out.println("Enter the elements of the array");
		for(int i=0;i<100;i++){
			int temp=sc.nextInt();
			if(temp<0 || temp>=100000)
				continue;
			else{
				arr[i]=temp;
				map[arr[i]]++;
			}
		}
		for(int i=0;i<100000;i++){
			if(map[i]==1){
				System.out.println(i);
			}
		}
	}
}
