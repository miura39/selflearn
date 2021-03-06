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
		//配列printArrayメソッド
		int[] array = {1, 2, 3};
			//配列を渡す
			printArray(array);//結果：123
		//newArrayを受け取る
		int[] array2 = makeArray(3);
		for(int i : array2) {
			System.out.print(i);//結果：012
		}
		System.out.println();//次のメソッドのために改行しておく
	}


		//一つ目のaddメソッド
		public static int add(int x,int y) {
			int ans = x + y;
			return ans;
		}
		//二つ目のaddメソッド
		public static double add(double x, double y) {
			return x + y;
		}
		//三つ目のaddメソッド
		public static String add(String x, String y) {
			return x + y;
		}
		//int型配列を受け取り、全ての要素を表示するメソッド
		public static void printArray(int[] array) { //arrayの参照が作られる
			//拡張for文の利用
			for(int element : array) {
				System.out.print(element);//printは改行しない
			}
			System.out.println();//次のメソッドのために改行しておく
		}
		//戻り値が配列の場合
		public static int[] makeArray(int size) {
			int[] newArray = new int[size];
			for(int i= 0; i < newArray.length; i++) {
				newArray[i] = i;
			}
			//returnでmainに配列を戻す（配列の戻り値）
			return newArray;
		}
}
