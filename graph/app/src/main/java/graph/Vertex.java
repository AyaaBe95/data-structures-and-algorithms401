package graph;

public class Vertex {

    public Object value;

    public Vertex(Object value){
        this.value=value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value=" + value +
                '}';
    }
}
