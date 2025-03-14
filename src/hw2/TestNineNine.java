package hw2;

public class TestNineNine {
	
	public static void main(String[] args) {
		
		
//		//教材 for + for
//		int i, j;
//		for (i = 1; i <= 9; i++) {
//			for (j = 1; j <= 9; j++)
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//			System.out.println();
//		}
		
		
//		//for + while
//		int i,j;
//		for(i = 1; i <=9; i++) {
//			j = 1;
//			while(j <= 9) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}
//			System.out.println();	
//		}
		
		
//		//for + do while
//		int i,j;
//		for(i = 1; i <=9; i++) {
//			j = 1;			
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;	
//			}while(j <= 9);
//			System.out.println();	
//		}
		
		
		//while + do while
		int i=1, j;
		while(i <= 9) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}while(j <= 9);
			System.out.println();
			i++;
		}

		
	}
}
