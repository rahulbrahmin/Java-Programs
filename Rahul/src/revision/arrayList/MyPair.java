package revision.arrayList;

public class MyPair<X,Y> {
	X x;
	Y y;
	
	MyPair(X x , Y y){
		this.x = x;
		this.y = y;
	}
	
	void getDescription() {
		System.out.println(x+"\t"+y);
		System.out.println();
	}
	
	public static void main(String[] args) {
		MyPair<String , String> m1 = new MyPair("Rahul" , "Rudra");
		MyPair<String , Integer> m2 = new MyPair("Rowdy" , 5);
		
		m1.getDescription();
		m2.getDescription();
	}
}
