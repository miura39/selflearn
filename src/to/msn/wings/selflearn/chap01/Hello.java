package to.msn.wings.selflearn.chap01;
import java.time.LocalDateTime;

public class Hello {

    /**
     * @param args
     */
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
          System.out.println(time);


          String	lastName;
          lastName = "三浦";
          System.out.println(lastName+lastName);

          int	number10 = 10;
          int	number3 = 3;

          int intNum;
          int price = 18000;
          double doubleNum = 0.05;
          intNum = (int)doubleNum;

          System.out.println(price - price * intNum );

          String str = "はい";

          if(strequals("はい")) {
        	  System.out.println(str);
          }else{
        	  System.out.println("notest");
          }


          int count = 4;
          for(int i =0; i<count; i++) {
        	  System.out.println("おはよう");
          }

          int loopCount = 0;
          int loopMax = 5;
          while(loopCount > loopMax) {
        	  System.out.println("loopcount"+loopCount);
        	  loopCount++;
          }

          int[] array = {100,200,300,400,500};

          for(int i = 0; i<array.length;i++) {
        	  System.out.println(array[i]);
          }
          System.out.println();
          System.out.println(array.length);

          int[] scores = {20,30,33,44};
            for (int value : scores) {
            	System.out.println(value);
            }

           int [] array2 = {100,20,300,500};
             for(int i = 0; i<array2.length; i++) {
            	 System.out.println(array2[i]);
             }

             int[] array3;
             array3 = new int[5];

             System.out.println(array3[0]);
             System.out.println(array3.length);

             int[] array4 = {1,3,5,7,9};
             String text = "件目：";

             for(int i = 0;i<array4.length;i++) {
            	 System.out.println(i + 1 + text + array4[i]);
             }

             int[] array5 = {1,2,5,8,9};
             for(int i = 0;i<array5.length;i++) {
            	 if(array5[i]%2==0) {
            		 System.out.println(array5[i]);
            	 }
             }

             int[] array6 = {75,80,70,85,98,60,72};
             for(int i = 0;i<array6.length;i++) {
            	 if(array6[i]>=75) {
            		 System.out.println(array6[i]+"点ー＞合格");
            	 }else {
            		 System.out.println(array6[i]+"点ー＞不合格");
            	 }
             }

             String sympol = "*";
             for(int i = 0; i < 5; i++) {
            	 for(int j = 0; j< i+1; j++) {
            		 System.out.print(sympol);
            	 }
            	 System.out.println();
             }

             String sympol2 = "*";
             for(int i = 0; i < 5; i++) {
            	 for(int j = 5; j > i; j--) {
            		 System.out.print(sympol2);
            	 }
            	 System.out.println();
             }

             String[] str1 = {"テスト","テスト２","テスト３"};
             for(int i = 0; i<3;i++) {
            	 System.out.println(str1[i]);
             }

//          int loopMax = 5;
//          for(int loopCount = 0; loopCOunt<loopMax;loopCount++) {
//        	  System.out.println("loopCountは" + loopCount)
//          }
             byte val[] = new byte[4];
             val[0] = 0x48;
             val[1] = 0x4f;
             val[2] = 0x47;
             val[3] = 0x45;

             byte val2[] = new byte[1];
             val2[0] = 0x61;

             //画面表示
             System.out.println(new String(val));
             System.out.println(new String(val2));


             int[][] mtrx = {{10,20,30,40},{100,200},{1,2,3,4,5}};

             System.out.println("全要素表示");
             for(int i = 0; i<mtrx.length; i++) {
            	 for(int j = 0; j<mtrx[i].length; j++) {
            		 System.out.print(mtrx[i][j] + "  ");
              }
            	 System.out.println();
             }
             System.out.println();

             for (int i =0; i<mtrx.length; i++) {
//            	 System.out.println(mtrx[1][2]);
             }
             int num1 = 10;
             int num2 = 3;


             Sub calc = new Sub();
             Sub value = calc.calcMethod(num1,num2);

             System.out.println("加算結果は　" + value.addResult);
             System.out.println("減算結果は　" + value.subResult);
             System.out.println("乗算結果は　" + value.multiResult);
             System.out.println("除算結果は　" + value.divResult);
             System.out.println("剰余算結果は" + value.remResult);
             
             int testData1 = 200;
             int testData2 = 500;
             int testData3 = 5000;
             
              int[] fee = {120,140,205,250,400,600,870,1180};
              int[] wightGrams = {50,100,205,250,400,600,870,1180};
              
             


    }

	private static boolean strequals(String string) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
	public static void dispData(String a,String c, int b) {
		System.out.println("名前は"+a+c);
		System.out.println("年齢は"+b+"歳");
	}



	}

class Sub{

    int addResult;
    int subResult;
    int multiResult;
    int divResult;
    int remResult;

    public Sub calcMethod(int num1,int num2) {
    	Sub calc = new Sub();
    	calc.addResult = num1 + num2;
    	calc.subResult = num1 - num2;
    	calc.multiResult = num1 * num2;
    	calc.divResult = num1 / num2;
    	calc.remResult = num1 % num2;
    	return calc;
    }
}

