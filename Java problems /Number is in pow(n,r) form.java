
package javaapplication3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner r =new Scanner(System.in);
        int n=0,t;
        if(r.hasNextInt()){
            n=r.nextInt();
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            t=n;
            int sum=0,flag=0;
            for( ; ; ){
                if(t==1){
                    System.out.println(n+" is "+i+" pow "+sum);
                    flag=1;
                    break;
                }
                else if(t%i==0){
                    //System.out.print(i+" ");
                    t/=i;
                    sum++;
                }
                else
                    break;
            }
            if(flag==1)//To prevent repeating.For Ex- 81 will show 3 pow 4 
                break; //but will not show 9 pow 2
        }
    }
}
