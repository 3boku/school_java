package j0316;

public class Exam2 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		if (str1 == str2) //주소확인
			System.out.println("same");
		else
			System.out.println("different");
		
		String str3 = "abc";
		String str4 = "abc";
		if (str3 == str4) //주소확인
			System.out.println("same");
		else
			System.out.println("different");
		
		str3 = "qqq";
		System.out.println(str4);
	}

}
