package classes;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TMtest {


	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle(1,1);
		Rectangle rec2 = new Rectangle(2,2);
		Rectangle rec3 = new Rectangle(3,3);
		Rectangle rec4 = new Rectangle(4,4);


		HashMap HM = new HashMap();
		HM.put(1, rec1.getArea());
		HM.put(2, rec2.getArea());
		HM.put(3, rec3.getArea());
		HM.put(4, rec4.getArea());
		HM.put(5, rec1.getArea());

		Map tm =new TreeMap(HM); 
		

 
}
}