package returnVerification;

public class Usemain {

	public static void main(String[] args) {

		int ans = add(100,10);
		//addメソッドで計算された戻り値のデータ算出
		System.out.println(" x + y "+ ans);//結果：110

		//戻り値をそのまま利用する場合
		System.out.println(" x + y " + add(100,100));//結果：２００

		//オーバーロードの利用（仮引数が異なれば同じ名前のメソッドを複数定義ができる
		//一つ目のaddメソッド
		System.out.println(add(100,100));//結果：200
		//二つ目のaddメソッド
		System.out.println(add(5.5,10.5));//結果：16.0
		//三つ目のaddメソッド
		System.out.println(add("OK","NG"));//結果：OKNG
	}
		public static int add(int x,int y) {
			//一つ目のaddメソッド
			int ans = x + y;
			return ans;
		}
		public static double add(double x, double y) {
			return x + y;
		}
		public static String add(String x, String y) {
			return x + y;
		}
}
