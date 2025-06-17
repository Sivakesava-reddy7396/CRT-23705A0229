import java.util.Stack;
public class Main{
    public static void main(String[] args){
        Stack<Integer> s =new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        pushBottop(s,40);
        System.out.println("elements in the stack are:");
        System.out.println(s);
    }
    public static void pushBottop(Stack<Integer>stack,int ele){
        if(stack.isEmpty()){
            stack.push(ele);
            return;
        }
        int val = stack.pop();
        pushBottop(stack,ele);
        stack.push(val);
    }
}