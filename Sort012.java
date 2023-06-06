//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo


// public class Sort012 {
//     public static void main(String[] args) {
//         int count0=0;
//         int count1=0;
//         int count2=0;
//             int arr[]={0,0,1,0,2,0,0,1,1,2,0};
//             for(int i=0;i<arr.length;i++){
//                 if(arr[i]==0){
//                     count0++;
//                 }
//                 if(arr[i]==1){
//                     count1++;
//                 }
//                 if(arr[i]==2){
//                     count2++;
//                 }
//             }
//             for(int i=0;i<count0;i++){
//                 arr[i]=0;
//             }
//             for(int i=count0;i<count0+count1;i++){
//                 arr[i]=1;  
//             }
//             for(int i=count0+count1;i<arr.length;i++){
//                 arr[i]=2;
//             }
//             for(int i=0;i<arr.length;i++){
//                 System.out.println(arr[i]);
//             }
            
//     }
    
// }



// second method dutch national flag algorithm


public class Sort012{

    static void sort(int arr[]){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        int temp;

        while(mid<=high){
            switch(arr[mid]){
                case 0:{;
                    temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
     int arr[]={0,0,1,0,2,0,0,1,1,2,0};
     sort(arr);
     for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
        
     }

      
    }
}