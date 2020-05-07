package if_syntax;

public class If_1 {

	public static void main(String[] args) {

			    printData(fullName("momo", "mame"), 11, 2.0, 40.0);
			    printData(fullName("boss", "momo", "マーブル"), 60, 2.11, 70.0);
			  }

			  public static void printData(String name, int age, double height, double weight) {
			    System.out.println("私の名前は" + name + "です");
			    System.out.println("年齢は" + age + "歳です");
			    System.out.println("身長は" + height + "mです");
			    System.out.println("体重は" + weight + "kgです");
			    double bmi = bmi(height, weight);
			    System.out.println("BMIは" + bmi + "です");


			    if(Medical(bmi)){
			      System.out.println("健康です");
			      }else{
			        System.out.println("健康ではありません");
			      }
			    }


			  public static String fullName(String firstName, String lastName) {
			    return firstName + " " + lastName;
			  }

			  public static String fullName(String firstName, String middleName, String lastName) {
			    return firstName + " " + middleName + " " + lastName;
			  }

			  public static double bmi(double height, double weight) {
			    return weight / height / height;
			  }


			  public static boolean Medical(double bmi){
			    return bmi >= 18.5 && bmi < 25.0 ;
		}

	}


