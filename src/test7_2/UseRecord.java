package test7_2;
import java.util.ArrayList;
import java.util.List;

public class UseRecord {

	public static void main(String[] args) {

		//ArrayList宣言　<>の中身はどんなインスタンスも格納可能。new後の<>はダイヤモンド演算子。左辺の<>に基づいて右辺の<>を推測する。
		List<Record>textsList=new ArrayList<>();

		//ArrayList生成
		textsList.add(new Record("1A","Betty",85,90,80,100));
		textsList.add(new Record("2A","Betty",85,90,80,100));
		textsList.add(new Record("3A","Betty",85,90,80,100));
		textsList.add(new Record("4A","Betty",85,90,80,100));
		textsList.add(new Record("5A","Betty",85,90,80,100));

		//拡張for文
		for(Record text:textsList) {
			System.out.println(text);
		}
	}
}