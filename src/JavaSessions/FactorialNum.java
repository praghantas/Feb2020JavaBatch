package JavaSessions;

import java.util.Scanner;

public class FactorialNum {
	
	int fact=1;

	public static void main(String[] args) {
		
		System.out.println("enter the number to calculate its factorial:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("the number you entered is: "+num);
		FactorialNum obj = new FactorialNum();
		int fn=obj.factorial(num);
		System.out.println("the factorial of given number is: "+fn);
		
	}
	
	public int factorial(int n) {
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}

}
