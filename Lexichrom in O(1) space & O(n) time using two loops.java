
package javaapplication5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner r =new Scanner(System.in);
       String s=r.nextLine().trim();//leading & trailing whitespace is omitted
       int a=s.length(),flag=0;
       if(a%2!=0){
           System.out.println("The no. of char in String is odd. Lexichro. not possible");
       }
       else{
            for(int i=0;i<a-1;i=i+2){
                char ch=s.charAt(i);
                if(ch>=65 && ch<90 || ch>=97 && ch<=122)//a-z || A-Z
                    System.out.print(ch);
                else{
                    flag=1;
                    System.out.println();
                    System.out.println("wrong input");
                    break;
                }
            }
            if(flag==0){
                for(int i=1;i<a;i=i+2){
                    char ch=s.charAt(i);
                    if(ch>=49 && ch<=57)
                        System.out.print(s.charAt(i));
                    else{
                        System.out.println();
                        System.out.print("wrong input");
                        break;
                    }
                }
            }
       }
    }
}