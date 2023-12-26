class MyStack {

    //Using single queue.
    Queue<Integer> q=new LinkedList<Integer>();
    public MyStack() {
        
    }
    //2 3 4 5 6
    
    public void push(int x) {
        q.add(x);
        for(int i=0;i<q.size()-1;i++)
        {
            q.add(q.peek());
            q.remove();
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        if (q.isEmpty())
            return true;
        else
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */