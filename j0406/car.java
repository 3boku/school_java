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
		System.out.println(car_name+"�� �������Դϴ�.");
		running = true;
	}
	void stop() {
		System.out.println(car_name+"�� �����Ͽ����ϴ�.");
		running = false;
	}
	void vel_up(int value) {
		if(!running) {
			System.out.println(car_name+"�� ������");
			return;
		}
		velocity += value;
		if(velocity >=100 ) {
			velocity = 100;
			System.out.println("�ִ�ӵ��� 100�Դϴ�");
		}
		System.out.println(value+"��ŭ �ӵ������Ͽ� ����ӵ�: "+velocity);
	}	
	void vel_down(int value) {
		if(!running) {
			System.out.println(car_name+"������");
			return;
		}
		velocity = velocity-value;
		System.out.println(value+"��ŭ �ӵ������Ͽ� ����ӵ�: "+velocity);
	}
}
