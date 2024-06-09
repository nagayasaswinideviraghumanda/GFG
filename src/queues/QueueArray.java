package queues;
class MyQueue {

    int front, rear;
    int arr[] = new int[100005];

    MyQueue()
    {
        front=-1;
        rear=-1;
    }

    //Function to push an element x in a queue.
    void push(int x)
    {
        // Your code here
        int cap = arr.length;
        int size = rear-front+1;
        if(size>=0 && size<cap) {
            if(front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else {
                rear = (rear+1)%cap;
            }
            arr[rear] = x;
        }
    }

    //Function to pop an element from queue and return that element.
    int pop()
    {
        int size = rear-front+1;
        int cap = arr.length;
        int d = -1;
        if(rear != -1 && size > 0) {
             d = arr[front];
            front = (front+1)%cap;
        }
        return d;
        // Your code here
    }

    public static void main(String...args) {
        MyQueue q = new MyQueue();
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}