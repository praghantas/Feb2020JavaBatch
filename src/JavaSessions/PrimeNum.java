package JavaSessions;

public class PrimeNum {
	
	boolean flag=false;
	public static void main(String[] args) {
		
		PrimeNum num1= new PrimeNum();
		PrimeNum num2= new PrimeNum();
		PrimeNum num3= new PrimeNum();
		num1.prime(1);
		num2.prime(17);
		num3.prime(33);
}
	public void prime(int n) {
		if(n==0 ||n==1)
			System.out.println(n+" is not a prime number");
		else {
		for(int i=2; i<=n/2;i++) 
		{
			if(n%i==0) {
				System.out.println(n+" is not a prime number");
				flag =true;
				break;
		}
		}
		if(flag==false)
			System.out.println(+n+ " is a prime number");
	}
	}
}
