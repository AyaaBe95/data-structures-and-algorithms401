package graph;
import org.junit.Test;
import static org.junit.Assert.*;
public class graphTest {


    @Test public void addNodesuccessfully (){
        Graph graph = new Graph();
        Vertex vertex = new Vertex(3);
        assertEquals(3,graph.addNode(vertex).getValue());
        assertEquals("{Vertex{value=3}=[]}",graph.getListOfEdges().toString());
    }

    @Test public void addEdgesuccessfully(){
        Graph graph = new Graph();
        Vertex startVertex = new Vertex(3);
        Vertex endVertex = new Vertex(4);
        graph.addNode(startVertex);
        graph.addNode(endVertex);
        graph.addEdge(startVertex,endVertex,1);
        assertEquals("[Edge{vertex=Vertex{value=4}, weight=1}]",graph.getListOfEdges().get(startVertex).toString());
    }

    @Test public void getAllNodes(){
        Graph graph = new Graph();
        Vertex startVertex = new Vertex(3);
        Vertex endVertex = new Vertex(4);
        graph.addNode(startVertex);
        graph.addNode(endVertex);
        assertEquals("[Vertex{value=3}, Vertex{value=4}]",graph.getNodes().toString());

    }

    @Test public void  getAllneighbors(){
        Graph graph = new Graph();
        Vertex startVertex = new Vertex(3);
        Vertex endVertex = new Vertex(4);
        graph.addNode(startVertex);
        graph.addNode(endVertex);
        graph.addEdge(startVertex,endVertex,1);
        assertEquals("[Edge{vertex=Vertex{value=4}, weight=1}]",graph.getNeighbors(startVertex).toString());

    }

    @Test public void neighborsWeight(){
        Graph graph = new Graph();
        Vertex startVertex = new Vertex(3);
        Vertex endVertex = new Vertex(4);
        graph.addNode(startVertex);
        graph.addNode(endVertex);
        graph.addEdge(startVertex,endVertex,1);
        assertEquals(1,((Edge)graph.getNeighbors(startVertex).get(0)).getWeight());
    }

    @Test public void getSize(){
        Graph graph = new Graph();
        Vertex startVertex = new Vertex(3);
        Vertex endVertex = new Vertex(4);
        graph.addNode(startVertex);
        graph.addNode(endVertex);
        assertEquals(2,graph.size());

    }

    @Test public void oneNode(){
        Graph graph = new Graph();
        Vertex startVertex = new Vertex(3);
        graph.addNode(startVertex);
        assertEquals("One Node can be returned","[Vertex{value=3}]",graph.getNodes().toString());
    }

    @Test public void nullNode(){
        Graph graph = new Graph();
        assertNull(graph.getNodes());
    }

}
