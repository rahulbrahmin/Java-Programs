package techClass;

import java.util.Arrays;
import java.util.Scanner;

public class EfficientVineet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//            int n = sc.nextInt();
//
//            float a[] = new float[n];
//            for(int i=0 ; i<n ; i++){
//                a[i] = sc.nextFloat();
//            }
//            
//
//            int count = 0;
//            float temp = 0;
//
//            for(int i=0 ; i<n ; i++){
//                if(temp >= 3.0){
//                	temp = 0;
//                	temp += a[i];
//                	count++;
//                }
//                else{
//                	temp += a[i];         	
//                }           
//            }
//            
//            System.out.println(++count);
		
		int n = sc.nextInt();
		
		double a[] = new double[n];
		for(int i=0 ; i<n ; i++) {
			a[i] = sc.nextDouble();
		}
		
		Arrays.sort(a);
		
		int left = 0;
		int right = n-1;
		int count = 0;
		
		while(left <= right) {
			if(left == right) {
				count++;
				break;
			}
			
			if(a[left] + a[right] <= 3.0) {
				left++;
				right--;
				
				count++;
			}else {
				right--;
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}
