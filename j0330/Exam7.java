package j0330;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�: ");
		num = sc.nextInt();
		
		switch( num%3 ) {
			case 0: System.out.println(num + "��(��) 3�� ����Դϴ�."); break;
			default: System.out.println(num+ "��(��) 3�� ����� �ƴմϴ�.");
		}
		sc.close();
		System.out.println("==============================================");
	}
}
