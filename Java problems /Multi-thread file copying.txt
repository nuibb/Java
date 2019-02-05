
package javaapplication6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class filecopy{
    public filecopy(){
    }
    public void copy(String in_path,String out_path){
        BufferedReader br = null;
        BufferedWriter bw = null;
        String s;
        try{
            br = new BufferedReader(new FileReader(in_path));
            bw = new BufferedWriter(new FileWriter(out_path,true));
            while((s=br.readLine())!=null){
                bw.write(s);
                bw.newLine();
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            try{
                br.close();
                bw.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class newthread implements Runnable{
    Thread t;
    filecopy fc = new filecopy();
    String name,in_path,out_path;

    public newthread(String new_file_thread,String in_path,String out_path) {
        name= new_file_thread;
        this.in_path=in_path;
        this.out_path=out_path;
        t= new Thread(this,name);
        System.out.println("Thread "+name+" initialize : "+t);
        t.start();
    }
    
    public void run(){
       fc.copy(in_path, out_path);
       System.out.println("Thread "+t.getName()+" switching : "+t);
    } 
}
class Main{  
    public static void main(String[] args) {
        String in_path = "C:/Users/Nahid Lapi/Desktop/New folder (2)/as.txt";
        String out_path1 = "C:/Users/Nahid Lapi/Desktop/New folder (2)/ass.txt";
        String out_path2 = "C:/Users/Nahid Lapi/Desktop/ass.txt";
        String out_path3 = "C:/Users/Nahid Lapi/Desktop/New folder (2)/New folder/nuibb.txt";
        
        newthread a1 =  new newthread("file1",in_path,out_path1);
        newthread a2 =  new newthread("file2",in_path,out_path2);
        newthread a3 =  new newthread("file3",in_path,out_path2);
        newthread a4 =  new newthread("file4",in_path,out_path3);
        
        System.out.println(a1.t.isAlive());
        System.out.println(a2.t.isAlive());
        System.out.println(a3.t.isAlive());
        
        try{
            a1.t.join();
            a2.t.join();
            a3.t.join();
            a4.t.join();
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        
        System.out.println(a1.t.isAlive());
        System.out.println(a2.t.isAlive());
        System.out.println(a3.t.isAlive());
    }
}
