package stack.and.queue;

public class stack <T> {
    Node top;

    public stack() {
        this.top = null;
    }

    public stack(T value) {
        this.top = new Node(value);

    }

    public <T> void push(T value) {
        Node stackNode = new Node(value);
        stackNode.next = top;
        top = stackNode;
    }

    public Object pop(){
        Node lastNode = top;
        try {
            if (isEmpty()){
                return new NullPointerException();
            }
            top = top.next;
            lastNode.next = null;
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return lastNode;
    }


    public Object peek() {
        try {
            if (isEmpty())
                return new NullPointerException();
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return top.data;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

}
