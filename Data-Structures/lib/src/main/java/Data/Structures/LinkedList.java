package Data.Structures;


public class LinkedList {
    public class Node {

        public int data;
        public Node next;


        // constructor
        public Node(int d) {

            this.data = d;
            next = null;
        }
    }


    public Node head;

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(3);
        l.insert(4);
        l.append(5);
        l.insertBefore(5, 9);
        l.insertAfter(5, 9);

        System.out.println(l.kthFromTheEnd(0));
        l.toString();

    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public boolean Includes(int d) {
        Node current = this.head;


        while (current.next !=null){
            if (current.data==d){
                System.out.print("true");
                return true;

            }

            current=current.next;
        } System.out.print("false");

        return false;
    }

    public String toString() {
        String msg = " ";
        while (head != null) {
            msg = msg + "{" + head.data + "}" + " -> ";
            head = head.next;
        }
        msg = msg + "NULL";
        System.out.print(msg);
        return msg;
    }

    public void append(int val) {
        Node value = new Node(val);
        if (head == null) {
            head = value;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = value;
        }


    }

    public void insertBefore(int oldValue, int newValue) {

        Node current = head;
        if (current.data == oldValue) {
            Node node1 = new Node(newValue);
            node1.next = current;
            head = node1;
        } else {
            while (current.next.data != oldValue) {
                current = current.next;
            }
            Node node = new Node(newValue);
            node.next = current.next;
            current.next = node;
        }

    }

    public void insertAfter(int oldValue, int newValue) {
        Node current = head;
        if (current.data == oldValue) {
            Node node1 = new Node(newValue);
            node1.next = current;
            head = node1;
        } else {
            while (current.data != oldValue) {
                current = current.next;
            }
            Node node = new Node(newValue);
            Node j = current.next;
            current.next = node;
            node.next = j;
        }
    }

    public int kthFromTheEnd(int kth){
        int lengthOfList = 0;
        Node current = head;

        while(current.next != null){
            lengthOfList += 1;
            current = current.next;
        }

        if(kth > lengthOfList){
            throw new IllegalArgumentException("The kth value is greater than the length of the linked list");
        }

        int frontIndex = lengthOfList - kth;
        current = head;

        while(frontIndex != 0){
            current = current.next;
            frontIndex -= 1;
        }

        return current.data;
    }


    }


