package j0413;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int num[]=new int[5];
		Scanner sc = new Scanner(System.in);
		int i=0, max=0;
		
		System.out.println("정수 5개를 입력해주세요");
		while (i<5) {
			System.out.print((i+1)+"번째 정수: ");
			num[i] = sc.nextInt();
			if(max<num[i]) {
				max=num[i];
			}
			i++;
		}
		System.out.println("입력한 값들 중 최대값은 "+max+"입니다.");

	}

}
