package classes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HMtest {

	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle(1,1);
		Rectangle rec2 = new Rectangle(2,2);
		Rectangle rec3 = new Rectangle(3,3);
		Rectangle rec4 = new Rectangle(4,4);


		HashMap HM = new HashMap();
		HM.put(1, rec1);
		HM.put(2, rec2);
		HM.put(3, rec3);
		HM.put(4, rec4);
		HM.put(5, rec1);

		System.out.println(HM.size());

		HM.remove(5);
		
		System.out.println(HM.size());

}}
