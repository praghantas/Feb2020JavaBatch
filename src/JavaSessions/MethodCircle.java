package JavaSessions;

public class MethodCircle {

	public static void main(String[] args) {
		MethodCircle circle =new MethodCircle();
		float crval=circle.circumference(4.1f);
		System.out.println("the circumference value of circle is: "+crval);
		
		double areaval=circle.area(4.1);
		System.out.println("the area value of circle is: "+areaval);
	}
	
	public float circumference(float r) {
		float cv = (float) (Math.PI*2*r);
		return cv;
	}
	
	public double area(double r) {
		double av= Math.PI*(r*r);
		return av;
	}
}
