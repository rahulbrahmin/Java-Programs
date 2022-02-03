package arrays.Basic;

//Move	all	the	negative	elements	to	one	side	of	the	array

public class ArrangeNegativePositive {

	public static void main(String[] args) {
		int a[] = {-1 , -3 , 3 , -4 , 21 , 91};
		int n = a.length;
		
		int temp = -1;
		
		for(int i=0 ; i<n ; i++) {
			if(a[i] > 0 ) {
				temp = i;
				break;
			}
		}
		
		for(int i=0 ; i<n ; i++) {
			if(a[i] < 0 ) {
				int x = a[i];
				a[i] = a[temp];
				a[temp] = x;
				temp = i;
			}
		}
		
		for(int i=0 ; i<n ; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
