public class GradeCal{
	public static void main(String[] args){
		Student Student1 = new Student();
		Student1.name = "Amal";
		Student1.rollNumber = 12;
		Student1.marks = 63;
		Student1.DisplayInfo();
		
		Student Student2 = new Student();
		Student2.name = "Namal";
		Student2.rollNumber = 15;
		Student2.marks = 43;
		Student2.DisplayInfo();
	}
}
class Student{
	String name;
	int rollNumber;
	double marks;
	
	char CalculateGrade(){
		if (marks>=90){
			return 'A';
			
		} else if (marks >= 65){
			return 'B';
			
		}else if (marks >= 55){
			return 'C';
			
		}else{
			return 'D';
			
		}
	}
	void DisplayInfo(){
		System.out.println("Student's name is " + name);
		System.out.println("Student's roll number is " + rollNumber);
		System.out.println("Student's mark is " + marks);
		System.out.println("Students grade is " + CalculateGrade());
		
	}
}