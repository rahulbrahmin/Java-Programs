package chegg;

public class Vector {
	
	int arr[] = new int[10];                              // In java all arrays are dynamically allocated
	int index;
	int left;                                             // to store left
	int right;                                            // to store right
	// we didn't need seperate variables for info as it can be managed from array itself.
	
	void add(int info , int left , int right) {
		this.arr[index] = info;
		this.left = left;
		this.right = right;
		index++;
	}
	
	void print() {
		System.out.println("Index \t Info \t Left \t Right");
		for(int i=0 ; i<index ; i++) {
			System.out.print(i + " \t "+this.arr[i] + " \t " + this.left + " \t" + this.right);
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(13, 4, 2);
		v.add(31, 6, -1);
		v.add(25, 7, 1);
		v.add(12, -1, -1);
		v.add(10, 5, -3);
		v.add(2, -1, -1);
		v.add(29, -1, -1);
		v.add(20, -1, -1);
		
		v.print();
	}

}
