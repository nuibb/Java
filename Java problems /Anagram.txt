
package javaapplication2;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       int a=1;
       String[] s= {"tokyo", "dhaka","cennai","kyoto", "madraj","akahd","oktyo","faridpur"};
       String[] s1 = new String[s.length];
       for(int i=0;i<s.length;i++){
           char[] ch=s[i].toCharArray();
           Arrays.sort(ch);
           String s2= new String(ch);
           s1[i]=s2;    
       }
       for(int i=0;i<s1.length;i++){
           int flag =0;
           int n=0;//for print only first appear common string
           for(int j=i+1;j<s1.length;j++){            
               if(s1[i].equals(s1[j])){
                   if(n==0)System.out.print(s[i]);
                   n++;
                   flag=1;
                   System.out.print(" and "+s[j]);
                   s1[j]=""+a++;//for repeatation handling
               }
           }
           if(flag==1)
           System.out.println(" is anagram.");
       }
    }

}
