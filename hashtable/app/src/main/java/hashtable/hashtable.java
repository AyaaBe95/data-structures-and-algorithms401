package hashtable;


import java.util.Arrays;
import java.util.LinkedList;

public class hashtable <T> {

 
    private static int INIT_TABLE_SIZE = 20;
    private LinkedList<Node<T>>[] arrayHash;
    private int size;

    public hashtable() {
        this.arrayHash = new LinkedList[INIT_TABLE_SIZE];
        this.size = 0;
    }


    public int hash(T key) {
        int hash = key.hashCode();
        return Math.abs(hash) % this.arrayHash.length;
    }


    public Node<T> add(T key, T value) {
        int index = hash(key);

        Node<T> newNode = new Node<>(key, value);

        if (this.arrayHash[index] == null) {
            this.arrayHash[index] = new LinkedList<>();
        }

        this.arrayHash[index].add(newNode);
        this.size++;

        return newNode;
    }


    public T get(T key) {
        int index = hash(key);

        if (this.arrayHash[index] != null) {
            for (Node node : this.arrayHash[index]) {
                if (node.key.equals(key)) {
                    return (T) node.value;
                }
            }
        }
        return null;
    }


    public boolean contains(T key) {
        int index = hash(key);

        if (this.arrayHash[index] != null) {
            for (Node n : this.arrayHash[index]) {
                if (n.key.equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "hashtable{" +
                "bucket=" + Arrays.toString(arrayHash) +
                '}';
    }


    public int size() {
        return this.size;
    }


}

