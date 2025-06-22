class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);  // Stack1 is used for pushing
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());  // Move all elements to stack2
            }
        }
        return stack2.pop();  // Pop from stack2 (which gives queue front)
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());  // Move all elements to stack2
            }
        }
        return stack2.peek();  // Peek front of the queue
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();  // Queue is empty only if both stacks are empty
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