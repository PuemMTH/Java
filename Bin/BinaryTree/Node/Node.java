package Node;

public class Node {
    public String item;
    public Node left, right;
    public Node(String key) {
        item = key;
        left = right = null;
    }
}