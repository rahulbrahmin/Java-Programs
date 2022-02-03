package techClass;

import java.util.*;
import java.util.Scanner;

public class Ipl2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] s = new String[n];
		
		for(int i=0 ; i<n ; i++) {
			s[i] = sc.nextLine();
		}
		
		for(int i=0 ; i<n ; i++) {
			System.out.print(s[i] + " ");
		}
		
		
		int runs[] = new int[n];
		
		for(int i=0 ;  i<n ; i++) {
			int x = s[i].indexOf(' ');
			runs[i] = Integer.valueOf(s[i].substring(x+1));
		}
		
		Arrays.sort(runs);
		int l = 0;
		int r = n-1;
		
		while(l<=r) {
			if(l==r)
				break;
			
			int temp = runs[l];
			runs[l] = runs[r];
			runs[r] = temp;
			
			l++;
			r--;
		}
		
		System.out.println();
		for(int i=0 ; i<n ; i++) {
			System.out.print(runs[i] + " ");
		}
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		
	}

}
