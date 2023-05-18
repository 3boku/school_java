package j0518;

public class foodmain {

	public static void main(String[] args) {
//		food donut = new food();
//		donut.name ="크리스피 크림 도넛";
//		donut.count=10;
//		donut.printFood();
		food juice = new food("오렌지 쥬스", 10);
		juice.printFood();
		
		food coffee = new food("아메리카노", 5);
		coffee.printFood();
		coffee.setPrice(20000);
		int 가격 = coffee.getPrice();	
		System.out.println("가격: " + 가격);
	}

}
