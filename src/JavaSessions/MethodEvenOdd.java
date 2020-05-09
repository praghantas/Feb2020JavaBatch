package JavaSessions;

public class MethodEvenOdd {

	public static void main(String[] args) {
		MethodEvenOdd obj = new MethodEvenOdd();
		obj.evenodd(13);
		obj.evenodd(20);
	}
	
	public void evenodd(int n) {
		if(n%2==0)
			System.out.println("the number "+n+" is even");
		else
			System.out.println("the numer "+n+" is odd");
		//return n;
	}

}
