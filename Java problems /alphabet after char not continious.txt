
package javaapplication1;

/* alphabet will be placed after character but
   not have to continuous in o(1) space. */

public class Main {
    
    public static void main(String[] args){
    String s = "a1b2c3d4e5f6";
    int a=s.length()/2;
    System.out.println(a);
    char ch[]=s.toCharArray();
    for(int i =1; i<s.length()/2;i=i+2,a+=2){
        char c= ch[i];
        ch[i]=ch[a];     
        ch[a]=c;
    }
    for(int i=0;i<ch.length;i++){
        System.out.print(ch[i]+" ");
    }
   
    }
}
