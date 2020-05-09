package JavaSessions;

import java.util.ArrayList;

public class SampleArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> arcolor =new ArrayList<String>();
		System.out.println(arcolor.size());
		arcolor.add("Red");
		arcolor.add("Yellow");
		arcolor.add("Blue");
		arcolor.add("Green");
		System.out.println(arcolor.size());
		
		System.out.println("----------------------");
		
		for(int i=0;i<arcolor.size();i++) {
			System.out.println(arcolor.get(i));
		}
		
		arcolor.add(0, "White"); //inserting value at first position, that is index0
		arcolor.add(5, "Black"); // inserting value at last position, that is at index5
		
		System.out.println("----------------------");
		System.out.println("after adding colors at first position and last position:");
		System.out.println(arcolor);
		System.out.println("----------------------");
		System.out.println("retrieving element at index3: "+arcolor.get(3)); //retrieving element at a specific index, here index3
		
		System.out.println("----------------------");
		arcolor.set(1, "Brown");//updating index1 value to Brown
		System.out.println("after updating value at index1 to Brown: ");
		System.out.println(arcolor);
				
		System.out.println("----------------------");
		
		arcolor.remove(3); //removing element at index3
		System.out.println("after removing the element at index3:");
		for(int i=0;i<arcolor.size();i++) {
			System.out.println(arcolor.get(i));
		}
		System.out.println("-------------");
		System.out.println(arcolor.contains("White"));
		System.out.println(arcolor.contains("Red"));
		System.out.println(arcolor.contains("black")); //returning false as element in the array list is saved in Uppercase
		System.out.println(containsEqualsIgnoreCase(arcolor, "blacK"));
		System.out.println("Index of element White is: "+ arcolor.indexOf("White"));
		
	/*	for(int a=0; int b=arcolor.size()-1;a<b;a++) {
			arcolor.add(a,arcolor.remove(b));
		} */
		System.out.println("------------------");
		System.out.println("sublist of colors arraylist is: "+arcolor.subList(0, 2));
		
		String color1=arcolor.get(0);
		arcolor.set(0, arcolor.get(1));
		arcolor.set(1, color1);
		System.out.println("-----------------------");
		System.out.println("colors list after first two elements swap: "+ arcolor);
		
		//arcolor.clear();
		//arcolor.removeAll(arcolor);
		//System.out.println("colors array list after emptying the list: "+ arcolor);
		
		arcolor.trimToSize(); //trimming the virtual capacity of an arraylist the current list size
		System.out.println(arcolor);
		for(int counter = 0; counter<arcolor.size(); counter++) {
		System.out.println(arcolor.get(counter));
		}
		
	}
	
	public static boolean containsEqualsIgnoreCase(ArrayList<String> ac,String s) //using static as we are calling the method name without using obj ref.
	{
		for (int i=0; i<ac.size(); i++) {
			   if (s.equalsIgnoreCase(ac.get(i))) {
			         return true;
			     }
			  }
			 return false;
	}

}
