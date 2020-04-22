package test;

public class UseCalc {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("引数を2つ入力してください");
		}

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		Calc numAdd = new Calc();

		numAdd.addCalc(num1,num2);

	}

}
