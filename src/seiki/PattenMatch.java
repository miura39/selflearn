package seiki;

public class PattenMatch {

	public static void main(String[] args) {
		String str = "111-1111";

		/*strの中身が[0-9]で{3}回繰り返される
		 * 間に -　があり
		 * [0-9]の数字が{4}回繰り返される
		 */
		if(str.matches("[0-9]{3}-[0-9]{4}")){
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
	}
}
