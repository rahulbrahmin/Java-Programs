package nestedFor;

public class Pattern2 {

	public static void main(String[] args) {
		int x=1;
		for(int i=1;i<=4;i++) {
			int k=1;
			for(int j=1;j<=7;j++) {
					if(j>=5-i&&j<=3+i && k==1) {
						System.out.print(x+++" ");
						k=0;
					}
					else {
						System.out.print("  ");
						k=1;	
					}
			}
		
			System.out.println();
		}
	}

}
