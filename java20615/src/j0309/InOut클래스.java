package j0309;

import java.lang.*;
import java.util.Scanner;

public class InOut클래스 {

	public static void main(String[] args) {
		System.out.println("Hello" + "java!");
		System.out.println("제 나이는" + 19 + "살");
		System.out.println("3과 4를 결합" + 3+4);
		System.out.println("3과 4를 결합" + (3+4));
		System.out.println("나는 \"안녕\"하고 말했다");
		
		Scanner s = new Scanner(System.in);
		int age =s.nextInt();
		System.out.println("나이: " + age);
		}

}
