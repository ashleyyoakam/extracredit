package classes;
import java.util.*;
public class HStest {

	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle(1,1);
		Rectangle rec2 = new Rectangle(2,2);
		Rectangle rec3 = new Rectangle(3,3);
		Rectangle rec4 = new Rectangle(4,4);


		Set HS = new HashSet();
		
		HS.add(rec1);
		HS.add(rec2);
		HS.add(rec3);
		HS.add(rec4);
		HS.add(rec4);
		
		System.out.println(HS.size());
		
		HS.remove(rec4);
		
		System.out.println(HS.size());
		
	}
	
}
