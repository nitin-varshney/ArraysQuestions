public class ReversingTheArray{
    static void Reversing(int arr[]){
        
        int n=arr.length;   
        int low=0;
        int high=n-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        
        int arr[]={10,51,45,20,32,56,85,48,75};
        Reversing(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
