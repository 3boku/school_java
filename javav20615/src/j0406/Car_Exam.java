package j0406;

public class Car_Exam {

	public static void main(String[] args) {
		car redcar = new car();
		
		car bluecar = new car();
		
		redcar.car_name = "AMG GT";
		redcar.price = 20000;
		redcar.brand="Benz";
		redcar.velocity = 30;
		
		bluecar.car_name = "520d";
		bluecar.price = 9000;
		bluecar.brand="BMW";
		bluecar.velocity = 40;
		
		redcar.run();
		redcar.vel_up(10);
		redcar.vel_up(20);
		redcar.vel_down(40);
		redcar.vel_up(150);
		redcar.stop();
		redcar.vel_up(150);
		redcar.stop();
	}

}
