package classes;

import java.awt.List;
import java.util.ArrayList;

public class ALtest {
	

	public static void main(String[] args) {

	ArrayList aL = new ArrayList();
	
	Rectangle rec1 = new Rectangle(1,1);
	Rectangle rec2 = new Rectangle(2,2);
	Rectangle rec3 = new Rectangle(3,3);
	Rectangle rec4 = new Rectangle(4,4);
	
	aL.add(rec1);
	aL.add(rec2);
	aL.add(rec3);
	aL.add(rec4);
	aL.add(0,rec3);


	
}
}