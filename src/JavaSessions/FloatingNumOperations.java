package JavaSessions;

public class FloatingNumOperations {

	public static void main(String[] args) {
		float f1= 25.5f;
		float f2= 3.5f;
		float f3= 40.5f;
		float f4= 4.5f;
		double d1= ((f1*f2)-(f2*f2))/(f3-f4);
		
		System.out.println("the value of the given operation is: "+d1);// to get the o/p is double
		System.out.println("the value of the given operation is: "+((f1*f2)-(f2*f2))/(f3-f4));// to get the o/p in float

	}

}
