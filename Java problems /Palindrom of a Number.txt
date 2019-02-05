package javaapplication5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrom_of_number {
    public static void main(String[] args) throws IOException {
        int n=0,sum=0;
        System.out.println("Enter the number : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
        n=Integer.parseInt(br.readLine());
        }catch(Exception e){
           System.out.println(e);
        }
        int temp = n;
        while(n>0){
           int i=n%10;
           n/=10;
           sum=sum*10+i;
       }
        if(sum==temp)
            System.out.println(sum+" is a palindrom");
        else
            System.out.println(sum+" is not a palindrom");
    }
}
