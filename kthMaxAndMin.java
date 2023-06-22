import java.util.*;
public class kthMaxAndMin {


    static void KthLargest(int a[],int k){

        PriorityQueue<Integer>pq=new PriorityQueue<>();

        for(int i=0;i<k;i++){
            pq.add(a[i]);
        }
        for(int i=k;i<a.length;i++){
            if(pq.peek()<a[i]){
                pq.poll();
                pq.add(a[i]);
            }
        }
        System.out.println("maximum is :- "+pq.peek());
    }
    static void KthMinimum(int b[],int k){
        PriorityQueue<Integer>pqs=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<k;i++){
            pqs.add(b[i]);
        }
        for(int i=k;i<b.length;i++){
            if(pqs.peek()>b[i]){
                pqs.poll();
                pqs.add(b[i]);
            }
        }
        System.out.println("minimum is :- "+pqs.peek());
    }
    public static void main(String[] args) {
        int a[]={10,45,48,75,95,6};
        int b[]={10,45,48,75,95,6};
        KthLargest(a,4);
        KthMinimum(b,4);
        
    } 
    
}
