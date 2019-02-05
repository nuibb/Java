package javaapplication5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrom {
    public static void main(String[] args) throws IOException {
        String s1="",s2="";
        System.out.println("Enter the String : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s1=br.readLine();//abcba...abcde
        for(int i=s1.length()-1;i>=0;i--){        
            char ch = s1.charAt(i);
            s2+= ch;
        }
        if(s1.equals(s2))
            System.out.print(s1+" is a palindrom");
        else 
            System.out.print(s1+" is not a palindrom");
    }
}


###

package javaapplication7;

public class Main {
public static void main(String[] args) {
    String s1="abcdeecba";
    int flag =0;
    for(int i=0,j=s1.length()-1;i-1!=j && i!=j;i++,j--){
        char c1,c2;
        c1=s1.charAt(i);
        c2=s1.charAt(j);
        //System.out.println(c1+" "+c2);
        if(c1!=c2){
            flag=1;
            System.out.println(s1+" is not palindrom.");
            break;
        }
    }
    if(flag==0)System.out.print(s1+" is palindrom.");
    
    }
}
