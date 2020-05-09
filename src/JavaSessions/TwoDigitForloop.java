package JavaSessions;

public class TwoDigitForloop {

	public static void main(String[] args) {
		
		/*for(int i=0;i<=39;i++) {
			if(i<=9) {
			System.out.println("0"+i);
			}
			if(i>=10)
			System.out.println(i);
	} */
		for(int i=0; i<4;i++) {
			for(int j=0;j<=9;j++) {
				System.out.print(i+""+j+"\t");
			}
			System.out.println();
		}
	}
}