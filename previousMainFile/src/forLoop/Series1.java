package forLoop;

import java.util.Scanner;;

public class Series1 {

	public static void main(String[] args) {
		System.out.println("Enter last no of Series:  ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		float S=0;
		for(float i=1;i<=n;i++) {
			if(i%2==0) {
				S-=1/i;
			}
			else
			    S+=1/i;
		}
		System.out.println("Sum of given series is: "+ S);

	}

}
