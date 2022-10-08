package customSet;

import java.util.Objects;

public class SetTest {
    static class Node {
        String name;
        String id;

        public Node(String name, String id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public int hashCode() {
            int prime = 31;
            return prime + Objects.hash(this.name, this.id);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Node other = (Node) obj;
            if (!Objects.equals(name, other.name))
                return false;
            return Objects.equals(id, other.id);
        }
    }
}