package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerOfHanoi(3 , 'A' , 'B' , 'C');
	}
	
	static void towerOfHanoi(int n , char src , char hel , char des) {
		if(n==0)
			return;
		
		
		towerOfHanoi(n-1 , src , des , hel);
		System.out.println("Move from " + src + " to " + des);
		towerOfHanoi(n-1 , hel , src , des);
	}
}
