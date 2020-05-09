package JavaSessions;

public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		int b=200;
		
		System.out.println(a+b);
		
		String s1="hello";
		String s2="Java";
		System.out.println(s1+s2);
		
		System.out.println(a+s1);
		System.out.println(a+s1+s2+b);
		System.out.println(a+b+s1+s2);
		System.out.println(s1+s2+a+b);
		System.out.println(s1+s2+(a+b));
		System.out.println("the value of a is "+ a);
		System.out.println("the value of b is "+ b);
		System.out.println("the value of a+b is "+ a+b);//a+b gets concatenated
		System.out.println(a+b+" is the value of a+b");
		System.out.println("the value of a+b is "+ (a+b));
		
		int total=400;
		int finalamount =total+100;
		System.out.println("the finalamount value is "+ finalamount);
		System.out.println("the finalamount value is "+ (total+100));
		System.out.println("the finalamount value is "+ total+100);//total and 100 gets concatenated
	}

}
