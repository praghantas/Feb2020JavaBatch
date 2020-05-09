package JavaSessions;

public class MaxMinNum {

	public static void main(String[] args) {
		MaxMinNum obj = new MaxMinNum();
		int maxnum = obj.max(20, 10, 30);
		System.out.println("the maximum num among given numbers is: "+maxnum);
		int minnum = obj.min(35, 15, 40);
		System.out.println("the minimum num among given numbers is: "+minnum);
	}

	public int max(int num1, int num2, int num3) {
		 if(num1> num2 && num1>num3) 
			 return num1;
		 else if(num2>num3)
			 return num2;
		 else
			 return num3;
	}
	
	public int min(int num1, int num2, int num3) {
		 if(num1< num2 && num1<num3) 
			 return num1;
		 else if(num2<num3)
			 return num2;
		 else
			 return num3;
	}
	
}
