package j0518;

public class studentmain {

	public static void main(String[] args) {
		student kim = new student();
		kim.setName("��κ�");
		System.out.println("�̸�: " + kim.getName());
		System.out.println("�л���: " + student.getCount());
		
		student song = new student();
		song.setName("�۷κ�");
		System.out.println("�̸�: " + song.getName());
		System.out.println("�л���: " + student.getCount());
	}

}
