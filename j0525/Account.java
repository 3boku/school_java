package j0525;

public class Account {
	String name;
	int no;
	int balance;
	
	Account(){
		System.out.println("=====���� ����=====");
	}
	Account(String name, int no){
		this();
		this.name = name;
		this.no = no;
	}
	Account(String name, int no, int balance){
		this(name, no);
		this.balance = balance;
	}
	
	String getName() {
		return name;
	}
	int getNo() {
		return no;
	}
	int getBalance() {
		return balance;
	}
	void inputMoney(int money) {
		System.out.println("");
		balance += money;
		System.out.println(name+"�� "+money+" �Ա�");
	}
	void outputMoney(int money) {
		
		if(money>balance) {
			System.out.println("�ݾ��� �ٽ� �Է����ּ���");
		}
		else {
			balance -= money;
			System.out.println(name+"�� "+money+" ���");
		}
	}
	void printInfo() {
		System.out.println("");
		System.out.println("[ �������� ] ������: "+name+"/���¹�ȣ: "+no+"/���� �ܰ�: "+balance);
	}
	void printMenu() {
		System.out.println("�۾��� �����ϼ���");
		System.out.println("1. �Ա�");
		System.out.println("2. ���");
		System.out.println("3. �ܰ���ȸ");
		System.out.println("4. ����");
	}
	
}
