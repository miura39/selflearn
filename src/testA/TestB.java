package testA;

public class TestB {

	public static void main(String[] args) {
		TestA str = new TestA();

		str.setTestAstudentNo("E01");
		str.setTestAstudentName("Betty");
		str.setTestAmath(85);
		str.setTestAenglish(80);
		str.setTestAjapanese(60);
		str.setTestAscience(40);

	System.out.println(
					"学籍番号は"+ str.gettestAstudentNo() + "です"
					+"\n氏　　名は"+ str.gettestAstudentName() + "です"
					+"\n数　　学は"+ str.gettestAmath() + "点です"
					+"\n英　　語は"+ str.gettestAenglish() +"点です"
					+"\n国　　語は"+ str.gettestAjapanese() + "点です"
					+"\n科　　学は"+ str.gettestAscience() + "点です"
					);
	}
}
