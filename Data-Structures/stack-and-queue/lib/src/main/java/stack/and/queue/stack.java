package stack.and.queue;

public class stack <T> {

    Node top;

    public stack(T value) {
        this.top = new Node(value);
    }

    public stack() {
    }

    public void push(T value){
        try {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int returnValue = (int) top.value;
            top = top.next;
            return returnValue;
        }
        return -1;
    }

    public Object peek() {
        try {
            if (isEmpty())
                return new NullPointerException();
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return top.value;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }

    public boolean isEmpty(){
        return top == null;
    }
}
