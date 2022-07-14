package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		//Set the Hashmap
		
		HashMap<Integer,String> hash_test = new HashMap<Integer,String>();
		hash_test.put(1, "Red");
		hash_test.put(2, "Green");
		hash_test.put(3, "Blue");
		hash_test.put(4, "White");
		hash_test.put(5, "Orange");
		
		//Print the Hasmap
		
		System.out.println("Original map :"+hash_test);
		
		//Remove one colour and print
		
		hash_test.remove(1);
		
		System.out.println("Hash map after removing red Colour from the hash map :" +hash_test);
		
		//check if Green exists in the hashmap
		
		if(hash_test.containsValue("Green")) {
			System.out.println("Green colour exists in the map");
		}
		else {
			System.out.println("Green Colour does not exist in the map");
		}
		
		//Print the latest size of hashmap
		
		System.out.println("Resized hashmap :" +hash_test.size());
		
		
		
	}

}