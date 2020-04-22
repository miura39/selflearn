package test;

public class Calc {
	private int firstNum;
	private int secondNum;


	public Calc() {
		this.firstNum = 0;
		this.secondNum = 0;
	}

	public void addCalc(int num1,int num2) {
		System.out.println(num1+num2);
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

}
