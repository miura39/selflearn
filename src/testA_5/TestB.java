package testA_5;

public class TestB {

	public static void main(String[] args) {
		if(args.length ==0) {
			System.out.println("引数がありません");
			return;
		}
		String subject = args[0];

		//コンストラクタ引数
		TestA str = new TestA("99A","Betty",85,90,80,100);

		if(subject.equals("数学")) {
			str.dispStudent();		
			System.out.println("数　　学は　"+str.gettestAmath());
		}else if(subject.contentEquals("英語")) {
			str.dispStudent();
			str.setTestAenglish(50);
		}else if(subject.equals("国語")) {
			str.dispStudent();
			str.setTestAjapanese(50);
		}else if(subject.equals("科学")) {
			str.dispStudent();
			str.setTestAscience(50);
		}else {
			str.dispStudent();
			System.out.println("該当科目はありません");
		}


	}
}