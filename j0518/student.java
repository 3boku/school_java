package j0518;

public class student {
	private String name;
	private int grade;
	static int count;
	
	
	student(){
		count++;
	}
	
	static int getCount(){
		return count;
	}
	
	
	void setName(String n) {
		this.name = n;
	}
	String getName() {
		return name;
	}
	void setGrade(int g) {
		this.grade = g;
	}
	int getGrade() {
		return grade;
	}
	
	void print() {
		System.out.println("학생의 이름은 " + name + "이고, " + grade + "학년입니다.");
	}
}
