package testA_7;

public class TestB {

	public static void main(String[] args) {
		//コンストラクタ引数
		TestA[] str = {new TestA("E01","Betty",85,90,80,100),
					   new TestA("E01","ffff",85,90,80,100),
					   new TestA("E01","Beddtty",85,90,80,100),
					   new TestA("E01","Beddtty",85,90,80,100),
					   new TestA("E01","Beddstty",85,90,80,100)
					};

		for(int i = 0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
}