package graph;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class addEdgeTest {
    @Test
    public void getEdgeTestOneTrip(){
        Vertex Pandora = new Vertex("Pandora");
        Vertex Arendelle = new Vertex("Arendelle");
        Vertex Metroville = new Vertex("Metroville");
        Vertex Monstroplolis = new Vertex("Monstroplolis");
        Vertex Narnia = new Vertex("Narnia");
        Vertex Naboo = new Vertex("Naboo");

        Graph graph = new Graph();
        graph.addNode(Pandora);
        graph.addNode(Arendelle);
        graph.addNode(Metroville);
        graph.addNode(Monstroplolis);
        graph.addNode(Narnia);
        graph.addNode(Naboo);

        graph.addEdge(Pandora,Arendelle,150);
        graph.addEdge(Pandora,Metroville,82);
        graph.addEdge(Arendelle,Metroville,99);
        ArrayList trip = new ArrayList();
        trip.add("Pandora");

        assertEquals(getEdge.checkTrip(graph,trip));
    }

    @Test
    public void getEdgeTestFullTripPossible(){
        Vertex Pandora = new Vertex("Pandora");
        Vertex Arendelle = new Vertex("Arendelle");
        Vertex Metroville = new Vertex("Metroville");
        Vertex Monstroplolis = new Vertex("Monstroplolis");
        Vertex Narnia = new Vertex("Narnia");
        Vertex Naboo = new Vertex("Naboo");

        Graph graph = new Graph();
        graph.addNode(Pandora);
        graph.addNode(Arendelle);
        graph.addNode(Metroville);
        graph.addNode(Monstroplolis);
        graph.addNode(Narnia);
        graph.addNode(Naboo);

        graph.addEdge(Pandora,Arendelle,150);
        graph.addEdge(Pandora,Metroville,82);
        graph.addEdge(Arendelle,Metroville,99);
        ArrayList trip = new ArrayList();
        trip.add("Pandora");
        trip.add("Metroville");
        trip.add("Arendelle");
        assertEquals("True, 181$",getEdge.checkTrip(graph,trip));
    }


    @Test
    public void getEdgeTestFullTripNotPossible(){
        Vertex Pandora = new Vertex("Pandora");
        Vertex Arendelle = new Vertex("Arendelle");
        Vertex Metroville = new Vertex("Metroville");
        Vertex Monstroplolis = new Vertex("Monstroplolis");
        Vertex Narnia = new Vertex("Narnia");
        Vertex Naboo = new Vertex("Naboo");

        Graph graph = new Graph();
        graph.addNode(Pandora);
        graph.addNode(Arendelle);
        graph.addNode(Metroville);
        graph.addNode(Monstroplolis);
        graph.addNode(Narnia);
        graph.addNode(Naboo);

        graph.addEdge(Pandora,Arendelle,150);
        graph.addEdge(Pandora,Metroville,82);
        graph.addEdge(Arendelle,Metroville,99);
        ArrayList trip = new ArrayList();
        trip.add("Pandora");
        trip.add("Metroville");
        trip.add("Naboo");
        assertEquals("False, 0$",getEdge.checkTrip(graph,trip));
    }
}
