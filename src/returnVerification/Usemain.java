package returnVerification;

public class Usemain {

	public static void main(String[] args) {

		int ans = add(100,10);
		System.out.println(" x + y "+ ans);

	}
		public static int add(int x,int y) {
			int ans = x + y;
			return ans;
		}
}
