package chegg;

//parent class Cuboid
class Cuboid{      
	// variables to store dimensions
	int length;
	int height;
	int width;
	int surfaceArea;
	
	// required methods
	void setLength(int x) {
		this.length = x;
	}
	
	void setWidth(int y) {
		this.width = y;
	}
	
	void setHeight(int z) {
		this.height = z;
	}
	
	void displayCalculatedSurfaceArea() {
		surfaceArea = (2*(length*width) + 2*(width*height) + 2*(height*length));
		
		System.out.println(surfaceArea);
	}
}

//child class Cube
// we could have simply implemented this class using only one variable but as per demand of program
//  methods are overridden and overloaded 
class Cube extends Cuboid{
	//Required overridden variables 
	int length;
	int height;
	int width;
	int surfaceArea;
	
	//Required overridden methods
	void setLength(int x) {
		this.length = x;
	}
	
	void setWidth(int y) {
		this.width = y;
	}
	
	void setHeight(int z) {
		this.height = z;
	}
	
	// Required overloaded method to calculate surface area of cube
	void displayCalculatedSurfaceArea() {
		surfaceArea = 6*(length*length);
		
		System.out.println(surfaceArea);
	}
}

// Driver class to run program
public class MainClassCuboid {

	// main method to run entire program
	public static void main(String[] args) {
		//object of Cuboid class
		Cuboid cuboid = new Cuboid();                            
		
		cuboid.setLength(12);
		cuboid.setWidth(6);
		cuboid.setHeight(4);
		
		System.out.print("Surface area of guven Cuboid is: ");
		cuboid.displayCalculatedSurfaceArea();
		
		//Object of Cube class
		Cube cube = new Cube();
		
		//Since all dimensions of cube are same , we have taken same value for length , width and height.
		cube.setLength(5);
		cube.setHeight(5);
		cube.setWidth(5);
		
		// called overloaded method
		System.out.print("Surface area of guven Cube is: ");
		cube.displayCalculatedSurfaceArea();                          
	}

}
