package graph;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class breadthFirstTest {

    @Test
    public void oneItemGraph(){
        Graph graph = new Graph();
        Vertex vertex = new Vertex(1);
        assertEquals("[1]",graph.breadthFirstMethod(vertex).toString());

    }

    @Test
    public void multipleItems(){
        Graph graph = new Graph();
        Vertex Pandora = new Vertex("Pandora");
        graph.addNode(Pandora);
        Vertex Arendelle = new Vertex("Arendelle");
        graph.addNode(Arendelle);
        Vertex Metroville = new Vertex("Metroville");
        graph.addNode(Metroville);
        Vertex Monstroplolis = new Vertex("Monstroplolis");
        graph.addNode(Monstroplolis);
        Vertex Narnia = new Vertex("Narnia");
        graph.addNode(Narnia);
        Vertex Naboo = new Vertex("Naboo");
        graph.addNode(Naboo);

        graph.addEdge(Pandora,Arendelle,0);
        graph.addEdge(Arendelle,Metroville,0);
        graph.addEdge(Arendelle,Monstroplolis,0);
        graph.addEdge(Metroville,Monstroplolis,0);
        graph.addEdge(Metroville,Narnia,0);
        graph.addEdge(Metroville,Naboo,0);
        graph.addEdge(Monstroplolis,Naboo,0);
        graph.addEdge(Narnia,Naboo,0);

        assertEquals("[Pandora, Arendelle, Metroville, Monstroplolis, Narnia, Naboo]",graph.breadthFirstMethod(Pandora).toString());

    }
}
