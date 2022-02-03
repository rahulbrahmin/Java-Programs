package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter no. of rows:  ");
		int m=sc.nextInt();
		
		System.out.println("Enter no. of columns:  ");
		int n=sc.nextInt();
		
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int c[][]=new int[m][n];
		
		System.out.println("Enter first matrix:  ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter second matrix:  ");
		for(int  i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				b[i][j]=sc.nextInt();
			}
	   }
		
	   System.out.print("first matrix:  ");
	   for(int i=0;i<m;i++) {
		   for(int j=0;j<n;j++) {
			   System.out.print(a[i][j]+" ");
		   }
		   System.out.println();
	   }
	   
	   System.out.println("Second Matrix:  ");
	   for(int i=0;i<m;i++) {
		   for(int j=0;j<n;j++) {
			   System.out.print(b[i][j]+" ");
		   }
		   System.out.println();
	   }
	   
	   for(int i=0;i<m;i++) {
		   for(int j=0;j<n;j++) {
			   c[i][j]=a[i][j]+b[i][j];
		   }
	   }
	   
	   System.out.println("Sum of both matrices are:  ");
	   for(int i=0;i<m;i++) {
		   for(int j=0;j<n;j++) {
			   System.out.print(c[i][j]+" ");
		   }
		   System.out.println();
	   }

   }
}
	
