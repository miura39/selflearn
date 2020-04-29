package clac;
//パッケージ名.クラス名で別パッケージのロジックを利用出来る
import calcsecond.CalcLogicSecond;

public class UseCalc {

	public static void main(String[] args) throws Exception {
		int a = 10;
		int b = 3;
		//足すクラスのメソッドの利用
		int total = CalcLogic.tasu(a,b);
		//引くクラスのメソッドの利用
		int delta = CalcLogic.hiku(a,b);
		//別パッケージの掛け算クラスの利用
		int mul = CalcLogicSecond.kakeru(a,b);
		//結果：足すと13、引くと7
		System.out.println("足すと" + total + "、引くと" + delta);
		//結果：掛け算すると30
		System.out.println("掛け算すると" + mul);
		CalcLogic.showMessage();
	}
}
