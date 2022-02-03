package arrays;

import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter total no. of students:  ");
		int n=sc.nextInt();
		System.out.println("Enter marks of each students:  ");
		int marks[] = new int[n]; 
		for(int i=0;i<n;i++) {
		 marks[i] = sc.nextInt();
		}
		
		int s=0;
		for(int j=0;j<n;j++) {
			s+=marks[j];
		}
		System.out.println("Average of marks of all students are:  "+s/n);
	}

}
