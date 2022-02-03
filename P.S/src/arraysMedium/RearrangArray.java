package arraysMedium;

public class RearrangArray {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, -4, -1, 4};
		int n = a.length;
		
		int flag = -1;
		if(a[0] > 1)
			flag = 1;
		else 
			flag = 0;
		
		for(int i=0 ; i<n ; i++) {
			if(i%2 == 0 && a[i] > 0) {
				int neg = i;
			}
			if(i%2 != 0 && a[i] < 0) {
				int pos = i;
			}
		}
	}

}
