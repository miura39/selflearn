package returnVerification;

public class Usemain {

	public static void main(String[] args) {

		int ans = add(100,10);
		//addメソッドで計算された戻り値のデータ算出
		System.out.println(" x + y "+ ans);

		//戻り値をそのまま利用する場合
		System.out.println(" x + y " + add(100,100));//結果は２００を返す



	}
		public static int add(int x,int y) {
			int ans = x + y;
			return ans;
		}
}
