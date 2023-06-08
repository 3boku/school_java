package j0525;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee lee = new Employee("이도령", 100, 25);
		Employee sung = new Employee("성춘향", 200, 18);
		
		lee.print();
		sung.print();
		
		lee.setNo(300);
		
		lee.print();
		sung.print();
	}
}
