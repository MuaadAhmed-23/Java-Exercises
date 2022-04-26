import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student{
	private String name;
	private int age;
	private int id;
	private double gpa;
	
	public Student(String gName, int gAge, int gId, double gGpa) {
		this.name = gName;
		this.age = gAge;
		this.id = gId;
		this.gpa = gGpa;
	}
	
	public static void main(String[] args) {
		auto_generate();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	private static void auto_generate(){	
		try {
			File student_info = new File("C:\\Users\\muaad\\PycharmProjects\\pythonProject\\List Exercise\\fullname.txt");
			Scanner reading = new Scanner(student_info);
			String line = null;	
			int rand_age = 0;
			int rand_id = 0;
			double rand_gpa = 0;
			while(reading.hasNextLine()) {
				line = reading.nextLine();
				rand_age = (int)(Math.random()*35+18);
				rand_id = (int)(Math.random()*1000)+150;
				rand_gpa = (double) Math.round((Math.random()*4.0 + 1.2)*100)/100;
				Student student_info_generate = new Student(line, rand_age, rand_id, rand_gpa);
				System.out.println("Name: "+ student_info_generate.getName()+" " +"Age: "+ student_info_generate.getAge() + " " +"ID: "+ student_info_generate.getId() + " " + "GPA: " + student_info_generate.getGpa());
			}
		} catch(FileNotFoundException e) {
				System.out.println("An error occured.");
				e.printStackTrace();
		}
	}
}