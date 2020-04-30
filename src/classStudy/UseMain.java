package classStudy;

public class UseMain {

	public static void main(String[] args) {
		//勇者生成　初期化
		Hero h = new Hero();
		//フィールドに初期値をセット
		h.name = "Java太郎";
		h.hp = 100;

		//お化けキノコ（一匹目生成）
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';//charの場合はシングルクォーテーション
		//お化けキノコ（二匹目生成）
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';//charの場合はシングルクォーテーション

		System.out.println("勇者" + h.name + "を生み出しました");
		//勇者のメソッドを呼び出しにいく
		h.sit(5);
		m1.run();
		m2.run();
		h.slip();
		h.sit(25);
		h.run();
	}

}
