package hashcodesAndEquals;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1 = new Pen(10 , "Blue");
		Pen p2 = new Pen(10 , "Blue");
		
		System.out.println(p1.equals(p2));
		
//		p1.desc();
//		p2.desc();
		
		Set<Pen> st = new HashSet<>();
		
		System.out.println(st.add(p1));
		System.out.println(st.add(p2));
		System.out.println(st);
	}

}

class Pen{
	int price;
	String color;
	
	public Pen(int price , String color){
		this.price =  price;
		this.color = color;
	}
	
	void desc() {
		System.out.println("Price:- " + price + "\tColor:- " + color);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Pen that = (Pen) obj;
//		
////		return (this.price == that.price && this.color == that.color);  or
//		return (this.price == that.price && this.color.equals(that.color));
//	}
//	
//	@Override
//	public int hashCode() {
//		return price + color.hashCode();
//	}
	
	// Exception sb mtlb edge cases se bchne ke liye ecllipse se hi bna lo
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	
}
