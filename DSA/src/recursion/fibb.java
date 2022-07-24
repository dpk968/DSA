package recursion;


import java.util.Scanner;

public class fibb {

	public static void main(String[] args) {

		
		System.out.println("Fibbonacci using recursion : ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int find = fibbo(n);
		
		System.out.println(find);
		
		sc.close();
		
	}
	
	public static int fibbo(int num) {
		
		if(num<=1)
			return num;
				
		return fibbo(num-1) + fibbo(num-2);
		
		
		
	}

}
