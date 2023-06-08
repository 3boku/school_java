package j0323;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		
		int a, b;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("a: ");
		a = sc.nextInt();
		System.out.println("b: ");
		b = sc.nextInt();
		System.out.println("������: ");
		op = sc.next().charAt(0);
				
		if( op == '+') {
			System.out.println(a + "+"+b +"=" + (a+b));
		}
		
		else if( op == '-') {
			System.out.println(a + "-"+b +"=" + (a-b));
		}
		else if( op == '*') {
			System.out.println(a + "*"+b +"=" + (a*b));
		}
		else if( op == '/') {
			System.out.println(a + "/"+b +"=" + (a/b));
		}
		else if( op == '%') {
			System.out.println(a + "%"+b +"=" + (a%b));
		}
		else {
			System.out.println("��Ģ�����ڰ� �ƴմϴ�.");
		}
//		if(a % 2==0) {
//			System.out.println(a+"�� ¦���Դϴ�.");
//		}
//		else {
//			System.out.println(a+"�� Ȧ���Դϴ�.");
//		}
		
	}

}
