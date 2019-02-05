package javaapplication9;

import java.util.Scanner;

/*Strong number is a number for which sum of factorials
  of the digits is equal to the given number.Ex- 145 */

public class Bi_to_Deci {
    public static long factorial(long n){
        long res;
        if(n==1)return 1;
        res=n*factorial(n-1);
        return res;     
    }
    public static void main(String[] args) {
        long n=0,sum=0;
        Scanner s = new Scanner(System.in);//145
        if(s.hasNextLong()){
            n=s.nextLong();
        }
        long l=n;
        while(n!=0){
            //long a=n%10;
            //System.out.print("Factorial of "+a+" : ");
            //a=factorial(a);
            //System.out.println(a);
            sum+=factorial(n%10);
            n/=10;
        }
        if(l==sum)
            System.out.println(l+" is strong number");
        else
            System.out.println(l+" is not strong number");
    }
}
