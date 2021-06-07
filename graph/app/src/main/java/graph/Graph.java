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
        try{
            if(this.listOfEdges.get(start)!=null && this.listOfEdges.get(end)!=null){ //check for edge
                ArrayList edges = this.listOfEdges.get(start);
                edges.add(new Edge(end,weight));  // add edge
//                this.listOfEdges.put(start,edges);
            } throw new Exception();
        } catch (Exception ex){
            System.out.println(ex);
        }

    }

    public List getNodes(){

        ArrayList keys = new ArrayList();
        listOfEdges.entrySet()
                .forEach((entry) -> keys.add(entry.getKey()));
        if (keys.size()==0){
            return null;
        }
        return keys;

    }

    public List getNeighbors(Vertex vertex){
        if(listOfEdges.get(vertex)!=null){
            return listOfEdges.get(vertex); // return all edges
        }
        return new ArrayList();
    }

    public int size(){
        return this.size;
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