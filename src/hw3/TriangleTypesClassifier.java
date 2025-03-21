package hw3;

import java.util.Scanner;

public class TriangleTypesClassifier {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TriangleTypesClassifier ttc = new TriangleTypesClassifier();

		//無窮迴圈使流程循環
		while(true) {
			
			System.out.println("請輸入三個整數：");
			
            if (sc.hasNextInt()) {
            	
    			int[] sides = ttc.getInputArray(sc);  //產生內容陣列
    			System.out.println(ttc.getTypeBySides(sides));  //顯示辨別結果
    			System.out.println();				
    			
            }else {
            	
            	System.out.println("格式錯誤，請確認是否輸入為整數");
    			System.out.println();				

    			sc.nextLine();  // 接收並棄掉殘留的錯誤輸入內容
            }
			
		}
	
	
	}
	
	//取輸入數字創立陣列
	public int[] getInputArray(Scanner sc) {
		
		int[] arr = new int[3];
		
		for(int i=0; i <= 2; i++) {			
			arr[i] = sc.nextInt(); 
		}
		return arr;
	}
	
	
	//依邊長判斷三角形類型
	public String getTypeBySides(int[] sides) {
		
		if(isTriangle(sides)) {
			
			if(sides[0] == sides[1] && sides[1] == sides[2]) {
				return "正三角形";
			}else if(sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]){
				return "等腰三角形";
			}else if(isRightTriangle(sides)) {
				return "直角三角形";
			}else {
				return "其它三角形";
			}
			
		}else {
			return "不是三角形";
		}		
	}
	
	
	//判斷是否為三角形 : 三邊都>0 && 任兩邊之和大於第三邊
	public boolean isTriangle(int[] sides) {
		return sides[0]>0 && sides[1]>0 && sides[2]>0 && 
			   sides[0] + sides[1] > sides[2] && 
	           sides[0] + sides[2] > sides[1] && 
	           sides[1] + sides[2] > sides[0];   
	}
	
	//判斷是否為 直角三角形 : 畢氏定理(a^2 + b^2 = c^2)
	public boolean isRightTriangle(int[] sides) {
		return Math.pow(sides[0],2) == Math.pow(sides[1],2) + Math.pow(sides[2],2) ||
			   Math.pow(sides[1],2) == Math.pow(sides[2],2) + Math.pow(sides[0],2) ||
			   Math.pow(sides[2],2) == Math.pow(sides[0],2) + Math.pow(sides[1],2);
	}
	

}
