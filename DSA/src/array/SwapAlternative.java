package array;


public class SwapAlternative{

    public static void main(String[] args) {
        
        int[] arr = {1,2,3};


        //Print Array Before Swap
        for(int e:arr){
            System.out.print(e+" ");
        }

        System.out.println();

        //*****************Logic***************************************

        int index=0;
        while (index<arr.length-1) {
            int temp=arr[index];
            arr[index]=arr[index+1];
            arr[index+1]=temp;
            index=index+2;
        }

        
        //Print Array After Swap
        for(int e:arr){
            System.out.print(e+" ");
        }

    }
}