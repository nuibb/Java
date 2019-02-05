package nuib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Nuib  {
    public static ArrayList<Integer> Intersection(ArrayList<Integer> t1, ArrayList<Integer> t2){
        Set<Integer> set = new HashSet<Integer>();
        for(Integer i: t1){
            if(t2.contains(i)){
                set.add(i);//For not holding duplicate value
            }
        }
        
        return new ArrayList<Integer>(set);    
    }   
    public static ArrayList<Integer> Union(ArrayList<Integer> t1, ArrayList<Integer> t2){
       // List<Integer> list = new ArrayList<Integer>();
        
        //For not holding duplicate value of a particular set
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(t1);
        set.addAll(t2);
        
        //can hold duplicate value of a particular set
        /*for(Integer i: t2){
            if(!t1.contains(i)){
                t1.add(i);
            }
        }*/ //return t1;
        
        return new ArrayList<Integer>(set);      
    }
    
    public static ArrayList<Integer> Subtraction(ArrayList<Integer> t1, ArrayList<Integer> t2){
        //For not holding duplicate value of a particular set
        Set<Integer> set = new HashSet<Integer>();
       // set.addAll(t1);
        
        //can hold duplicate value of a particular set
        for(Integer i: t1){
            if(!t2.contains(i)){
                set.add(i);
            }
        }
        
        return new ArrayList<Integer>(set);      
    }
   
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<Integer>(Arrays.asList(100,400,500));
        ArrayList<Integer> list3;
        int a[]={200,300,500};
        for(int i=0;i<a.length;i++){
        list1.add(a[i]);
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(300);
        list2.add(500);
        list2.add(600);
        list2.add(600);
        System.out.println("List 1 :"+list1);
        System.out.println("List 2 :"+list2);
        list3 = Intersection(list1, list2);
        Integer p[] = new Integer[list3.size()];
        p= list3.toArray(p);
       // for(int i=0;i<list3.size();i++){
        //    System.out.print("Subtraction :"+p[i]+", ");
       // }
        System.out.println(list3);//output will not be sorted
        
        
        
        list3 = Union(list1, list2);
        p= list3.toArray(p);
        Arrays.sort(p);//for sorting
        System.out.print("Union : ");
        for(int i=0;i<list3.size();i++){
            System.out.print(p[i]+", ");
        }  
        System.out.println();
        //System.out.println(list3);//output will not be sorted
        
        
        list3 = Subtraction(list1, list2);
        p= list3.toArray(p);       
        System.out.print("Subtraction :");
        for(int i=0;i<list3.size();i++){
            System.out.print(p[i]+", ");
        }  
        System.out.println();
}
}