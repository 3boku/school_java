package j0413;
import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		int sum=0;
		
		System.out.print("숫자입력: ");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				sum=sum-i;
				System.out.print("-"+i);
				
			}
			else {
				sum+=i;
				System.out.print("+"+i);
			}
		}
		System.out.print("="+sum);
		
	}

}
