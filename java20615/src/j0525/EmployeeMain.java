package j0525;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee lee = new Employee("�̵���", 100, 25);
		Employee sung = new Employee("������", 200, 18);
		
		lee.print();
		sung.print();
		
		lee.setNo(300);
		
		lee.print();
		sung.print();
	}
}
