
package primenum;
class Node{
    int i;
    Node next,prev;
}

class LinkNode{
    int item;
    Node current,head,temp,tail;
    LinkNode(){
        temp = new Node();
    }
    
    public void create(int a){
        if(head==null){
            head = new Node();
            head.i=a;
            head.next=null;
            head.prev=null;
            temp = head;
            tail=temp;
            //System.out.println(temp);
        }
        else {
            current =new Node();
            current.i=a;
            current.next=null;
            current.prev=temp;
            temp.next=current;
            //System.out.println(temp+"  "+temp.next+"  "+temp.prev);
            temp=current;
            tail=temp;
            //System.out.println(temp+" "+temp.prev);
        } 
    }
    
    public void display(){
        Node t=head;
        while(t!=null){       
        System.out.print(t.i+"  ");
        t=t.next;
        }
        System.out.println();
        Node t1=tail;
        while(t1!=null){       
        System.out.print(t1.i+"  ");
        t1=t1.prev;
        } 
    }
    
    public void insertionByPosition(int pos){
        if(pos==1){
            Node tem=new Node();
            tem.i=500;
            tem.next=head;
            head.prev=tem;
            tem.prev=null;
            head=tem;
        }
        else 
        {
            int i=1;
            Node t1,t2;
            t1=head;
            while(t1!=null){
                t2=t1.next;
                if(t1==tail && pos>i){
                    Node tem = new Node();//last node or tail node
                    tem.i=300;
                    tem.next=null;
                    tem.prev=tail;
                    tail.next=tem;
                    tail=tem;
                    break;// break na dile exceeption through habe 
                    }
                else if(++i==pos){
                    Node tem= new Node();
                    tem.i=50;
                    tem.next=t2;
                    t2.prev=tem;
                    tem.prev=t1;
                    t1.next=tem;
                    break;
                }
                t1=t1.next;
            }
        }
    }
   
    public void deletebyValue(int value){
        if(head.i==value){  //head delete
            head=head.next;
            head.prev=null;
        }
        else if(tail.i==value){  // tail delete
            tail=tail.prev;
            tail.next=null;
        }
        else // delete the value at first appearance between head & tail
        {
            Node t1,t2;
            t1=head;
            try{
                while(t1!=null){
                    t2=t1.next;
                    if(t2.i==value){
                        t1.next=t2.next;
                        t2.next.prev=t1;
                        break;//break na dile head & tail er majher sob same value del hoa jabe
                    }
                    t1=t1.next;
                }
            }catch(NullPointerException e){}
        } 
    }
}

public class prime {
    public static void main(String[] args) {
       int a; 
       LinkNode n = new LinkNode();
       
       //Linked List Creation
       for(int i=1;i<=5;i++){
            n.create(5*i);
       }
       
       //Linked List Display
       System.out.println("Initial List           :  ");
       n.display();
       System.out.println();
       
       //Insertion by position in Linked List
       try{
       System.out.println("Insertion by position  :  ");
       n.insertionByPosition(4);
       n.display();
       System.out.println();
       }catch(NullPointerException e){
           System.out.println(e);
       }
       
       //Delete by value in Linked List
       int val=10;
       System.out.println("Delete by value ("+val+")  :  ");
       n.deletebyValue(val);//if value is not in the list then null pointer exception will through
       n.display();
       System.out.println();
    }
}
