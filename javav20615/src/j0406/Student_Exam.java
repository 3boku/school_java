package j0406;

public class Student_Exam {

	public static void main(String[] args) {
		Student kim = new Student();
		Student lee;
		lee = new Student();
		
		kim.name = "������";
		kim.number = 20615;
		kim.phone = "010-2122-0730";
		kim.School ="�����ְ���";
		System.out.println("�̸�: "+kim.name);
		System.out.println("�й�: "+kim.number);
		System.out.println("��ȭ��ȣ: "+kim.phone);
		System.out.println("�б�: "+kim.School);

		lee.name = "�̼���";
		lee.number = 12345;
		lee.phone = "134-324-3484";
		System.out.println("�̸�: "+lee.name);
		System.out.println("�й�: "+lee.number);
		System.out.println("��ȭ��ȣ: "+lee.phone);
		System.out.println("�б�: "+lee.School);
		System.out.println("���л���: "+Student.count);
	}

}