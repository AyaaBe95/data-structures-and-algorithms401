package utilities;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTree<T> {

    Node<T> overallRoot;
    ArrayList<T> values;

    public FizzBuzzTree(){
        this.overallRoot = null;
    }

    public FizzBuzzTree(Node<T> root){
        this.overallRoot = root;
    }

    public ArrayList<T> preOrder(){
        values = new ArrayList<T>();
        return preOrder(overallRoot);
    }

    ArrayList<T> preOrder(Node<T> root){
        if(root == null){
            return null;
        }

        values.add(root.value);
        preOrder(root.left);
        preOrder(root.right);

        return values;
    }

    public ArrayList<T> fizzBuzz(ArrayList<T> values){
        values = new ArrayList<>();
        values = this.preOrder();
        ArrayList<T> newTree = new ArrayList<>();

        if(overallRoot == null){
            return newTree;
        }

        for (Integer i = 0; i < values.size(); i++){
            if ((Integer) values.get(i)%3 == 0 && (Integer) values.get(i)%5 == 0 ) {
                newTree.add((T) "FizzBuzz");
            }else if ((Integer) values.get(i)%3 == 0){
                newTree.add((T) "Fizz");
            }else if ((Integer) values.get(i)%5 == 0){
                newTree.add((T) "Buzz");
            }else{
                newTree.add((T) values.get(i).toString());
            }
        }

        return newTree;
    }


}
