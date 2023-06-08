package j0525;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("신경화", 45678445, 10000);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			a1.printMenu();
			int menu = sc.nextInt();
			if(menu==4) {
				System.out.println("");
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
			else if(menu==1) {
				System.out.print("입력할 금액: ");
				int money = sc.nextInt();
				a1.inputMoney(money);
				System.out.println("");
			}
			else if(menu==3) {
				a1.printInfo();
				System.out.println("");
			}
			else if(menu==2) {
				System.out.print("출금할 금액: ");
				int money = sc.nextInt();
				a1.outputMoney(money);
				System.out.println("");
			}
			else {
				System.out.println("다시입력해주세요.");
			}
		}
	}

}
