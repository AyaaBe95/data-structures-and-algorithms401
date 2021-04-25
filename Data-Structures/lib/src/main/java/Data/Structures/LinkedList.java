package Data.Structures;


public class LinkedList {


    public  Node head;

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(3);
        l.insert(4);
        l.toString();
    }

    public void  insert(int data){
        Node node = new Node(data);
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public boolean Includes(int d){
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

}