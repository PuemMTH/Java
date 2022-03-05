package binary;

public class Node {
    public String data;
    public Node left;
    public Node right;
    public Node parent;

    public Node(String data) {
        parent = null;
        this.data = data;
    }


}
