package test7_3;
//HashMapとMapのインポート宣言
import java.util.HashMap;
import java.util.Map;

public class UseRecord {

	public static void main(String[] args) {

		//HashMapの宣言<>はキーの型、値の型　マップ変数＝・・・・。new後の<>はダイヤモンド演算子。左辺の<>に基づいて右辺の<>を推測する。
		Map<String,Record>textsList=new HashMap<>();

		//Recordクラス型をインスタンス化してHashMapへ格納
		textsList.put("1A",new Record("1A","Betty",85,90,80,100));
		textsList.put("2A",new Record("2A","Betty",85,90,80,100));
		textsList.put("3A",new Record("3A","Betty",85,90,80,100));
		textsList.put("4A",new Record("4A","Betty",85,90,80,100));
		textsList.put("5A",new Record("5A","Betty",85,90,80,100));

		//入力メソッド（後で修正する）
		NotExistException input = new NotExistException("");
		NotExistException value = input.StudentName();

		String nameNo = ;
		//
		System.out.println(textsList.get(nameNo));
	}
}