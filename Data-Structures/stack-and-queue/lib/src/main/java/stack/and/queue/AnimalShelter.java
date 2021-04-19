package stack.and.queue;

public class AnimalShelter <T> {

    Node<T> front;
    Node<T> rear;


    public void enqueue(T animal) {
        Node<T> newNode = new Node<T>(animal);

        if (this.front == null) {
            this.front = newNode;
            this.rear = newNode;

        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }

    public T dequeue(T pref) {
        Node<T> temp = this.front;
        if (temp == null) return null;
        if (pref != "dog" && pref != "cat") return null;
        else{
            this.front = this.front.next;
        }
        return pref;
    }

}
