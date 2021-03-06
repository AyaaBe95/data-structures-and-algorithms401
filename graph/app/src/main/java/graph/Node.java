package graph;

public class Node <T>{

        T value;
        Node next;


        Node(T value){

            this.value = value;
        }

    public T getValue() {
        return value;
    }

    @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
}
