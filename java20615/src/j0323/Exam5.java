package j0323;

public class Exam5 {

	public static void main(String[] args) {
		int[][] a = new int[2][3];
		a[0][0] = 1; a[0][1] = 2; a[0][2] = 3;
		a[1][0] = 10; a[1][1] = 20; a[1][2] = 30;
		for(int i =0 ; i < a[i].length ; i++) {
			for(int j= 0; j < a[i].length ; j++) {
				System.out.println(a[i][j] + "\t");
			
			}
		}
		int b[][] = {{1, 2}, {3, 4}, {5, 6}};
		System.out.println(b.length);
		System.out.println(b[1].length);
		
		System.out.println("===================");
		
	}
}
