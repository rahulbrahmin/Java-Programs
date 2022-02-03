package string;

public class Split0And1 {

	public static void main(String[] args) {
		String s = "0100110101";
		
		int count0 = 0;
		int count1 = 0;
		
		boolean flag = false;
		int count = 0;
		
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(i) == '0')
				count0++;
			else if(s.charAt(i) == '1')
				count1++;
			
			if(count0 == count1) {
				flag = true;;
				
				count++;
				
//				count0 = 0;
//				count1 = 0;
			}
		}
		
		if(flag)
			System.out.println(count);
		else
			System.out.println(-1);
	}

}
