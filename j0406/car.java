package j0406;

public class car {
	String car_name;
	int price;
	String brand;
	static int count = 0;
	int velocity = 0;
	boolean running = false;
	
	car(){
		count++;
	}
	
	void run() {
		System.out.println(car_name+"이 운행중입니다.");
		running = true;
	}
	void stop() {
		System.out.println(car_name+"이 정차하였습니다.");
		running = false;
	}
	void vel_up(int value) {
		if(!running) {
			System.out.println(car_name+"가 정차중");
			return;
		}
		velocity += value;
		if(velocity >=100 ) {
			velocity = 100;
			System.out.println("최대속도는 100입니다");
		}
		System.out.println(value+"만큼 속도증가하여 현재속도: "+velocity);
	}	
	void vel_down(int value) {
		if(!running) {
			System.out.println(car_name+"정차중");
			return;
		}
		velocity = velocity-value;
		System.out.println(value+"만큼 속도감소하여 현재속도: "+velocity);
	}
}
