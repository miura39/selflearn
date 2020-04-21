package testA_4;

public class TestA {

	private String testAstudentNo;
	private String testAstudentName;
	private int testAmath;
	private int testAenglish;
	private int testAjapanese;
	private int testAscience;

	public TestA(String testAstudentNo,
				 String testAstudentName,
				 int testAmath,
				 int testAenglish,
				 int testAjapanese,
				 int testAscience){
		this.testAstudentNo = testAstudentNo;
		this.testAstudentName = testAstudentName;
		this.testAmath = testAmath;
		this.testAenglish = testAenglish;
		this.testAjapanese = testAjapanese;
		this.testAscience = testAscience;
	}
	//画面の表示メソッド
	public void dispStudent() {
	System.out.println("学籍番号は　"+gettestAstudentNo());
	System.out.println("氏　　名は　"+gettestAstudentName());
	System.out.println("数　　学は　"+gettestAmath());
	System.out.println("英　　語は　"+gettestAenglish());
	System.out.println("国　　語は　"+gettestAscience());
}

	public String gettestAstudentNo() {
		return testAstudentNo;
	}
	public void setTestAstudentNo(String testAstudentNo) {
		this.testAstudentNo = testAstudentNo;
	}

	public String gettestAstudentName() {
		return testAstudentName;
	}
	public void setTestAstudentName(String testAstudentName) {
		this.testAstudentName = testAstudentName;
	}

	public int gettestAmath() {
		return testAmath;
	}
	public void setTestAmath(int testAmath) {
		this.testAmath = testAmath;
	}

	public int gettestAenglish() {
		return testAenglish;
	}
	public void setTestAenglish(int testAenglish) {
		this.testAenglish = testAenglish;
	}

	public int gettestAjapanese() {
		return testAjapanese;
	}
	public void setTestAjapanese(int testAjapanese) {
		this.testAjapanese = testAjapanese;
	}

	public int gettestAscience() {
		return testAscience;
	}
	public void setTestAscience(int testAscience) {
		this.testAscience = testAscience;
	}


}