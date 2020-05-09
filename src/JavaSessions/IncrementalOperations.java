package JavaSessions;

public class IncrementalOperations {

	public static void main(String[] args) {
		
		int x=1;
		int y=x++; // post increment, x=1 gets assigned to y and then x gets incremented by 1
		System.out.println(x);
		System.out.println(y);
		
		int a=-1;
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		
		int s= -1;
		int t= ++s;
		System.out.println(s);
		System.out.println(t);
		
		int k= 2;
		int l=k--;
		System.out.println(k);
		System.out.println(l);
		
		int p=0;
		int q=--p;
		System.out.println(p);
		System.out.println(q);
		

	}

}
