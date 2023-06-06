
public class MaxAndMin {
    public static void main(String[] args) {
        int arr []={10,45,78,86,95,42,6};

        int max=arr[0];
        int min=arr[0];
    
        for(int val:arr){
            if(max<val){
                max=val;
            }
            if(min>val){
                min=val;
            }
    
        }
        System.out.println("maximun"+max);
        System.out.println("minimum"+min);
       
        
    }
   
}
