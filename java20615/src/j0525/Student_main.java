package j0525;

public class Student_main {
	public static void main(String[] args) {
		student kim = new student();
		kim.name = "��κ�";
		kim.grade = 1;
		
		student lee = new student("�̷κ�");
		lee.grade = 2;
		
		student park = new student("�ڷκ�");
		
		kim.print();
		lee.print();
		park.print();
	}
}
