package polymorphism2;

public class UseMammal {

	public static void main(String[] args) {
		//インターフェースの利用宣言
		Mammal mammal =null;
		//インスタンスの生成
		mammal = new Lion();
		mammal = new Goat();

		//生成したインスタンのメソッド実行
		mammal.animalName();



	}

}
