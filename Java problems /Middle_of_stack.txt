public class Main {
    int stack[];
    int top;
    Main(int a){
        stack = new int[a];
        top=-1;
    }
    public void push(int a){
        if(top==stack.length-1)
            System.out.println("stack overflow");
        else {
            stack[++top]=a;
            System.out.print(stack[top]+" ");
        }
    }
    
    public int pop(){
        if(top<0){
            System.out.print("Stack underflow");
            return 0;
        }
        else
            return stack[top--];
    }
    
    public int getmiddle(){
        int middle = (0+top)/2;  
        return stack[middle];
    }
    
    public static void main(String[] args){
        Main a=new Main(10);
        for(int i=0;i<10;i++){
            a.push(i*10);
        }
        System.out.println();
        System.out.println(a.getmiddle());
        for(int i=0;i<10;i++){
            System.out.print(a.pop()+" ");
       }
        System.out.println();
    }
}
