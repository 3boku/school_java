package j0525;

public class Employee {
	String name;
	int no;
	int age;
	
	Employee(){};
	Employee(String name, int no, int age){
		this.name=name;
		this.no=no;
		this.age=age;
	}
	
	String getName() {
		return name;
	}
	int getNo() {
		return no;
	}
	int getAge() {
		return age;
	}
	void setName(String name) {
		this.name=name;
		System.out.println(name+"���� �̸���"+this.name+"���� �����");
	}
	void setNo(int no) {
		this.no=no;
		System.out.println(name+"���� �����"+this.no+"���� �����");
	}
	void setAge(int age) {
		this.age=age;
		System.out.println(name+"���� ���̰�"+this.age +"���� �����");
	}
	@Override
	public String toString() {
		return "[��������] �̸� : "+name+", ��ȣ : "+no+", ���� : "+age;
	}
	
	void print() {
		System.out.println(toString());
	}
}