package j0413;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int month, day;
		
		System.out.print("�� �Է�: ");
		month = sc.nextInt();
		
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println(month+"���� 31�� �Դϴ�.");
				break;
				
			case 4: case 6: case 9: case 11:
				System.out.println(month+"���� 30�� �Դϴ�.");
				break;
				
			default:
				System.out.println(month+"���� 28�� �Դϴ�.");
		}
		
	}

}
