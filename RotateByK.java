import java.util.Arrays;

public class RotateByK {

    public static void rotate(int []arr,int K){
        K=K%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,K-1);
        reverse(arr,K,arr.length-1);
    }
    public static void reverse(int []arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr={10,20,60,10,45,84};
        rotate(arr,2);    
        System.out.println(Arrays.toString(arr));
    }
    
}

