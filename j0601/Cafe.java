package j0601;

public class Cafe {
	private int coffee = 0;
	private int sugar = 0;
	private int cream = 0;
	void makeTea() {
		printInfo();
	}
	void makeTea(int coffee) {
		this.coffee=coffee;
		makeTea();
	}
	void makeTea(int coffee, int sugar) {
		this.sugar=sugar;
		makeTea(coffee);
	}
	void makeTea(int coffee, int sugar, int cream) {
		this.cream = cream;
		makeTea(coffee, sugar);
	}
	
	void printInfo() {
		if(sugar==0&&cream==0) {
			System.out.println("블랙커피 나가요~~");
		}
		else if(cream==0) {
			System.out.println("설탕커피 나가요~~");
		}
		else {
			System.out.println("밀크커피 나가요~~");
		}
		System.out.println("커피 농도: "+(coffee+sugar+cream));
		System.out.println("-----[성분]-----");
		System.out.println("커피: "+coffee);
		System.out.println("설탕: "+sugar);
		System.out.println("크림: "+cream);
		System.out.println("---------------");
	}
}
