package recursionNew;

public class CountAndSay {

	public static void main(String[] args) {
		String s = "33222511";
		
//		System.out.println(count(s));
//		
//		System.out.println(count("4"));
//		
//		String ans = "";
//		
//		System.out.println(countAndSay(1 , ans , 1));
//		System.out.println(ans);
		
		int n = 4;
		System.out.println(say(4));
	}
	
	static String say(int n) {
        String temp = "";
        
        String ans = "";
        
        ans = countAndSay(1 , "" , n);
        
        return ans;
	}
	
	static String countAndSay(int x , String ans , int n) {
		if(x == 1)
			ans = "1";
		
		if(x == n)
			return ans;
		
		ans = count(ans);
		
		return countAndSay(x+1 , ans , n);
	}
	
	static String count(String s) {
		String temp = "";
		
		for(int i=0 ; i<s.length() ; i++) {
			int count = 1;
			int ind = i;
			while(ind < s.length()-1 && s.charAt(ind) == s.charAt(ind+1)) {
				count++;
				ind++;
			}
			temp += count;
			temp += s.charAt(i);
			
			i = ind;
		}
		
		return temp;
	}
}
