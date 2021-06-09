package graph;
import java.util.*;

public class Graph {

    private HashMap<Vertex, ArrayList> listOfEdges = new HashMap<Vertex, ArrayList>();
    private int size=0;

    public Graph() {

    }

    public Vertex addNode(Vertex vertex){
        listOfEdges.put(vertex,new ArrayList());
        this.size++;
        return vertex;
    }

    public void addEdge(Vertex start,Vertex end,int weight){
        ArrayList edges = this.listOfEdges.get(start);
        this.listOfEdges.put(start, edges);

        if (this.listOfEdges.containsKey(start) && this.listOfEdges.containsKey(end)) {
            edges.add(new Edge(end, weight));
        }else {
            edges.add(new Edge(start));

        }

    }


    public List getNodes() {
        List<Vertex> nodes = new ArrayList<>();

        nodes.forEach((vertex) -> nodes.add(vertex));

        return nodes;
    }


    public List getNeighbors(Vertex vertex) {
        if (listOfEdges.containsKey(vertex)) {
            return listOfEdges.get(vertex);
        }
        return new ArrayList();
    }

    public int size(){
        return this.size;
    }

    public void setVertices(HashMap<Vertex, ArrayList> vertices) {
        this.listOfEdges = vertices;
    }

    public HashMap<Vertex, ArrayList> getListOfEdges() {
        return listOfEdges;
    }



    public  ArrayList breadthFirstMethod (Vertex vertex){
        ArrayList nodes = new ArrayList<>();
        queue breadth = new queue();
        Set visited = new HashSet();

        breadth.enqueue(vertex);
        visited.add(vertex);
        while (!breadth.isEmpty()) {
            Vertex front = (Vertex) ((Node) breadth.dequeue()).getValue();
            nodes.add(front.getValue());
            for (Object child : this.getNeighbors(front)){
                Vertex currentVertex = ((Edge) child).getVertex();
                if (!visited.contains(currentVertex)) {
                    visited.add(currentVertex);
                    breadth.enqueue(currentVertex);
                }
            }
        }
        return nodes;

    }

    public  ArrayList depthFirstMethod (Vertex vertex){
        ArrayList nodes = new ArrayList<>();
        stack depth = new stack();
        Set visited = new HashSet();
        depth.push(vertex);
        visited.add(vertex);
        while (!depth.isEmpty()) {
            Vertex front = (Vertex) ((Node) depth.pop()).getValue();
            nodes.add(front.getValue());
            for (Object child : this.getNeighbors(front)){
                Vertex currentVertex = ((Edge) child).getVertex();
                if (!visited.contains(currentVertex)) {
                    visited.add(currentVertex);
                    depth.push(currentVertex);
                }
            }
        }
        return nodes;

    }


}