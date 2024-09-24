import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();

		Student s1 = new UnderGradStudent("John", "Economics", 3);
		Student gs1 = new GraduateStudent("Nick", "Informatics","Papadopoulos");
		Student gs2 = new GraduateStudent("Mary", "Informatics","Stefanidis");
		
		students.add(s1);
		students.add(gs1);
		students.add(gs2);
		
		for(Student student: students) {
			student.printInfo();
			student.printType();
		}
		
		
	}

}
