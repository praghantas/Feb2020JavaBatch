package JavaSessions;

public class TernaryOperations {

	public static void main(String[] args) {
	
		int z=12;
		String s= (z>10)? "hi":"bye";
		System.out.println(s);
		
		int n1=5; int n2=10; int max;
		max = (n1>n2)?n1:n2;
		System.out.println("the max number is: "+max);
		
		String browser="Chrome";
		String s1= (browser.equalsIgnoreCase("chrome"))?"launch chrome":"launch firefox";
		System.out.println(s1);
		
	}

}
