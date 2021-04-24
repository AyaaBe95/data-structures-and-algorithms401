package stack.and.queue;

public class PseudoQueue <T>{

    public stack getStackQueue() {
        return stackQueue;
    }

    public void setStackQueue(stack stackQueue) {
        this.stackQueue = stackQueue;
    }

    public stack getStackHelper() {
        return stackHelper;
    }

    public void setStackHelper(stack stackHelper) {
        this.stackHelper = stackHelper;
    }

    stack stackQueue;
    stack stackHelper;

    public PseudoQueue() {
        this.stackQueue = new stack();
        this.stackHelper = new stack();
    }

    public void enqueue(T value){
        try {
            while (!stackQueue.isEmpty()){
                stackHelper.push(stackQueue.pop());
            }
            stackQueue.push(value);
            while (!stackHelper.isEmpty()){
                stackQueue.push(stackHelper.pop());
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public Object dequeue(){
        Object value = new Object();
        try {
            value = stackQueue.pop();
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return value;
    }

    @Override
    public String toString() {
        return "PseudoQueue{" +
                "stackQueue=" + stackQueue +
                ", stackHelper=" + stackHelper +
                '}';
    }
}
