import java.util.Arrays;

public class MoveNegativeToOneSide {
    public static void main(String[] args) {
        int arr []={-10,-20,48,45,-53,-79,93};
        int left=0;
        int right=arr.length-1;

        while(left<right){
            
        while(arr[left]<0){
            left++;
        }
        while(arr[right]>0){
            right--;
        }

        if(left>=right){
            break;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        }
            System.out.println(Arrays.toString(arr));
   }
    
}
