package JavaSessions;

public class Company {
	String companyName;
	String ceo;
	String product;
	long revenue;
	int empCount;
	static int holidayCount =20; //common for all emp, so declared as static
	
	public Company() {
		System.out.println("this is a default constructor");
	}
	public Company(int a) {
		System.out.println("this is a single parameter constructor");
	}
	public Company(String companyName, String ceo, String product,long revenue,int empCount) {
		this.companyName=companyName;
		this.ceo=ceo;
		this.product=product;
		this.revenue=revenue;
		this.empCount=empCount;
	}
	

	public Company(String companyName, String ceo) {
		this.companyName = companyName;
		this.ceo = ceo;
	}
	public static void main(String[] args) {
		
		Company c1= new Company();
		Company c2=new Company(10);
		Company c3=new Company("Google","Sundar pichai","Google cloud",100000, 10000);
		Company c4= new Company("MS","Nadella","null",0,0);
		Company c5=new Company("xyz comp","Tom");
		
		System.out.println(Company.holidayCount);
		System.out.println(c3.companyName);
		System.out.println(c4.empCount);
		System.out.println(c4.product);
		System.out.println(c5.companyName+" "+c5.product+" "+c5.empCount);
	}

}
