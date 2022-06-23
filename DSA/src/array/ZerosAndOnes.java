package array;

public class ZerosAndOnes {
        public static void main(String[] args) {
            

            int[] arr = {1,0,1,1,0,1,0,0,0};
            int s=0;
            int e=arr.length-1;
            while (s<e) {
                if(arr[s]>arr[e]){
                    int temp=arr[s];
                    arr[s]=arr[e];
                    arr[e] = temp;
                }
                s++;
                e--;
            }

            for(int element:arr)
            System.out.print(element+" ");

        }
}
