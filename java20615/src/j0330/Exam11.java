package j0330;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		n = sc.nextInt();
//		do {
//			System.out.print(i+" ");
//			if(i==n) break;
//			i++;
//		}while(i<100);
		do {
			i++;
			if(i==n) continue;
			System.out.print(i+" ");
		}while(i<=10);
	}
		
}
