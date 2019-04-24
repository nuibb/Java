package javaapplication5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Perfect_number {
    public static void main(String[] args) throws IOException {
        int n=0,sum=0;
        System.out.println("Enter the range of perfect number : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
        n=Integer.parseInt(br.readLine());
        }catch(Exception e){
           System.out.println(e);
        }
       while(n>0){
           int i=n%10;
           n/=10;
           sum=sum*10+i;
       }
        System.out.println(sum);
    }
}
