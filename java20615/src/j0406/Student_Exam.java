package j0406;

public class Student_Exam {

	public static void main(String[] args) {
		Student kim = new Student();
		Student lee;
		lee = new Student();
		
		kim.name = "정현서";
		kim.number = 20615;
		kim.phone = "010-2122-0730";
		kim.School ="우주최강고";
		System.out.println("이름: "+kim.name);
		System.out.println("학번: "+kim.number);
		System.out.println("전화번호: "+kim.phone);
		System.out.println("학교: "+kim.School);

		lee.name = "이순신";
		lee.number = 12345;
		lee.phone = "134-324-3484";
		System.out.println("이름: "+lee.name);
		System.out.println("학번: "+lee.number);
		System.out.println("전화번호: "+lee.phone);
		System.out.println("학교: "+lee.School);
		System.out.println("총학생수: "+Student.count);
	}

}