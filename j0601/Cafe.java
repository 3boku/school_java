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
			System.out.println("��Ŀ�� ������~~");
		}
		else if(cream==0) {
			System.out.println("����Ŀ�� ������~~");
		}
		else {
			System.out.println("��ũĿ�� ������~~");
		}
		System.out.println("Ŀ�� ��: "+(coffee+sugar+cream));
		System.out.println("-----[����]-----");
		System.out.println("Ŀ��: "+coffee);
		System.out.println("����: "+sugar);
		System.out.println("ũ��: "+cream);
		System.out.println("---------------");
	}
}
