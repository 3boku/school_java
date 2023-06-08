package j0601;

public class TruckMain {

	public static void main(String[] args) {
		Truck mytruck = new Truck();
		mytruck.setName("프론티어");
		mytruck.ton = 3;
		mytruck.color = "pink";
		mytruck.speedUp();
		mytruck.speedUp();
		mytruck.speedUp();
		mytruck.speedDown();
		
		
	}

}
