package array;

public class reverseArray {

	static int[] reverseArr(int[] arr,int i,int end)
	{
        return arr;
	}
	
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
        
		
		int arr[] = {4,7,8,2,9,6};
		printArray(arr);

		int start=0,end=arr.length-1;
		System.out.println();
        
        int temp =0;
        while(start<=end) {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
		printArray(arr);
		

	}

}
