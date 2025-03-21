package hw3;

import java.util.Scanner;

public class NumberGuessing {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			int randomNum = (int)(Math.random() * 101);
			int userGuess = -1;
//			System.out.println("檢查點1-亂數變");
			
			System.out.println("開始猜數字吧!(0~100)");

			while(userGuess != randomNum) {
//				System.out.println("檢查點2-亂數沒變");
				
				// 驗證是否輸入型別
				if (!sc.hasNextInt()) {
					System.out.println("輸入錯誤！請輸入整數值。");
					sc.next();  // 清除錯誤的輸入
					continue;
				}
				
				userGuess = sc.nextInt();
				
				// 驗證輸入範圍
				if (userGuess < 0 || userGuess > 100) {
					System.out.println("輸入錯誤！請輸入 0~100 之間的數字。");
					continue;
				}
				
				String hint = randomNum > userGuess ? "小於":"大於";
				System.out.println("猜錯囉!"+userGuess+ hint +"正確答案");

			}
			
			System.out.println("答對了!答案就是" + randomNum);
			System.out.println();
			
			
			System.out.println("繼續玩？(y/n)");
            String choice = sc.next().trim().toLowerCase();

            if (choice.equals("n")) {
                System.out.println("遊戲結束");
                break;
            }
			
		}
		
		sc.close();
		
	}

	
}
