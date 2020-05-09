package JavaSessions;

import java.util.ArrayList;

public class ReverseArraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> arnum = new ArrayList<Integer>();
		
		arnum.add(10);
		arnum.add(20);
		arnum.add(30);
		arnum.add(40);
		arnum.add(50);
		System.out.println(arnum);
		System.out.println("----------------");
		for(int i = 0, j = arnum.size() - 1; i < j; i++) {
	        arnum.add(i, arnum.remove(j));
	    }
		System.out.println("arraylist after reverse:");
		System.out.println(arnum);
	    
	}
	}


