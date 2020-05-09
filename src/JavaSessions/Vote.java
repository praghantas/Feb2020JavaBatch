package JavaSessions;
public class Vote {
	
	String name;
	int age;
	//boolean isEligible;
	
	public static void main(String[] args) {
		Vote person1= new Vote();
		Vote person2= new Vote();
		Vote person3=new Vote();
		
		person1.name="Ravi";
		person1.age =17;
		person2.name="Kiran";
		person2.age=18;
		person3.name="Rani";
		person3.age=22;
	//person1.eligibility(17);
		System.out.println(person1.name +" elgigibility for vote is: "+person1.eligibility(person1.age));
		System.out.println(person2.name +" elgigibility for vote is: "+person2.eligibility(person2.age));
		System.out.println(person3.name +" elgigibility for vote is: "+person3.eligibility(person3.age));
	}
	public boolean eligibility(int personage) //return type boolean
	{ 
		if(personage>=18)
			return true;
		else
			return false;
	}
}



