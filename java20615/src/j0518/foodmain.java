package j0518;

public class foodmain {

	public static void main(String[] args) {
//		food donut = new food();
//		donut.name ="ũ������ ũ�� ����";
//		donut.count=10;
//		donut.printFood();
		food juice = new food("������ �꽺", 10);
		juice.printFood();
		
		food coffee = new food("�Ƹ޸�ī��", 5);
		coffee.printFood();
		coffee.setPrice(20000);
	}

}
