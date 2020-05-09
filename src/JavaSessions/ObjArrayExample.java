package JavaSessions;

public class ObjArrayExample {

	public static void main(String[] args) {
		Object ob[] = new Object[5];
		ob[0] = "Steve";
		ob[1]= 25;
		ob[2] = 12.33;
		ob[3] = true;
		ob[4] = 'm';
		
		for(int v=0; v < ob.length; v++){
			System.out.println(ob[v]);
	}
	}
}
