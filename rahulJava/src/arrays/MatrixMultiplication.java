package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

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
		
	   System.out.println("first matrix:  ");
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
	   int sum;
	   for(int i=0;i<m;i++) {
		   for(int j=0;j<n;j++) {
			   sum=0;
			   for(int k=0;k<n;k++) {
				   sum=sum+a[i][k]*b[k][j];
				   c[i][j]=sum;
			   }
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
