package JavaSessions;

public class Car {
	 String name;
	 String color;
	 int cost;
	 int capacity;
	 static int wheels=4;	 //the common property for all cars, so declared as static

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		 c1.name="Honda";
		 c1.color="Red";
		 c1.cost=25000;
		 c1.capacity=7;
		 
		 Car c2=new Car();
		 c2.name="Ford";
		 c2.color="White";
		 c2.cost=30000;
		 c2.capacity=5;
		 
		 System.out.println("car1 details:" + c1.name+" "+c1.color+" "+c1.cost+" "+c1.capacity+" "+Car.wheels);
		 System.out.println("car2 details:" + c2.name+" "+c2.color+" "+c2.cost+" "+c2.capacity+" "+Car.wheels);
		
	}

}
