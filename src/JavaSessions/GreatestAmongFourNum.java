package JavaSessions;

public class GreatestAmongFourNum {

	public static void main(String[] args) {
		int a= 25;
		int b= 78;
		int c= 87;
		int d= 90;
		// to find the highest number amoung the given numbers, we use conditional operations
		if(a>b && a>c && a>d) {
			System.out.println("the greatest number is: "+a);
		}
		else if(b>c && b>d) {
			System.out.println("the greatest number is: "+b);
		}
		else if(c>d) {
				System.out.println("the greatest number is: "+c);
		}
		else {
					System.out.println("the greatest number is: "+d);
		}
		
	}
}

