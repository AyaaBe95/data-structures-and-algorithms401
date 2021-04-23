package stack.and.queue;

public class stack <T> {

    Node top;

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public stack(T value) {

        this.top = new Node(value);
    }

    public stack() {
    }

    public void push(T value){
        try {
            Node node = new Node(value);
            node.next=top;
            top=node;
        } catch (Exception ex){
            System.out.println(ex);

        }

    }

    public Object pop() {
        if(!isEmpty()){
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

    public boolean isEmpty(){

        return top == null;
    }


    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }

}
