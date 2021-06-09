package graph;

public class Vertex {

        private Object value;

        public Vertex(Object value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Vertex{" +
                    "value=" + value +
                    '}';
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }

