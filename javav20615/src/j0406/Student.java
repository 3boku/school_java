package j0406;

public class Student {
	//�ɹ� ����: �Ӽ�
	String name; //�̸�
	int number; //�й�
	String phone; //��ȭ��ȣ
	static String School ="����κ�";
	static int count = 0;
	//������
	
	//�żҵ�
	Student(){
		count++;
		System.out.println("������: "+count);
		
	}
}
