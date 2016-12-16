package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classes.Rectangle;

public class test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//testing HS
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
		assertTrue(HS.size()==5);
		HS.remove(rec4);
		assertTrue(HS.size()==4);
	}

	@Test
	public void test1() {
		//testing ts
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
		
		TreeSet<Rectangle> ts = new TreeSet<>(HS);
		assertTrue(rec1.area==ts.first().area);
	}
	
	@Test
	public void test3() {
		//testing HM
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
		assertTrue(HM.size()==5);
		HM.remove(5);
		assertTrue(HM.size()==4);
		
		
	}
	@Test
	public void test4() {
		//testing tM
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

		TreeMap tm =new TreeMap<>(HM); 
		Entry r = tm.firstEntry();
		assertTrue(((Rectangle) r).getArea()==rec1.getArea());
		
	}
	
	@Test
	public void test5() {
		//testing aL

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
		int originalsize = aL.size();
		aL.remove(0);
		assertTrue(originalsize-1==aL.size());
		
	}
	@Test
	public void test6() {
		//testing LL

		ArrayList aL = new ArrayList();
		
		Rectangle rec1 = new Rectangle(1,1);
		Rectangle rec2 = new Rectangle(2,2);
		Rectangle rec3 = new Rectangle(3,3);
		Rectangle rec4 = new Rectangle(4,4);
		
		aL.add(rec1);
		aL.add(rec2);
		aL.add(rec3);
		aL.add(rec4);
		
		LinkedList<Rectangle> linkedList = new LinkedList<>(aL);
		linkedList.add(2,rec3);
		int size1 = linkedList.size();
		linkedList.remove(4);
		assertTrue(size1-1==linkedList.size());
		
	}
}
