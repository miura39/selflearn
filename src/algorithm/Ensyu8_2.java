package algorithm;

public class Ensyu8_2 {

	public static void main(String[] args) {
		//初期値
		int max = 5;

		for(int i = 0;i<max;i++) {
			for(int j = 5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
