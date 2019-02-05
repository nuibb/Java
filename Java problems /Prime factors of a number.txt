package javaapplication5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime_factors {
    public static void main(String[] args) throws IOException {
        int n=0;
        System.out.println("Enter the number : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
        n=Integer.parseInt(br.readLine());
        }catch(Exception e){
           System.out.println(e);
        }
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                n/=i;
                i--;
            }
           
       }
    }
}
