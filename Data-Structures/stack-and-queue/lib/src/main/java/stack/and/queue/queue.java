package stack.and.queue;

public class queue <T>{

    Node front;
    Node Rear;

    public queue(T value) {
        this.front = new Node(value);
        this.Rear = this.front;
    }

    public queue() {
    }

    public void enqueue(T value){
        try {
            if (Rear == null){
                front = new Node(value);
                Rear = front;
            }else {
                this.Rear.next = new Node(value);
                this.Rear = this.Rear.next;
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public int dequeue(){
        int returnValue = -1;
        if (!isEmpty()) {
            returnValue = (int) front.value;
            front = front.next;
            return returnValue;
        }
        return returnValue;
    }


    public int peek() {
        if (!isEmpty()) {
            return (int) front.value;
        } else {
            return -1;
        }
    }


    public boolean isEmpty(){
        return front == null;
    }

    @Override
    public String toString() {
        return "queue{" +
                "front=" + front +
                ", Rear=" + Rear +
                '}';
    }
}
