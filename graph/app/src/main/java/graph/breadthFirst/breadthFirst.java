package graph.breadthFirst;

import graph.Graph;
import graph.Vertex;
import Queue.queue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class breadthFirst extends Graph {

public static ArrayList breadthFirstMethod (Graph graph){
    ArrayList<Vertex> nodes = new ArrayList<>();
    queue breadth = new queue();
    Set visited = new HashSet();
    Vertex vertex = (Vertex) graph.getListOfEdges().keySet().toArray()[0];

    breadth.enqueue(vertex);
    visited.add(vertex);
    while (!breadth.isEmpty()) {
        Vertex front = (Vertex) breadth.dequeue();
        nodes.add(front);

        for (Object child : graph.getNeighbors(front)){
            if (!visited.contains(child)) {
                visited.add(child);
                breadth.enqueue(child);
            }
        }
    }
    return nodes;

}
}
