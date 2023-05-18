package j0518;

public class studentmain {

	public static void main(String[] args) {
		student kim = new student();
		kim.setName("김로봇");
		System.out.println("이름: " + kim.getName());
		System.out.println("학생수: " + student.getCount());
		
		student song = new student();
		song.setName("송로봇");
		System.out.println("이름: " + song.getName());
		System.out.println("학생수: " + student.getCount());
	}

}
