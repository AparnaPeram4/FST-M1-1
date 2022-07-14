package activities;
import java.util.HashSet;


public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		//Add Elements to hash set
		
		hs.add("S");
		hs.add("U");
		hs.add("J");
		hs.add("I");
		hs.add("T");
		hs.add("H");
		
		//print hashset
		
		System.out.println(" Hashset :"+hs);
		
		//print the size of it 
		
		System.out.println("Size of the hashset is " +hs.size());
		
		//Remove an element from hashset
		
		System.out.println("Remove H from Hasset  :" +hs.remove("H"));
		
		// remove Z which is not present in has set 
		
		if(hs.remove("Z")) { 
			System.out.println("Z is removed from the set");
		}
		else{
			System.out.println("Z is not present in the set");
		}
		
		//Search for an element in the set 
		
		System.out.println("Checking if X is present : "+hs.contains("X"));
		
		//Updated Hashset
		
		System.out.println("Updated Hasset:"+hs);
		}
		
	}

