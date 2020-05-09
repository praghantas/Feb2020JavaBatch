package JavaSessions;

public class MethodSum {

	public static void main(String[] args) {
		 MethodSum obj = new MethodSum();
		 int sum1= obj.sum(10,20);
		 System.out.println("sum of given numbers: "+sum1);
	}
	
	public int sum(int a, int b) {
		int c=a+b;
		return c;
		
	}
}