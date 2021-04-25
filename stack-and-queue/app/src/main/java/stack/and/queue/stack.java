package stack.and.queue;

public class stack <T> {
        Node top;

        public stack() {
        }



        public void push(int value){
            try {
                Node node = new Node(value);
                node.next = top;
                top = node;
            }catch (Exception ex){
                System.out.println(ex);
            }
        }

        public Object pop(){
            Node lastNode = top;
            try {
                if (isEmpty()){
                    return new NullPointerException();
                }
                top = top.next;
                lastNode.next = null;
            }catch (NullPointerException ex){
                System.out.println(ex);
            }
            return lastNode;
        }

        public Object peek() {
            try {
                if (isEmpty())
                    return new NullPointerException();
            }catch (NullPointerException ex){
                System.out.println(ex);
            }
            return top.data;
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
