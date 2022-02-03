package nestedFor;

//import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
	//	Scanner sc= new Scanner(System.in);
//		System.out.println("Enter total no. of rows");
//		int m=sc.nextInt();
//		System.out.println("Enter total no. of columns:  ");
//		int n= sc.nextInt();
//		System.out.println();
		int k=0;
		for(int i=1;i<=7;i++) {
			
			if (i<=4)
			k = k++;
			else
			k = k--;
			
			for(int j=1;j<=4;j++) {
				if(j<=k) {
					System.out.println("* ");
				}
				else {
					System.out.println("  ");
			}}
		}
	}

}
