class MyQueue {
    
    Stack<Integer> st1=new Stack();
    Stack<Integer> st2=new Stack();  
    public MyQueue() {
        
    }
    
    public void push(int x) {
        //s1->s2
        while(!st1.isEmpty())
            st2.push(st1.pop());
        st1.add(x);
        while(!st2.isEmpty())
            st1.push(st2.pop());
    }
    
    public int pop() {
        return st1.pop();
        
    }
    
    public int peek() {
        return st1.peek();
    }
    
    public boolean empty() {
        if(st1.isEmpty())
            return true;
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */