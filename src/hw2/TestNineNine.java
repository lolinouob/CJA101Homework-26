package hw2;

public class TestNineNine {
	
	public static void main(String[] args) {
		
		int i, j;
		
		//教材 for + for
		System.out.println("for + for");
		
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++)
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			System.out.println();
		}
		
		System.out.println();
		
		
		//for + while
		System.out.println("for + while");
		
		for(i = 1; i <=9; i++) {
			j = 1;
			while(j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();	
		}
		
		System.out.println();
		
		
		//for + do while
		System.out.println("for + do while");
		
		for(i = 1; i <=9; i++) {
			j = 1;			
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;	
			}while(j <= 9);
			System.out.println();	
		}
		
		System.out.println();
		
		
		//while + do while
		System.out.println("while + do while");
		
		i=1;
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
