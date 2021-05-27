package hashtable;

import hashtable.tree.treeNode;
import org.junit.Test;

import java.util.HashSet;

public class treeTest {

    @Test
    public void treeIntersectionTest1 () {

        treeNode root1 = new treeNode(10,
                new treeNode(1, new treeNode(3), new treeNode(4)),
                new treeNode(1, new treeNode(4), new treeNode(5)));



        treeNode root2 = new treeNode(1,
                new treeNode(0), new treeNode(4));

        HashSet<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(4);

        System.out.println(treeIntersection.treeIntersection(root1, root2));


    }

    @Test
    public void treeIntersectionTest2 (){


        treeNode root1 = new treeNode(10,
                new treeNode(1, new treeNode(2), new treeNode(7)),
                new treeNode(8, new treeNode(6), new treeNode(17)));



        treeNode root2 = new treeNode(9,
                new treeNode(0), new treeNode(0));

        HashSet<Integer> expected = new HashSet<>();

        System.out.println(treeIntersection.treeIntersection(root1, root2));




    }

    @Test
    public void treeIntersectionTest3 () {


        treeNode root1 = new treeNode(10,
                new treeNode(1, new treeNode(8), new treeNode(7)),
                new treeNode(9, new treeNode(12), new treeNode(1)));


        treeNode root2 = new treeNode(10,
                new treeNode(2, new treeNode(12), new treeNode(7)),
                new treeNode(5));

        HashSet<Integer> expected = new HashSet<>();
        expected.add(12);
        expected.add(7);
        expected.add(10);
        expected.toArray();

//        System.out.println(treeIntersection.treeIntersection(root1, root2));



    }
}
