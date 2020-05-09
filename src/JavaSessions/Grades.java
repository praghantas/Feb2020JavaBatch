package JavaSessions;
import java.util.Scanner;
public class Grades {
	public static void main(String[] args) {
		Grades student = new Grades();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student marks: ");
		int marks =sc.nextInt();
		System.out.println("the marks entered is: "+marks);
		String gradeval =student.gradeCalc(marks);
		System.out.println("the student grade is: "+gradeval);
	}
	public String gradeCalc(int studentmarks) {
		String grade = null;
		if(studentmarks>=91 && studentmarks<=100)
			 grade="AA";
		else if(studentmarks>=81 && studentmarks<=90)
			 grade="AB";
		else if(studentmarks>=71 && studentmarks<=80)
			 grade="BB";
		else if(studentmarks>=61 && studentmarks<=70)
			 grade="BC";
		else if(studentmarks>=51 && studentmarks<=60)
			 grade="CD";
		else if(studentmarks>=41 && studentmarks<=50)
			 grade="DD";
		else if(studentmarks<=40)
			grade="student failed";
		return grade;
	}
}
