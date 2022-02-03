/* Required solution of this problem */

package chegg;

public class SndwitchStandDriver {

	public static void main(String[] args) {
		System.out.println("Total number of sandwitches sold before object creation = "
	    + SandwitchStand.getNumberSandwitchSoldAllStands());
		
		SandwitchStand obj1 = new SandwitchStand(1234);
		
		System.out.println("Total number of sandwitches sold at stand " + obj1.getStandId() +
		 " before any sells = " + obj1.getNumberSandwitchSoldAtStand());
		
		obj1.sellSandwitch(2);
		
		System.out.println("Total number of sandwitches sold at stand " + obj1.getStandId() +
		 " = " + obj1.getNumberSandwitchSoldAtStand());
		
		
		SandwitchStand obj2 = new SandwitchStand(5678);
		obj2.sellSandwitch(3);
		
		System.out.println("Total number of sandwitches sold at stand " + obj2.getStandId() +
		" = " + obj2.getNumberSandwitchSoldAtStand());
		
		
		SandwitchStand obj3 = new SandwitchStand(5234);
		obj3.sellSandwitch(1);
		
		System.out.println("Total number of sandwitches sold at stand " + obj3.getStandId() +
		" = " + obj3.getNumberSandwitchSoldAtStand());
		
		System.out.println("Total number of sandwitch sold at all stands = "
		+ SandwitchStand.getNumberSandwitchSoldAllStands());
	}
	
	static class SandwitchStand{
		private static int totalSandwitchSoldAllStands;      // private static variable , it belongs to whole class not to any object , it contains total number of sandwitches sold on all stand. 
		private int totalSandwitchSoldAtStand;               // it contains total number of sandwitches sold on each stand.
		private int standId;                                 // it contains standId of each objecct.
		
		public SandwitchStand(int standId) {                 // constructor
			this.standId = standId;
		}
		
		public int getStandId() {                            // method to return standId
			return standId;
		}
		
		public int getNumberSandwitchSoldAtStand() {          // method to return number of sandwitches sold on each stand.
			return totalSandwitchSoldAtStand;
		}
		
		public void sellSandwitch(int numberofSandwitches) {           // method to sell sandwitches on each stand.
			totalSandwitchSoldAtStand = 0;
			totalSandwitchSoldAllStands += numberofSandwitches;
			totalSandwitchSoldAtStand = numberofSandwitches;
		}
		
		
		public static int getNumberSandwitchSoldAllStands() {            // it returns total number of sandwitches sold on each stands. since it is static method it belongs to whole class.
			return totalSandwitchSoldAllStands;
		}
	}

}
