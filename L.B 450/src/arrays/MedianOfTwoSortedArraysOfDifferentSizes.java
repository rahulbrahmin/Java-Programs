package arrays;

public class MedianOfTwoSortedArraysOfDifferentSizes {

	public static void main(String[] args) {
		int a1[] = {10, 12, 14, 16, 18, 20};
        int a2[] = {2 , 3 , 5 , 8};
        
//        int c[] = new int[a1.length + a2.length];
//        
//        int i=0; 
//        int j=0;
//        int count = 0;
//        
//        while(i<a1.length || j<a2.length) {
//        	c[count] = Math.min(a1[i], a2[j]);
//        	count++;
//        	
//        	if(a1[i] <= a2[j])
//        		i++;
//        	else
//        		j++;
//        }
//        
//        System.out.println((c[c.length/2] + c[(c.length-1)/2]) / 2);
        
        System.out.println(median(a1 , a2));
        
	}
	
	static double median (int a1[] , int a2[]) {
		if(a2.length < a1.length)
			return median(a2 , a1); 
		
		int n1 = a1.length;
		int n2 = a2.length;
		
		int low = 0;
		int high = n1;
		
		while(low <= high) {
			
			int cut1 = (low + high) >> 1;               // means (low + high) / 2;
		    int cut2 = (n1 + n2 + 1) / 2 - cut1;
		    
		    int left1 = cut1 == 0 ? Integer.MIN_VALUE : a1[cut1 - 1];
		    int left2 = cut2 == 0 ? Integer.MIN_VALUE : a2[cut2 - 1];
		    
		    int right1 = cut1 == n1 ? Integer.MAX_VALUE : a1[cut1];
		    int right2 = cut2 == n2 ? Integer.MAX_VALUE : a2[cut2];
		    
		    if(left1 <= right2 && left2 <= right1) {
		    	if((n1 + n2) % 2 == 0)
		    		return (Math.max(left1, left2) + Math.min(right1, right2)) / 2;
		    	
		    	return Math.max(left1, left2);
		    }
		    else if(left1 > right2) {
		    	high = cut1 - 1;
		    }
		    else {
		    	low = cut1 + 1;
		    }
		}
		
		return 0.0;    // for completition of function
	}
	
}
