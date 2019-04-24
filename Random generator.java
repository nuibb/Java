
package javaapplication7;

import java.util.Random;

public class Main {
public static void main(String[] args) {
    Random r1= new Random();
    //r1.nextInt(5o);//0-49 randomly nibe.
    //r1.nextInt(5-1+1)+1;//1-5 randomly nibe [nextInt(max-min+1)+min]
    //r1.nextInt(50-40+1)+40;//40-50 randomly nibe [nextInt(max-min+1)+min]
    //r1.nextInt(50-40)+40;//40-49 randomly nibe [nextInt(max-min)+min]
    //r1.nextInt(50-40);//1-9 randomly nibe [ nextInt(max-min)]
    for(int i=0;i<r1.nextInt(5-1+1)+1;i++){
          int p=r1.nextInt(50-40+1)+40;//0-50 randomly nibe
          System.out.print(p+" ");
    }
}
}
