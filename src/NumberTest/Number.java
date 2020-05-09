package NumberTest;

public class Number {
	
	private int num;
	//private int sum;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num=num;
	}

	public static void main(String[] args) {
		
		Number n=new Number();
		n.num=12;
		System.out.println(n.num);
		
		
	}

}
