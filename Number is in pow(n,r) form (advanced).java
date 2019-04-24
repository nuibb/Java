
package javaapplication5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner r =new Scanner(System.in);
        int n=0,temp,flag=0,s=0;//"s" => how many iteration so far
        if(r.hasNextInt()){
            n=r.nextInt();
        }
        int a=(int)Math.sqrt(n);
        int[] arr= new int[a];
        for(int i=2;i<=a;i++){
            arr[i-2]=i;
        }     
        for(int i:arr){
            if(i!=0){//does not allow zero values
               // System.out.println(i+"  ");//By which values n is checked.
                temp=n;
                int sum=0;//as to count r of pow(n,r)
                for( ; ; ){
                    if(temp==1){
                        System.out.println(n+" is "+i+" pow "+sum);
                        flag=1;
                        break;
                    }
                    if(temp%i==0){
                        //System.out.print(i+" ");
                        temp/=i;
                        sum++;
                        s++;
                    }
                    else{
                        for(int j=i;j<=a;j*=i){//values that should not be checked to n
                            arr[j-2]=0;//unchecked values position will be zero
                            s++;
                        }
                        break;
                    }
                }
                if(flag==1)//To prevent repeating.For Ex- 81 will show 3 pow 4 
                    break; //but will not show 9 pow 2
            }
        }
        if(flag==0)
            System.out.println("The number is not pow(n,r) form");
        System.out.println("Number of iteration so far: "+s);
    }
}