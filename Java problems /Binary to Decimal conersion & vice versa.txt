package javaapplication9;

public class Bi_to_Deci {
    long ConvertDecimal2Binary(long n){
        long sum=0,i=1;
        while(n!=0){
            long r=n%2;
            sum+=i*r;
            n=n/2;
            i*=10;
        }
        return sum;
    }
    long ConvertBinary2Decimal(long n){
        long sum=0,i=1;
        while(n!=0){
            long r= n%10;
            sum+=i*r;
            n/=10;
            i*=2;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Bi_to_Deci b = new Bi_to_Deci();
        System.out.println();
        System.out.println(b.ConvertBinary2Decimal(1000));
        System.out.println(b.ConvertDecimal2Binary(7));
    
    }
}
