package stack.and.queue;

public class queue <T>{

    Node front;
    Node rare;

    //Empty Queue
    public queue(T value) {
        this.front = new Node(value);
        this.rare=this.front;

    }

    public queue(){

    }

    public void enqueue(T value){
        try {
            if (rare == null){
                front = new Node(value);
                rare = front;
            }else {
                this.rare.next = new Node(value);
                this.rare = this.rare.next;
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public Object dequeue(){
        Node firstNode = front;
        try {
            if (isEmpty())
                return new NullPointerException();
            if(front == rare){
                rare = null;
            }
            front = front.next;
            firstNode.next = null;
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return firstNode;
    }


    public Object peek(){
        try {
            if (isEmpty())
                return new NullPointerException();
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return front.data;
    }


    public Boolean isEmpty() {
        if(front == null) {
            return true;
        }
        return false;
    }
}
