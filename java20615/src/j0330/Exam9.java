package j0330;

import java.util.Scanner;
public class Exam9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even_sum = 0, odd_sum = 0, n;
		Scanner ss = new Scanner(System.in);
		System.out.print("범위를 입력하세요: ");
		n=ss.nextInt();
		
		for(int i=0; i<=n; i++) {
			if(i%2==0) even_sum+=i;
			else odd_sum+=i;
		}
		System.out.println("1부터 "+n+ "까지의 짝수의 합은 "+even_sum+"이고, 홀수의 합은 "+odd_sum+"입니다");
		
	}

}
