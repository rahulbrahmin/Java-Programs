package chegg;

public class DriverSortingClass {

	public static void main(String[] args) {
		Sorting<Integer> s1 = new Sorting<>();
		
        Integer[] arr = {5 , 85 , 23 , 89 , 65 , 75 , 25 , 73};
    	
    	System.out.print("Integer array before sorting:  ");
    	for(int i=0 ; i<arr.length ; i++) {
    		System.out.print(arr[i] + " ");
    	}
    	
    	s1.selectionSort(arr);                            // Selection sort called
    	
    	System.out.println();
    	System.out.print("Integer array after sorting:   ");
    	for(int i=0 ; i<arr.length ; i++) {
    		System.out.print(arr[i] + " ");
    	}
    	
    	System.out.println();
    	System.out.println();
    	
    	Sorting<String> s2 = new Sorting<>();
    	
    	String[] str = {"C" , "I" , "J" , "A" , "L" , "Z" , "H" , "X"};
    	
    	System.out.print("String array before sorting:  ");
    	for(int i=0 ; i<str.length ; i++) {
    		System.out.print(str[i] + " ");
    	}
    	
    	s2.insertionSort(str);                                  // Insertion sort called
    	
    	System.out.println();
    	System.out.print("String array after sorting:   ");
    	for(int i=0 ; i<str.length ; i++) {
    		System.out.print(str[i] + " ");
    	}
		
	}

}
