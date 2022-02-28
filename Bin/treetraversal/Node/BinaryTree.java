package Node;

import java.util.HashMap;
import java.util.Map;

public class BinaryTree {
    public Node root;
    String postorder;
    String inorder;
    String preorder;

    public BinaryTree() {
        root = null;
        postorder = "";
        inorder = "";
        preorder = "";
    }
    public String postorder(Node node) {
        if (node == null)
            return "";
        postorder(node.left);
        postorder(node.right);
        postorder += node.item + " ";
        return postorder;
    }
    public String inorder(Node node) {
        if (node == null)
            return "";
        inorder(node.left);
        inorder += node.item + " ";
        inorder(node.right);
        return inorder;
    }
    public String preorder(Node node) {
        if (node == null)
            return "";
        preorder += node.item + " ";
        preorder(node.left);
        preorder(node.right);
        return preorder;
    }
    public void NodeClear(Node node) {
        if (node == null)
            return;
        NodeClear(node.left);
        NodeClear(node.right);
        node = null;
    }
    public void insert(BinaryTree Tree, HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}