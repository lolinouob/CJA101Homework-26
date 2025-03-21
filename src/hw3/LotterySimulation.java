package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class LotterySimulation {

	public static void main(String[] args) {
		LotterySimulation ls = new LotterySimulation();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
						
			System.out.println("阿文...請輸入你討厭哪個數字？(輸入 0 退出)");
			
			// 驗證是否輸入型別
			if (!sc.hasNextInt()) {
				System.out.println("輸入錯誤！請輸入 1~9 之間的數字。");
				sc.nextLine();  // 接收並棄掉殘留的錯誤輸入內容
				System.out.println();
				continue;
			}
			
			int dislikeNum = sc.nextInt();
			System.out.println();
			
			if (dislikeNum == 0) {  // 輸入0結束程式
	            System.out.println("結束使用");
	            break;
	        }
			
			// 驗證輸入範圍
			if (dislikeNum < 1 || dislikeNum > 9) {
				System.out.println("輸入錯誤！請輸入 1~9 之間的數字。");
				System.out.println();
				continue;
			}
			
			//產生可選數字與電腦選號陣列
			int[] numList = ls.getNumListArray(dislikeNum);
			int[] suggestedList = ls.getSuggestedNum(numList);
			
			//印出結果
			ls.printResult(numList, suggestedList);
			System.out.println();

		}
		sc.close(); // 迴圈結束後關閉Scanner
	}
	
	
	//過濾數字產出陣列
	public int[] getNumListArray(int dislikeNum) {
		int[] tempArray = new int[49];
		int numCount = 0;
		
		for(int num = 1; num <= 49; num++) {
			
			int tens = num / 10;  // 十位數有
            int ones = num % 10;  // 個位數有
            // 十位數或個位數是dislikeNum跳過
            if (tens == dislikeNum || ones == dislikeNum) {
                continue;
            }

            tempArray[numCount] = num;
			numCount++;
		}
		
		//回傳複製只剛好符合元素數量的陣列
		return Arrays.copyOf(tempArray,numCount);
	}
	
	
	//電腦亂數選6個不重複號碼
	public int[] getSuggestedNum(int[] numList) {
		int[] arr = new int[6];
		
		for(int i = 0; i < 6; i++) {
			int randomIndex = (int)(Math.random() * numList.length);
			
			for(int j = 0; j <= i; j++) {
				if(arr[j] != numList[randomIndex]) {
					arr[i] = numList[randomIndex];					
				}
			}
		}
		
		Arrays.sort(arr); //sort方法是void無返值不能直接return
		return arr;
	}
	
	
	//印出結果
	public void printResult(int[] numList, int[] suggestedList){
		
		//可選數字
		int numCount = numList.length;
		
		for(int i = 0; i < numCount; i++) {
			System.out.printf("%d\t", numList[i]);	
			//每6個數字斷行
			if ((i + 1) % 6 == 0) {
                System.out.println();
            }
		}
		System.out.println();
		
		//可選總數
		System.out.println("總共有" + numCount + "數字可選");
		System.out.println();
		
		//電腦隨機
		System.out.println("電腦選號：");
		for(int i = 0; i < suggestedList.length; i++) {
			System.out.printf("%d\t", suggestedList[i]);	
		}
		System.out.println();
		
	}
	

}
