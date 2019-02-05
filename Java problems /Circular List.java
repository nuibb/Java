
package JavaApplication1;
class Node{
    int i;
    Node next;
}

class LinkNode{
    int item;
    Node current,head,temp,tail;
    LinkNode(){
        temp = new Node();
    }
    
    public void create(int node_num, int value){
        if(head==null){
            head = new Node();
            head.i=value;
            head.next=null;
            temp = head;
            //System.out.println(temp);
        }
        else {
            current =new Node();
            current.i=value;
            current.next=null;
            temp.next=current;
            temp=current;
            if(node_num==5){
                temp.next=head;
            }
        } 
    }
    
    public void display(){
        Node t=head;
        int n=0;
        while(t!=null && n<12){       
        System.out.print(t.i+"  ");
        t=t.next;
        n++;
        }
    }
    
    public boolean circularList(){
        Node t=head;
        while(t!=null){
            if(t.next==head){
                 System.out.println("Circular list exists");
                 return true;
            }
            t=t.next;
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
       int a; 
       LinkNode n = new LinkNode();
       
       //Linked List Creation
       for(int i=1;i<=5;i++){
            n.create(i,5*i);
       }
       
       //Linked List Display
       n.display();
       System.out.println();
       
       //Circular Linked List
       System.out.println(n.circularList());
    }
}
