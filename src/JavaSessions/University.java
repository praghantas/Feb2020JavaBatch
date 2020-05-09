package JavaSessions;

import java.util.ArrayList;

public class University {
	
	String name;
	String country;
	int estyear;
	ArrayList<String> courseList;
	
	public University(String name, ArrayList<String> courseList) {
		this.name = name;
		this.courseList = courseList;
	}

	public University(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public University(String name, String country, int estyear, ArrayList<String> courseList) {
		this.name = name;
		this.country = country;
		this.estyear = estyear;
		this.courseList = courseList;
	}

	public static void main(String[] args) {
		ArrayList<String> courses=new ArrayList<String>();
		courses.add("BE");
		courses.add("MCA");
		courses.add("MBA");
		courses.add("ME");
		
		ArrayList<String> courses1=new ArrayList<String>();
		courses1.add("Arch");
		courses1.add("chemistry");
		
		University u1= new University("NU","India",1976,courses);
		University u2= new University("JNTU","India");
		University u3=new University("Priceton",courses1);
		System.out.println(u2.name+" "+u2.country);
		System.out.println(u1.name+" "+u1.country+" "+u1.estyear+" "+u1.courseList);
		System.out.println(u3.name+" "+u3.courseList);
		
		
		

	}

}
