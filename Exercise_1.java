// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Stack {

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        return top < 0;
    } 

    Stack() 
    {
        top = -1;
    } 
  
    boolean push(int x) 
    {
        //Check for stack Overflow
        if (top == MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        }

        top++;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        return a[top--];
    } 
  
    int peek()
    {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        }

        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack();
        s.push(10);
        s.push(20); 
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    } 
}
