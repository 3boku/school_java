package j0601;

public class EngHello extends Greeting{
	
	public String name = "Mr.Hong";
	
	public void sayHello() {
		System.out.println(name+" Nice to meet you");
	}
	
	void �ȳ��ϼ���() {
		super.sayHello();
	}
//	
//	public void test() {
//		System.out.println(super.name);
//		super.sayHello();
//	}
	public static void main(String[] args) {
		EngHello eng = new EngHello();
		eng.sayHello();
		eng.�ȳ��ϼ���();
	}

}
