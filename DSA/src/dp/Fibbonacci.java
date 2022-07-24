package dp;

import java.util.Arrays;
import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		
		System.out.println("Fibbonacci using dp : ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n+1];
		Arrays.fill(arr, -1);
		int find = fibbo(n,arr);
		
		System.out.println(find);
		
		sc.close();
		
		
		
	}

	public static int fibbo(int num,int[] arr) {
		
		if(num<=1)
			return num;
		
		//memoization
		if(arr[num]!=-1)
			return arr[num];
		
		arr[num] = fibbo(num-1,arr) + fibbo(num-2,arr);
		
		
		
		return arr[num];
	}

}
