package ibm_JUNIT;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Activity1 {
	//Test fixtures
	static ArrayList<String> list;
	
	//Initialize test fixture 
	
	  @BeforeEach

	void setUp() throws Exception{
		list = new ArrayList<String>();
		list.add("alpha");
		list.add("beta");
	

	}
	//Test method to test the insertion operation
	@Test
	public void insertTest() {
		//Assert for size
		assertEquals(2,list.size(),"Wrong Size");
		//Add new element
		list.add(2,"charlie");
		//assert after newly added value 
		assertEquals(3,list.size());
		
		//Assert Individual elements 
		assertEquals("alpha",list.get(0),"Wrong Element");
		assertEquals("beta",list.get(1),"Wrong Element");
		assertEquals("charlie",list.get(2),"Wrong Element");
		
		System.out.println("Test1 Passed");
		
		
	}
	//Test method to test the replace operation
	@Test
	public void replaceTest() {
		list.set(1, "charlie");
		//Assert size of the list 
		assertEquals(2,list.size(),"Wrong Size");
		assertEquals("alpha",list.get(0),"Wrong element");
		assertEquals("charlie",list.get(1),"Wrong element");
		
		System.out.println("Test2 Passed");
		
		
	}

}