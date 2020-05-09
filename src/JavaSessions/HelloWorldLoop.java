package JavaSessions;

public class HelloWorldLoop {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			System.out.println("Hello World");
		}
		System.out.println("--------------");
		
		int j=1;
		while(j<=10) {
			System.out.println("Hello World");
			j++;
		}
		System.out.println("-----------------");
		
		int k=1;
		do {
			System.out.println("Hello world");
			k++;
		}while(k<=10);
	}

}
