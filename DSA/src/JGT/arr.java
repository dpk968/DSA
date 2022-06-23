package JGT;

public class arr{
    public static void main(String[] args) {
        
        int arr[] = {1,2,4,8,10,12}; 

        int i=0,j=arr.length-1;

        int k = 3;
        int second = k-arr[0];
        boolean pairFound  = false;

        while (i<j) {
            if(arr[j]>second){
                j--;
            }else if(arr[j]==second){
                System.out.println("K : "+k+" ");
                pairFound = true;
                System.out.println("Pair are : "+arr[i]+" "+arr[j]);
                break;
            }else{
                i++;
                second = k-arr[i];   
            }
        }

        if(!pairFound){
            System.out.println("No pair found for K :"+k);
        }
    }
}