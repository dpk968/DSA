package devXplore;

import java.util.Scanner;

public class Himanshu {
	
	
	public static int[] funcArrange(int[] inputArr) {
		
		
		int even = 0;
		int odd = inputArr.length-1;
		int temp;
		
		
		while(even <= odd) {
			
			while(inputArr[even]%2==0)
				even++;
			
			while(inputArr[odd]%2!=0)
				odd--;
			
			if(even<odd) {
				temp = inputArr[even];
				inputArr[even] = inputArr[odd];
				inputArr[odd] = temp;				
				even++;
				odd++;
			}

		}
		
		return inputArr;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] ans = funcArrange(arr);
		
		for(int e:ans) {
			System.out.print(e+" ");
		}
		
		sc.close();
		
		
	}

}
