package j0525;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("�Ű�ȭ", 45678445, 10000);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			a1.printMenu();
			int menu = sc.nextInt();
			if(menu==4) {
				System.out.println("");
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}
			else if(menu==1) {
				System.out.print("�Է��� �ݾ�: ");
				int money = sc.nextInt();
				a1.inputMoney(money);
				System.out.println("");
			}
			else if(menu==3) {
				a1.printInfo();
				System.out.println("");
			}
			else if(menu==2) {
				System.out.print("����� �ݾ�: ");
				int money = sc.nextInt();
				a1.outputMoney(money);
				System.out.println("");
			}
			else {
				System.out.println("�ٽ��Է����ּ���.");
			}
		}
	}

}
