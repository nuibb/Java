
package primenum;

public class prime {
    public static void prime_func(int n){
        int a[]=new int[n/2];
        
        for(int i=1,j=0;i<n;i+=2){
            a[j++]=i; 
        }        
        for(int i=3;i<Math.sqrt(n);i+=2){
            for(int j=3;i*j<n;j+=2){
            a[(i*j)/2]=0;
            }
        }
         
        for(int i=0;i<n/2;i++){
            if(i==1)System.out.print(2+" ");
            if(a[i]!=0)
                System.out.print(a[i]+"  ");
        }    
    }

    public static void main(String[] args) {
        prime p = new prime();
        prime_func(500);
    }

}
