package nuib;

import java.io.BufferedReader;
import java.util.Scanner;

class Nuib  {
   
    public static void main(String[] args) {
        
        //Scanner sc = new Scanner(System.in);
        //BufferedReader bf = new BufferedReader(sc);
        double s=91;
        double a= s,b;
        a= Math.log(a);
        int flag = 0;
             
        for(int i=2;i<=(int)Math.sqrt(s);i++){
            double p,r;
            b= Math.log(i);
            p=a/b;// "a" have to be constant for each pass of loop
            int q = (int)p;
            r= p-q;
            if(r==0.0){
                System.out.println(s + "= "+i+ " square "+q);
                flag = 1;
                break;// for not allowing repeat value
                // suppose for 81, pow(3,4) but not allowing pow(9,2)
            }       
        }
        if(flag==0){
            System.out.println("It is no power of any integer");
        }
    }
}