package JavaSessions;

public class PrintSixMultiples {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i*6);
		}
		System.out.println("--------------");
		
		int j=1;
		while(j<=10) {
			System.out.println(j*6);
			j++;
		}
		System.out.println("---------------");
		
		int k=1;
		do {
			System.out.println(k*6);
			k++;
		}while(k<=10);
	}

}
