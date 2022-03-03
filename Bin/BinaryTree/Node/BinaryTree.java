package Node;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;

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

    public void insert(String Key, String Value) {
        Node root = this.root;
        for(int i = 0; i < Key.length(); i++) {
            if(this.root == null && Key.length() == 1 && Key.equals("T")){
                this.root = new Node(Value);
                break;
            }
            if(Key.charAt(i) == 'L'){
                if(root.left == null){
                    root.left = new Node(Value);
                }else{
                    root = root.left;
                }
            }
            if(Key.charAt(i) == 'R'){
                if(root.right == null){
                    root.right = new Node(Value);
                }else{
                    root = root.right;
                }
            }
        }

    }
}