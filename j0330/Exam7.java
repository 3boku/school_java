package j0330;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력: ");
		num = sc.nextInt();
		
		switch( num%3 ) {
			case 0: System.out.println(num + "은(는) 3의 배수입니다."); break;
			default: System.out.println(num+ "은(는) 3의 배수가 아닙니다.");
		}
		sc.close();
		System.out.println("==============================================");
	}
}
