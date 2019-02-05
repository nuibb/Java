package javaapplication9;

import java.util.Scanner;
/*An Armstrong number is an n-digit number that is
  equal to the sum of the nth powers of its digits.*/
public class Bi_to_Deci {
    public static void main(String[] args) {
        long n=0,sum=0;
        int i=0;
        Scanner s = new Scanner(System.in);//371
        if(s.hasNextLong()){
            n=s.nextLong();
        }
        long l=n,m=n;
        while(m!=0){//length of the number
            m/=10;
            i++;
        }
        while(n!=0){
           long a=n%10;
           long b=a;
           for(int j=0;j<i-1;j++){
               b=b*a;//nth power of the digit  
           }
           sum+=b;
           n/=10;
        }
        if(l==sum)
            System.out.println(l+" is a armstrong number");
        else
            System.out.println(l+" is not armstrong number");
    }
}
