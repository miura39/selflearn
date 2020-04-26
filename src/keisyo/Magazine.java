package keisyo;

public class Magazine {
	//フィールド宣言
	private String field;
	private String frequency;
	
	//引数なしコンストラクタ
	public Magazine() {
	}
	//引数ありコンストラクタ　フィールドで宣言した変数のデータを渡す
	public Magazine(String field,String frequency) {
		this.field = field;
		this.frequency = frequency;
	}
	
	//メニュー　→　ソース　→　getter setterの生成
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
}
