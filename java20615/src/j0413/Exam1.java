package j0413;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int num[]=new int[5];
		Scanner sc = new Scanner(System.in);
		int i=0, max=0;
		
		System.out.println("���� 5���� �Է����ּ���");
		while (i<5) {
			System.out.print((i+1)+"��° ����: ");
			num[i] = sc.nextInt();
			if(max<num[i]) {
				max=num[i];
			}
			i++;
		}
		System.out.println("�Է��� ���� �� �ִ밪�� "+max+"�Դϴ�.");

	}

}
