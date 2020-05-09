package JavaSessions;

public class CricketData {

	public static void main(String[] args) {
		
		Object ob1[]=new Object[6];
		ob1[0]="Rohit Sarma";
		ob1[1]= 32;
		ob1[2]="India national cricket team";
		ob1[3]="1987-04-30";
		ob1[4]='m';
		ob1[5]=90;
		
		System.out.println("Details of"+ob1[0]);
		for(int i=0;i<5;i++) {
			System.out.println(ob1[i]);
			}
		
		Object ob2[]=new Object[6];
		ob2[0]="Virat Kohli";
		ob2[1]= 31;
		ob2[2]="India national cricket team";
		ob2[3]="1988-11-05";
		ob2[4]='m';
		ob2[5]=92.96f;
		
		System.out.println("---------------");
		System.out.println("Details of"+ob2[0]);
		for(int i=0;i<5;i++) {
			System.out.println(ob2[i]);
		}
		
		Object ob3[]=new Object[6];
		ob3[0]="Shikar Dhawan";
		ob3[1]= 34;
		ob3[2]="India national cricket team";
		ob3[3]="1985-12-05";
		ob3[4]='m';
		ob3[5]=156.76f;
		
		System.out.println("---------------");
		System.out.println("Details of"+ob3[0]);
		for(int i=0;i<5;i++) {
			System.out.println(ob3[i]);
			
		}
	}

}
