package j0525;

public class CircleMain {
	public static void main(String[] args) {
		Circle five = new Circle();;
		five.setRadius(5.0);
		
		Circle eight = new Circle();;
		eight.setRadius(8.0);
		
		System.out.println("반지름 "+five.radius+"원의 면적 : "+five.computeArea()+" 원의 둘레: "+five.computePerimeter());
		System.out.println("반지름 "+eight.radius+"원의 면적 : "+eight.computeArea()+" 원의 둘레: "+eight.computePerimeter());
	}
}
