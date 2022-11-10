package example;

import java.util.ArrayList;

public class ArrayList {
	
	public static void main(String[] args) {
	
		/*
		 * ArrayList = resizable array that you can read, write, delete, update the elements
		 * inside your arrays.
		 * 
		 * INSERT = identifier.add(value depends on your array list data type).
		 * DELETE = identifier.remove(index) remove specific element
		 *        = identifier.clear() clear the array list
		 * UPDATE = identifier.set(index, value) replace the element
		 * 
		 * 
		 */
		
		ArrayList<String> names = new ArrayList<String>();
		
		//Add Elements to Array
		names.add("Joschua");
		names.add("Chua");
		names.add("Joswa");
		
		//Access the Element by index
		System.out.println(names.get(0)); //output : Jokwa
		
		//Get the array size.
		System.out.println(names.size()); //output : 3
		
		//Update the array
		names.set(2, "Jokwa"); //The Joswa will become Jokwa
		System.out.println(names.get(2)); //output : Jokwa
		
		//Remove specific elements
		names.remove(0);
		System.out.println(names.get(0)); //we remove the index 0 which is Joschua then Chua will become the index 0
		
		//Clear the array
		names.clear();
		System.out.println(names);
		
		}
}
