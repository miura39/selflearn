package testA_2;

public class TestB {

	public static void main(String[] args) {
		TestA str = new TestA();

		str.setTestAstudentNo("E01");
		str.setTestAstudentName("Betty");
		str.setTestAmath(85);
		str.setTestAenglish(80);
		str.setTestAjapanese(60);
		str.setTestAscience(40);

		str.dispStudent();
	}
}
