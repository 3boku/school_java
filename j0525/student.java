package j0525;

public class student {
	String name;
	int grade;
	
	student(){}
	student(String name){
		this.name = name;
	}
	student(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
	
	void print() {
		System.out.println("학생 이름: "+ name + "학년" + grade);
	}
	void print2() {
		System.out.println("학생 이름: "+ getName() + "학년" + getGrade());
	}
	String getName() {
		return name;
	}
	int getGrade() {
		return grade;
	}
	
	void setName(String name) {
		this.name=name;
	}
	void setGrade(int grade) {
		this.grade=grade;
	}	
}
