package chegg;

/**
 * This is driver class to test methods of ArrayBag
 * @author RUDRAMANI DUBEY
 *
 */
public class DriverArrayBag {

	// driver / main method
	public static void main(String[] args) {
		ArrayBag<Integer> ar = new ArrayBag<>(10);
		
		System.out.println("Is Array bag empty?  " + ar.isEmpty());
		
		System.out.println("Is 50 added to array bag?  " + ar.add(50));
		ar.add(65);
		ar.add(85);
		ar.add(32);
		ar.add(50);
		ar.add(77);
		
		System.out.println("Is Array bag empty?  " + ar.isEmpty());
		System.out.println();
		
		System.out.println("Size of array bag:  " + ar.getCurrentSize());
		System.out.println("Removed Item from array bag:  " + ar.remove(2));
		System.out.println("Size of array bag:  " + ar.getCurrentSize());
		
		System.out.println("Frequency of 50 in array bag:  " + ar.getFrequencyOf(50));
		System.out.println("Checking if array bag contains 100 or not:  " + ar.contains(100));
		
		ar.clear();
		
		System.out.println("Size of array bag:  " + ar.getCurrentSize());
	}

}
