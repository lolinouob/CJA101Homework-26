package hw1;

public class Homework1 {
	
	public static void main(String[] args) {
		
		//1.請設計一隻Java程式，計算12，6這兩個數值的和與積
		
		int num1 = 12, num2 = 6;
		
		int sum = num1 + num2;
		int product = num1 * num2;
		
		System.out.println("12與6的和="+sum);
		System.out.println("12與6的積="+product);		
		
		
		//2.請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
		
		int totalEggs = 200;
		
		int dozenCount = totalEggs / 12;
		int remainingEggs = totalEggs % 12;
		
		System.out.println(totalEggs+"顆蛋是"+dozenCount+"打"+remainingEggs+"顆");

		
		//3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		
		int totalSeconds = 256559;
		
		final int SEC_IN_MIN = 60; //60s
		final int SEC_IN_HOUR = SEC_IN_MIN * 60; //3600s
		final int SEC_IN_DAY = SEC_IN_HOUR * 24; //86400s
		
		int days = totalSeconds / SEC_IN_DAY;
		int remainingSeconds = totalSeconds % SEC_IN_DAY;
		
		int hours = remainingSeconds / SEC_IN_HOUR;
		remainingSeconds %= SEC_IN_HOUR;
		
		int minutes = remainingSeconds / SEC_IN_MIN;
		
		int seconds = remainingSeconds % SEC_IN_MIN;
		
		
		System.out.println(totalSeconds+"秒為"+days+"天"+hours+"小時"+minutes+"分"+seconds+"秒");
		
		
		//4.請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		
		final double PI = 3.1415;
		//Math.PI : https://codegym.cc/tw/groups/posts/tw.575.java-zhong-de-math-pi
		
		double radius = 5;
		
		double circleArea = PI * Math.pow(radius,2);
		double circumference = 2 * PI * radius;
		
		String circleArea2f = String.format("%.2f", circleArea);
		String circumference2f = String.format("%.2f", circumference);
		
		System.out.println("半徑為5的圓，面積="+circleArea2f+"平方公分、"+"周長="+circumference2f+"公分");
		
		
		//5.某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢 (用複利計算，公式請自行google)
		
		double startupPrincipal = 1500000;
		double annualInterestRate = 0.02;
		int saveYears = 10;
		int compoundingFrequency = 1;  //期數(1年1次)
		
		//                                      年利率         總期數=期數x年數
		//   本金加利息 = 初始本金 x ( 1 + ------------------  )
		//                                期數(每年計息次數)
		
		double finalMoney = startupPrincipal * Math.pow(1 + annualInterestRate / compoundingFrequency, compoundingFrequency * saveYears);
		String finalMoney0f = String.format("%.0f", finalMoney);
		
		System.out.println("10年後本金加利息共有"+finalMoney0f+"元");
				
		
		//6.請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
		//  5 + 5 和 5 + ‘5’ 和  5 + “5”
		//  並請用註解各別說明答案的產生原因
		
		System.out.println(5 + 5);  //10
		/*
		  Java對數值5的預設為int型別的整數字面常數，
		  兩個整數值5做單純加法運算(無任何型別轉換)，
		  因此5+5=10(int)
		 */
		
		System.out.println(5 + '5');  //58
		/*
		  5同前例，為整數字面常數
		  '5'為字元字面常數(char型別)，而該字元的Unicode編碼(字元的整數值)為53
		  基於晉升機制，Java會將字元自動轉換成他的整數值來做運算
		  因此5+53=58(int)
		 */
		
		System.out.println(5 + "5");  //55
		/*
		  5同前例，為整數字面常數
		  "5"雙引號為字串型別(string)
		  Java的+運算子的特性上，當遇到字串時，會採取字串拼接的機制
		  (非進行數值加法運算，不涉及晉升)
		  因此整數5被轉換成字串"5"去與後者(字串"5")拼接
		  "5"+"5"="55"(string)
		 */
		
		
	}
		
}
