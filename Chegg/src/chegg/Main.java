package chegg;

public class Main {

	public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
		
        System.out.print("Dj:  ");
        float a = (float) 844.6510;
        
        System.out.printf("%2.2f " , a);
        
		Shape a1 = factory.createShape(ShapeType.SQUARE, 2);
		a1.draw();
		
		Shape a2 = factory.createShape(ShapeType.CIRCLE, 2);
		a2.draw();
	}

}


enum ShapeType {SQUARE , CIRCLE;}
abstract class Shape {
	
	public abstract double getArea();
	
	public void draw() {
		System.out.println(String.format("Area of %s is %.2f",getClass().getName() ,getArea()));
	}
}

class Square extends Shape{
	private int side_length;
	
	Square(int side_length){
		this.side_length = side_length;
	}
	
	public double getArea() {
		return side_length * side_length;
	}
}


class Circle extends Shape{
	private int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	public double getArea() {
		return (3.14 * (radius * radius));
	}
}


class ShapeFactory{
	Shape createShape(ShapeType shapeType , int value) {
		if(shapeType == ShapeType.SQUARE) {
			Square s = new Square(value);
			
			return s;
		}else if(shapeType == ShapeType.CIRCLE){
			Circle c = new Circle(value);
			
			return c;
		}else {
			return null;
		}
	}
}