
package stack.and.queue;

public class App {


    public static void main(String[] args) {

        stack stack = new stack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        stack.push(5);
        stack.push(7);
        stack.push(8);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());


    }
}
