package j0525;

public class CircleMain {
	public static void main(String[] args) {
		Circle five = new Circle();;
		five.setRadius(5.0);
		
		Circle eight = new Circle();;
		eight.setRadius(8.0);
		
		System.out.println("������ "+five.radius+"���� ���� : "+five.computeArea()+" ���� �ѷ�: "+five.computePerimeter());
		System.out.println("������ "+eight.radius+"���� ���� : "+eight.computeArea()+" ���� �ѷ�: "+eight.computePerimeter());
	}
}
