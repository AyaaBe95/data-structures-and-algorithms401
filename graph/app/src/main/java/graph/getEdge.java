package graph;

import java.util.ArrayList;
import java.util.Map;

public class getEdge {
    private static ArrayList visited = new ArrayList();
    public static String checkTrip(Graph plan, ArrayList trip) {
        visited = new ArrayList();
        if (trip.size() < 2) return "UnValid trip";
        int cost = 0;
        for (int i = 0; i < trip.size() - 1; i++) {
            ArrayList checkIfNeighbor = checkIfNeighbor(plan, (String) trip.get(i),(String) trip.get(i + 1));
            if ((int) checkIfNeighbor.get(0) != 1) return "False, 0$";
            cost = cost + (int) checkIfNeighbor.get(1);
        }
        return "True," + " " + cost + "$";
    }
    public static ArrayList checkIfNeighbor(Graph plan, String start, String end) {
        ArrayList outputArray = new ArrayList();
        outputArray.add(0);
        outputArray.add(0);
        for (Map.Entry item : plan.getListOfEdges().entrySet()) {
            if (((Vertex)item.getKey()).getValue().equals(start)) {
                ArrayList current = (ArrayList) item.getValue();
                checkValue(current, outputArray, end);
            } else if (((Vertex)item.getKey()).getValue().equals(end)) {
                ArrayList current = (ArrayList) plan.getNeighbors((Vertex) item.getKey());
                checkValue(current, outputArray, start);
            }
        }
        return outputArray;
    }
    private static void checkValue(ArrayList current, ArrayList outputArray, String value) {
        for (int i = 0; i < current.size(); i++) {
            if ((int) outputArray.get(0) == 0) {
                if (((Edge) current.get(i)).getVertex().getValue().equals(value)) {
                    outputArray.set(0, 1);
                    outputArray.set(1, (int) outputArray.get(1) + (int) ((Edge) current.get(i)).getWeight());
                }
            }
        }
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
