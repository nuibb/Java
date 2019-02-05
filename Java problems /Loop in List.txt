
package JavaApplication1;
class Node{
    int i;
    Node next;
}

class LinkNode{
    int item;
    Node current,head,temp,loop;
    LinkNode(){
        temp = new Node();
    }
    
    public void create(int node_num, int value){
        if(head==null){
            head = new Node();
            head.i=value;
            head.next=null;
            temp = head;
            //if(node_num==1)
                //loop=temp;
        }
        else {
            current =new Node();
            current.i=value;
            current.next=null;
            temp.next=current;
            temp=current;
            if(node_num==3)
                loop=temp;
            if(node_num==5){
                temp.next=loop;
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
    
    public boolean loopInList(){
        Node slow,fast1,fast2;
        slow = fast1= fast2 = head;
        while(slow!=null && (fast1=fast2.next)!=null && (fast2=fast1.next)!=null){
            if(slow==fast1  ||  slow== fast2){
                System.out.println("loop exists");
                return true;
            }
            slow=slow.next;
        }
        System.out.println("loop does not exists");
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
       
       //Loop in Linked List
       System.out.println(n.loopInList());
    }
}
