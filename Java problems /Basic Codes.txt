01. Stack
02. Queue
03. Link list
04. Sorting
05. Database
06. Java basics
07. C/C++ basics
08. Android basics



package javaapplication3;

import java.io.IOException;

public class JavaApplication3 {
    public static void main(String[] args){
     
        
//GCD :

        int a,b,c;      
        if(b>a){
            a=b+a;
            b=a-b;
           a=a-b;        
          } 
 
         while(true){
            c=b;
            b=a%b;
            a=c;
            
            if(b==0){
                System.out.println("GCD :" + a);
                break;
            }          
        }
        
//LCD :

     {
 
        int a=4,b=6,x=a,y=b;      
       
        while(a!=b){
               
            if(a>b)
               a=a-b;
            else
               b=b-a;
            }
        System.out.prinyln("LCM : "+(x*y)/a)
     }
        
//1-10 namta in one loop  
   
        int i=1,j=1,k=1;
        for(i=1,j=1;i<=10;i=i+j/10,j=k+j%10){       
              System.out.print(i*j+" ");
              if(j%10==0){
                  System.out.println();
              }
        }
        
//matrix multiplication


result = 

  Niton Book;
        
        
//Selection Sort

 int min,a[]={10,2,4,1,8,3};
        
        for(int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min])
                    min=j;
            }
            int x;
            if(i!=min){
            x=a[i];
            a[i]=a[min];
            a[min]=x;
           // System.out.print(a[i]+"  ");
        }
        }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"  ");      
        
    }
}

