package hw2;

public class HomeWork2 {
	public static void main(String[] args) {
		
	//1.請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int sum = 0;
		for(int i = 2; i <= 1000; i += 2) {
			sum += i;
		}
		System.out.println("1～1000的偶數和 = " + sum);
		
		
    //2.請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int product = 1;
		for(int i = 1; i <= 10; i++) {
			product *= i;
		}
		System.out.println("用for迴圈計算1～10的連乘積 = " + product);
		
	
	//3.請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int product2 = 1, num = 1;
		while(num <= 10) {
			product2 *= num;
			num++;
		}
		System.out.println("用for迴圈計算1～10的連乘積 = " + product2);
		
		
	//4. 請設計一隻Java程式，輸出結果為以下：
	//	1 4 9 16 25 36 49 64 81 100
		
	    // 1~10的 2次方
		
		for(int i = 1; i <= 10 ; i++) {
			System.out.print(i*i + " ");
		}
		System.out.println();
		
		
		
	//5.阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。
	//	請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

		String numAvailable = "";
		int numAmount = 0;

		
		for(int i = 1; i <= 49; i++) {
			
			int tens = i / 10;  // 十位數有4
            int ones = i % 10;  // 個位數有4
            
            // 十位數或個位數是4跳過
            if (tens == 4 || ones == 4) {
                continue;
            }
    		
//          // 也可透過數字轉為字串方式，檢查是否包含'4'
//          if (Integer.toString(i).contains("4")) {
//              continue;
//          }
			
			numAvailable = numAvailable + " " + i;
			numAmount++;
			
		}
		System.out.println("阿文可以選擇的數字共有" + numAmount + "個");
		System.out.println("有這些：" + numAvailable);
		

		
		
		
	//6.請設計一隻Java程式，輸出結果為以下：
	//	1 2 3 4 5 6 7 8 9 10
	//  1 2 3 4 5 6 7 8 9
	//	1 2 3 4 5 6 7 8
	//	1 2 3 4 5 6 7
	//	1 2 3 4 5 6 
	//	1 2 3 4 5
	//	1 2 3 4 
	//	1 2 3 
	//	1 2 
	//	1
		
	    for(int i = 10; i >= 1; i--) {
	    	for(int j = 1; j <= i; j++) {
	    		System.out.print(j);
	    	}
    		System.out.println();
	    }
			
		
	//7.請設計一隻Java程式，輸出結果為以下：
	//	A     (unicode)41->65(十進位)
	//	BB             42->66
	//	CCC            43->67
	//	DDDD           44->68
	//	EEEEE          45->69
	//	FFFFFF         46->70
//		System.out.println((int)'A');
		
	    
	  for(char i = 65; i <= 70; i++) {
		  
		  for( int j = 65; j <= i; j++) {
	    		System.out.print(i);
		  }
		  
  		System.out.println();
	  }
		

		
	}
}
