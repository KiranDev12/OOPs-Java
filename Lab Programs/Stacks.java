import java.util.Scanner;

class StackException extends Exception{
    StackException(String str){
        super(str);
    }
}

class Stack{
    private final int[] stk;
    private int size, top;

    Stack(int size){
        stk = new int[size];
        top = -1;
    }

    void push(int item) throws StackException{
        if(top>=size){
            throw new StackException("Stack Overflow");
        }
        else{
            stk[++top] = item;
        }
    }

    int pop() throws StackException{
        if(top<0){
            throw new StackException("Stack Underflow");
        }
        else{
            return stk[top--];
        }
    }

    void display() {
        if (top > -1) {
            System.out.print("Stack elements are: ");
            for (int i = top; i > -1; i--)
                System.out.print(stk[i] + " ");
        } else
            System.out.println("Stack Underflow!\n");
    }
}

class Stacks{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack stkObj = new Stack(1);
        try {
            System.out.println("Enter the data");
            stkObj.push(sc.nextInt());
        } catch (Exception e) {
            System.out.println("Stack Exception" + e);
        }
        try {
            System.out.println("Enter the data");
            stkObj.push(sc.nextInt());
        } catch (Exception e) {
            System.out.println("Stack Exception" + e);
        }
    }
}