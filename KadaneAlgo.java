import java.util.Scanner;
public class KadaneAlgo {
    static  void maxSumSubarray(int arr[]){
        
    int maxSum=0;
    int currSum=0;
        for (int i = 0; i < arr.length; i++) {
            currSum=currSum+arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println("The Maximumsum is "+maxSum);

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int []arr=new int[n];

        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        maxSumSubarray(arr);
    } 
}
