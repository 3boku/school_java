package j0601;

public class Car {
	private String name;
	protected String color;
	int velocity;
	
	Car(){
		System.out.println("Car积己磊");
	}
	
	Car(String name){
		System.out.println("Car积己磊2");
	}
	
	void speedUp() {
		velocity +=5;
		System.out.println("加档刘啊: "+velocity);
	}
	void speedDown() {
		velocity -=5;
		System.out.println("加档皑家: "+velocity);
	}
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	
}
