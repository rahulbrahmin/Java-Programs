package exampleCasting;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Inflatable i = new Ballon(); 
//		i.print();
		
		i = new PartyBallon();               // 1 Ok 
		i.print();                         // ballon
		
//		Ballon b = i;                      // 2 Not ok (add cast)
		
		Ballon b = (Ballon) i;                  //3 Ok       
		b.print();                             // partyBallon
		
//		PartyBallon bb = (PartyBallon) new Ballon();     // 4 not ok    
//		bb.print();                 // ballon can't be casted to partballon
		
//		PartyBallon bb2 = i;          // 5 Not ok (Add Cast)
		
//		PartyBallon bb3 = (Ballon) i;    //6 not ok (Change cast to partyballon)
		
		PartyBallon bb4 = (PartyBallon) i;     // 7 Ok   
//		i.print();
		
		i = new Pool();                // 8 Ok 
		i.print();               
		
		b = new Ballon();      // 9     Ok
		b.print();
		
		i = b;                // 10 Ok
		i.print();
		
		List<Integer> ll = new LinkedList<>();
	}

}
