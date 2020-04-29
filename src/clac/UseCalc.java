package clac;

public class UseCalc {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		//足すクラスのメソッドの利用
		int total = CalcLogic.tasu(a,b);
		//引くクラスのメソッドの利用
		int delta = CalcLogic.hiku(a,b);
		//結果：足すと13、引くと7
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
