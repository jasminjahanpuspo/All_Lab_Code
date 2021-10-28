package teststack;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1=new Stack();
        Stack mystack2=new Stack();
        int i;
        
        for(i=0; i<10; i++)
            mystack1.push(i);
        for(i=10; i<20; i++)
            mystack2.push(i);
            
        
        System.out.println("Stack in mystack1");
        for(i=0; i<10; i++)
            System.out.println(mystack1.pop());
        
        System.out.println("Stack in mystack2");
        for(i=0; i<10; i++)
            System.out.println(mystack2.pop());
        
    }    
}
class Stack{
    public int stack[]=new int[10];
    private int tos;
    Stack(){
        tos=-1;
    }
    void push(int item){
        if(tos==9){
            System.out.println("Stack is full");
        }
        else
            stack[++tos]=item;
    }
    int pop(){
        if(tos<0){
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stack[tos--];
    }
}

