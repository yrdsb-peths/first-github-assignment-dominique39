public class Student {
	private static int totalstudents;
	private String name;

	public Student(String name;){
		totalstudents++;
		this.name = name;
    }

	public String toString() {
		return "Student name = " + name;
	}
}
