package Node;
public class Node {
    public String item;
    public Node left, right;
    public Node(String item) {
        this.item = item;
        left = right = null;
    }
}