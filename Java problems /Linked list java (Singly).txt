
package primenum;
class Node{
    int i;
    Node next;
}

class LinkNode{
    int item;
    Node current,head,temp;
    
    LinkNode(){
        temp = new Node();
        //item=temp.i;   
        
    }
    
    public void create(int a){
        if(head==null){
            head = new Node();
            head.i=a;
            head.next=null;
            temp = head;
           // System.out.println(temp);
        }
        else {
            current =new Node();
            current.i=a;
            current.next=null;
            temp.next=current;
            //System.out.println(temp+"  "+temp.next);
            temp=current;
            //System.out.println(temp+" "+temp.next);
        } 
    }
    
    public void display(){
        Node t=head;
        while(t!=null){       
        System.out.print(t.i+"  ");
        t=t.next;
        }   
    }  
    
    public void reverselist(){
      Node nextNode,prevNode,currNode;
      currNode=head;
      prevNode = null;
      nextNode = null;
      try{
       while(currNode!=null){
           nextNode = currNode.next;
           currNode.next = prevNode;
           prevNode = currNode;
           currNode = nextNode;     
        }
      }catch(NullPointerException e){
          System.out.print(e);
      }
      while(prevNode!=null){
          System.out.print(prevNode.i+"  ");
          prevNode=prevNode.next;     
      }     
    }
    
    public void insertionAfterValue(int value, int num){
        Node t=head;
        while(t!=null){
            if(t.i==value){
                Node tem= new Node();
                tem.i=num;
                tem.next=t.next;
                t.next=tem;
                break;        
            }
            t=t.next;
        }
    }
    public void insertionBeforeValue(int value){
        if(head.i==value){
            Node tem=new Node();
            tem.i=500;
            tem.next=head;
            head=tem;
        }
        else 
        {
            Node t1,t2;
            t1=head;
            while(t1!=null){
                t2=t1.next;
                if(t2.i==value){
                    Node tem= new Node();
                    tem.i=50;
                    tem.next=t2;
                    t1.next=tem;
                    break;
                }
                t1=t1.next;
            }
        }
    }
    
    public void insertionbyPosition(int pos,int num){
        int i=1,flag=0;
        if(pos==1){
            flag = 1;
            Node tem=new Node();
            tem.i=num;
            tem.next=head;
            head=tem;     
        }
        else
        {
            Node t1,t2;
            t1=head;
            while(t1!=null){
                i++;
                t2=t1.next;
                if(i==pos){
                    flag = 1;
                    Node tem=new Node();
                    tem.i=num;
                    tem.next=t2;
                    t1.next=tem;
                    break;
                }
                t1=t1.next;
            }
        }
        if(flag==0)
        {
            System.out.println("Invalid Position");
            System.out.print("Previous List is       :  ");
        }
    }
    
    public void deletebyPosition(int pos){
        int i=1;
        if(pos==1){
            head=head.next;
        }
        else
        {
            Node t1,t2;
            t1 = head;
            try{
                while(t1!=null){
                    t2=t1.next;
                    i++;
                    if(i==pos){
                        t1.next=t2.next;
                        break;
                    }
                    t1=t1.next;
                }
            }catch(NullPointerException e){}
        }
    }
    
    public void deletebyValue(int value){
        if(head.i==value){
            head=head.next;
        }
        else 
        {
            Node t1,t2;
            t1=head;
            try{
                while(t1!=null){
                    t2=t1.next;
                    if(t2.i==value){
                        t1.next=t2.next;
                        break;
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
       System.out.print("Initial List           :  ");
       n.display();
       System.out.println();
       
       //Insertion after value in Linked List
       System.out.print("Insertion after value  :  ");
       n.insertionAfterValue(15,100);
       n.display();
       System.out.println();
       
       //Insertion before value in Linked List
       System.out.print("Insertion before value :  ");
       n.insertionBeforeValue(5);
       n.display();
       System.out.println();
       
       //Insertion by position in Linked List
       System.out.print("Insertion by position  :  ");
       n.insertionbyPosition(5,200);
       n.display();
       System.out.println();
       
       //Delete by position in Linked List
       System.out.print("Delete by position     :  ");
       n.deletebyPosition(5);//if position is out of range then null pointer exception will through
       n.display();
       System.out.println();
       
       //Delete by value in Linked List
       System.out.print("Delete by value        :  ");
       n.deletebyValue(100);//if value is not in the list then null pointer exception will through
       n.display();
       System.out.println();
          
       //Linked List Reverse then Display
       System.out.print("Reverse List           :  ");
       n.reverselist();
       System.out.println();
       n.display();//After reverse initial list has been lost
    }
}
