package teststack2;

public class Teststack2 {
    public static void main(String[] args) {
        Stack mystack1=new Stack(5);
        Stack mystack2=new Stack(8);
        int i;
        
        for(i=0; i<5; i++)
            mystack1.push(i);
        for(i=10; i<8; i++)
            mystack2.push(i);
            
        
        System.out.println("Stack in mystack1");
        for(i=0; i<5; i++)
            System.out.println(mystack1.pop());
        
        System.out.println("Stack in mystack2");
        for(i=0; i<8; i++)
            System.out.println(mystack2.pop());
        
    }    
}
class Stack{
    public int stack[];
    private int tos;
    Stack(int size){
        stack=new int[size];
        tos=-1;
    }
    void push(int item){
        if(tos==stack.length-1){
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


