package test7_3;
import java.util.Scanner;

public class NotExistException {
	@SuppressWarnings("resource")
	private String studentNo;

	public NotExistException(String text){
		this.studentNo = text;
	}
	public String StudentName() {
		String str = getStudentNo();
		Record array = new Record();
		Scanner studentName = new Scanner(System.in);

		System.out.print("学籍番号を入力してください＞");
		//引数XはRecordクラスのコンストラクタの学籍番号とする
		String nameInput = studentName.next();

		if(nameInput.equals(str)) {
			return str;
		}


		System.out.println("学籍番号がありません");
		return nameInput;



	}

	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
}
