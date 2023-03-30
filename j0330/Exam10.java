package j0330;

import java.util.Scanner;
public class Exam10 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("높이입력: ");
		n = sc.nextInt();
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+"\t");
//			}
//			System.out.println();
//		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

}
