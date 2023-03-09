package j0309;

import java.util.Scanner;
public class ScanTest2 {

	public static void main(String[] args) {
		String major, num, name;
		
		Scanner s = new Scanner(System.in);
		System.out.print("학과: ");
		major =s.next();
	
	
		System.out.print("학번: ");
		num =s.next();
	
		System.out.print("이름: ");
		name =s.next();
		
		System.out.println("저는 " + major + num + name + "입니다.");
	}

}
