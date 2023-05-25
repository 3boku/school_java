package j0525;

public class Account {
	String name;
	int no;
	int balance;
	
	Account(){
		System.out.println("=====계좌 개설=====");
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
		System.out.println(name+"님 "+money+" 입금");
	}
	void outputMoney(int money) {
		
		if(money>balance) {
			System.out.println("금액을 다시 입력해주세요");
		}
		else {
			balance -= money;
			System.out.println(name+"님 "+money+" 출금");
		}
	}
	void printInfo() {
		System.out.println("");
		System.out.println("[ 계좌정보 ] 예금주: "+name+"/계좌번호: "+no+"/현재 잔고: "+balance);
	}
	void printMenu() {
		System.out.println("작업을 선택하세요");
		System.out.println("1. 입금");
		System.out.println("2. 출금");
		System.out.println("3. 잔고조회");
		System.out.println("4. 종료");
	}
	
}
