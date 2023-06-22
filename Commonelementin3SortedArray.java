public class Commonelementin3SortedArray {
    static void commonElement(int a[],int b[],int c[]){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length && k<c.length ){
   
            if(a[i]==b[j] && b[j]==c[k]){
                System.out.print(" "+b[i]);
                i++;
                j++;
                k++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else if(b[j]<c[k]){
                j++;
            }
            else{
                k++;
            }       
        }
    }
    public static void main(String[] args) {

        int a[]={10,47,62,45,75,62};
        int b[]={17,20,92,45,55,6};
        int c[]={30,96,30,45,77,61};
        commonElement(a,b,c);
    
    }
    

}
