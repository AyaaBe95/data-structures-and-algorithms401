package Data.Structures;


public class LinkedList {


    Node head=null;
    Node tail = null;


    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.toString();


    }

    public void  insert(int element){
        //CREATE OBJ FROM NODE CLASS
        Node tmp = new Node();


        if (head==null){
            //insert
            tmp.data=element;
            //head pointer to data
            head=tmp;
            //tail pointer to data
            tail=tmp;

        } else {
            //store
            tmp.data=element;
            //point to new node
            head.next=tmp;
            tail=tmp;

        }
    public void  insert(int data){
        this.head=new Node(data,this.head);

    }

    public boolean Includes(int d){
        Node current = this.head;

        while (current.next !=null){
            if (current.data==d){
                return true;

            }
            current=current.next;
        }
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

    public void append(int val){
        Node addedNode = new Node(val);
    }






}