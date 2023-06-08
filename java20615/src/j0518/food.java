package j0518;

public class food {
		String name;		 	//음식이름
		private int price = 1000; 		//가격
		int count; 				//수량
		static int total_count; //전체수량
		
		//생성자
		food(){}//생략가능
		
		
		food(String name1, int count1){
			name = name1;
			count = count1;
			total_count += count;
		}
		//메소드
		void printFood() {
			//도넛 1000원*10개
			System.out.println(name + " " + price + "원 * " + count +"개");
			System.out.println("총 수량: " + total_count);
		}
		
		int getPrice() {
			return price;
		}
		void setPrice(int price1) {
			price = price1;
		}
	}

