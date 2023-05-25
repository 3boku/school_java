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
		System.out.println(name+"님의 이름이"+this.name+"으로 변경됨");
	}
	void setNo(int no) {
		this.no=no;
		System.out.println(name+"님의 사번이"+this.no+"으로 변경됨");
	}
	void setAge(int age) {
		this.age=age;
		System.out.println(name+"님의 나이가"+this.age +"으로 변경됨");
	}
	@Override
	public String toString() {
		return "[직원정보] 이름 : "+name+", 번호 : "+no+", 나이 : "+age;
	}
	
	void print() {
		System.out.println(toString());
	}
}