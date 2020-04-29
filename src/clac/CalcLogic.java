package clac;

public class CalcLogic {
	//足すクラスの作成
	public static int tasu(int a, int b) {
		return (a + b);
	}
	//引くクラスの作成
	public static int hiku(int a, int b) {
		return (a - b);
	}
	//API java.lang.Threadクラスを利用
	public static void showMessage() throws Exception{
		System.out.println("メッセージ");
		//3秒の待ち時間
		Thread.sleep(3000);
		//メッセージから3秒後にmesseageが表示
		System.out.println("messeage");
	}

}
