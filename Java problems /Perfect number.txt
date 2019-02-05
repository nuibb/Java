package javaapplication5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* a perfect number is a positive integer that is equal to the sum of its proper 
   positive divisors excluding itself or half of the sum of its proper positive 
   divisors including itself.*/

public class Perfect_number {
    public static void main(String[] args) throws IOException {
        int n=0;
        System.out.println("Enter the range of perfect number : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
        n=Integer.parseInt(br.readLine());
        }catch(Exception e){
           System.out.println(e);
        }
        for(int i=1;i<=n;i++){
            int sum=0;
            if(i==1)System.out.print(i+" ");
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i)
                System.out.print(i+" ");
        }
    }
}
