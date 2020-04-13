package to.msn.wings.selflearn.chap01;

import java.time.LocalDateTime;

public class Hello {

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






//          int loopMax = 5;
//          for(int loopCount = 0; loopCOunt<loopMax;loopCount++) {
//        	  System.out.println("loopCountは" + loopCount)
//          }

    }

	private static boolean strequals(String string) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
}

