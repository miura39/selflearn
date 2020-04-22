package testA_6;

public class TestB {

	public static void main(String[] args) {

		//コンストラクタ引数を配列へ
		TestA[] str = {new TestA("99A","Betty",85,90,80,100),
					   new TestA("88A","test",90,80,80,100),
					   new TestA("98A","miura",15,88,67,12),
					   new TestA("9A","miua",15,88,67,12),
					   new TestA("8A","miur",15,88,75,25)
						};

		//初期値設定
		int maxMath = str[0].gettestAmath();
		int maxEnglish =str[0].gettestAenglish();
		int maxJapanese =str[0].gettestAjapanese();
		int maxScience =str[0].gettestAscience();
		int minMath = str[0].gettestAmath();
		int minEnglish =str[0].gettestAenglish();
		int minJapanese =str[0].gettestAjapanese();
		int minScience =str[0].gettestAscience();

		//for文での合計の計算
		//最高点
		for(int i =0;i<str.length;i++){
			if(str[i].gettestAmath()>maxMath) {
				maxMath = str[i].gettestAmath();
			}
			if(str[i].gettestAenglish()>maxEnglish) {
				maxEnglish = str[i].gettestAenglish();
			}
			if(str[i].gettestAjapanese()>maxJapanese) {
				maxJapanese = str[i].gettestAjapanese();
			}
			if(str[i].gettestAscience()>maxScience) {
				maxScience = str[i].gettestAscience();
			}
			//ここから最低点数
			if(str[i].gettestAmath()<minMath) {
				minMath = str[i].gettestAmath();
			}
			if(str[i].gettestAenglish()<minEnglish) {
				minEnglish = str[i].gettestAenglish();
			}
			if(str[i].gettestAjapanese()<minJapanese) {
				minJapanese = str[i].gettestAjapanese();
			}
			if(str[i].gettestAscience()<minScience) {
				minScience = str[i].gettestAscience();
			}
		}

		System.out.println("数学"+maxMath+"点"+minMath);
		System.out.println("英語"+maxEnglish+"点"+minEnglish);
		System.out.println("国語"+maxJapanese+"点"+minJapanese);
		System.out.println("科学"+maxScience+"点"+minScience);

	}
}