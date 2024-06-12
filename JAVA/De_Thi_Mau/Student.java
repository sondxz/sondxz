package De_Thi_Mau;

public class Student extends Person {
	private int numCourses;
	private String[] courses = new String[30];
	private int[] grades = new int[20];
	
	//constructor 
	public Student(String name,String address) {
		super(name,address);
	}
	
	//ham ToString
	public String toString() {
		return "Strudent: " + getName() + "(" + getAddress() +")"; 
	}
	
	//Ham them mon hoc
	public void addCourseGreade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses++;
	}
	
	public double getAvarageGrades() {
		int sum = 0;
		for(int i = 0;i < numCourses; i++) {
			sum += grades[i];
		}
		double avg = sum / numCourses;
		return avg;
	}
}
