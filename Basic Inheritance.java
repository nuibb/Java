
package javaapplication6;

class A{
     int show(){
         return 1;
       }
}

class B extends A{
     int show(){
         return 2;
       }
}


public class Main extends B{
    int show(){
         return 3;
       }
    public static void main(String[] args) {
        A a = new Main();
        B b= (B)a;
        System.out.print(b.show());
        
        
    }

}
