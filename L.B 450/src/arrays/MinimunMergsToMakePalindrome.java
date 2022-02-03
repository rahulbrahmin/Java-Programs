package arrays;

public class MinimunMergsToMakePalindrome {

	public static void main(String[] args) {
		int a[] = {11, 14, 15, 99 , 11};
		int n = a.length;
		
		int i=0 , j = n-1;
		
		int count = 0;
		
		while(i<j) {
			if(a[i] < a[j]) {
				a[i+1] = a[i+1] + a[i];
				i++;
				count++;
			}
			
			else if(a[j] < a[i]) {
				a[j-1] = a[j-1] + a[j];
				j--;
				count++;
			}
			
			else{
				i++;
				j--;
			}
		}
		
		System.out.println(count);
	}

}
