package com.lister.souvik;
import java.util.Scanner;
public class ArrayInit {
    public static void main(String args[]){ 
	int arr[][]=new int[2][3];
	Scanner sc=new Scanner(System.in);
     for(int i=0;i<2;i++){
    	 for(int j=0;j<3;j++){
    		 System.out.println("enter a new element:");
    		 arr[i][j]=sc.nextInt();
    	 }
     }
     System.out.println("The array looks like :");
     for(int i=0;i<2;i++){
    	 System.out.println();
    	 for(int j=0;j<3;j++){
    		 System.out.print(arr[i][j]+"  ");
    		 //arr[i][j]=sc.nextInt();
    	 }
     }
     sc.close();
    }
}
