package graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class depthFirstTest {

    @Test
    public void addTest() {
        Graph graph = new Graph();
        Vertex A = new Vertex("A");
        graph.addNode(A);
        Vertex B = new Vertex("B");
        graph.addNode(B);
        Vertex D = new Vertex("D");
        graph.addNode(D);
        Vertex C = new Vertex("C");
        graph.addNode(C);
        Vertex G = new Vertex("G");
        graph.addNode(G);
        Vertex E = new Vertex("E");
        graph.addNode(E);
        Vertex H = new Vertex("H");
        graph.addNode(H);
        Vertex F = new Vertex("F");
        graph.addNode(F);
        graph.addEdge(A, B, 0);
        graph.addEdge(A, D, 0);
        graph.addEdge(B, C, 0);
        graph.addEdge(B, D, 0);
        graph.addEdge(C, G, 0);
        graph.addEdge(D, E, 0);
        graph.addEdge(D, F, 0);
        graph.addEdge(D, H, 0);
        graph.addEdge(F, H, 0);

        System.out.println(graph.getNodes());
        System.out.println(graph.depthFirstMethod(A));
        List<Vertex> nodes=graph.getNodes();
        ArrayList<Vertex> output=graph.depthFirstMethod(A);
        System.out.println(output);
        System.out.println(graph.depthFirstMethod(A));
        assertEquals("[A, D, H, F, E, B, C, G]",graph.depthFirstMethod(A).toString());

    }

    @Test
    public void addTestWithOneNode() {
        Graph graph = new Graph();
        Vertex A = new Vertex("A");
        graph.addNode(A);
        System.out.println(graph.getNodes());
        List<Vertex> nodes=graph.getNodes();

        System.out.println(graph.depthFirstMethod(A));
        assertEquals("[A]",graph.depthFirstMethod(A).toString());
    }

    @Test
    public void addTestMoreThanOneNode() {
        Graph graph = new Graph();
        Vertex A = new Vertex("A");
        graph.addNode(A);
        Vertex B = new Vertex("B");
        graph.addNode(B);
        Vertex D = new Vertex("D");
        graph.addNode(D);
        Vertex E = new Vertex("E");
        graph.addNode(E);

        graph.addEdge(A, B, 0);
        graph.addEdge(B, D, 0);
        graph.addEdge(D, E, 0);


        System.out.println(graph.getNodes());
        System.out.println(graph.depthFirstMethod(A));
        List<Vertex> nodes=graph.getNodes();
        ArrayList <Vertex>output=graph.depthFirstMethod(A);
        System.out.println(output);
        System.out.println(graph.depthFirstMethod(A));
        assertEquals("[A, B, D, E]",graph.depthFirstMethod(A).toString());

    }
}
