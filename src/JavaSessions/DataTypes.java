package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b=10;
		b=20;
		byte b1=-1;
		byte b2=1;
		System.out.println(b);
		System.out.println(b1+b2);
		
		short sh=100;
		short sh1=-90;
		System.out.println(sh+sh1);
		
		int i=1000;
		int k=-900;
		int l=0;
		System.out.println(i+k*l);
		System.out.println((i+k)*l);
		
		long l1=10000000;
		System.out.println(l1);
		
		
		float f1=12.33f;
		float f2=(float)33.54;
		float f3=100; //100.00
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		double d1=12.3334;
		System.out.println(d1+f1+i);
		
		boolean flag1 = true; // true and flase are keywords and size is around a bit for boolean
		boolean flag2 = false;
		
		System.out.println(flag1);
		System.out.println(flag2);
		
		String str="hello world";// String should start with capital S, because string is a default class
		String str1 ="1000";
		String str2="hey this is my first java program";
		System.out.println(str);
		System.out.println(str1+i);
		System.out.println(str1+k);
		System.out.println(str2+" "+str);
		
		char c1='a'; // stores a single digit value and is mentioned in single quotes
		char c2='5';
		char c3='$';
		char c4='b'; //ASCII value is 98
		System.out.println(c1+c4);
		
		
		
	}

}
