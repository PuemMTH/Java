package src.TreeTraversal;

public class BinaryTree{
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
            return null;
        postorder(node.left);
        postorder(node.right);
        postorder += node.item + " ";
        return this.postorder;
    }
    public String inorder(Node node) {
        if (node == null){
            return null;
        }
        inorder(node.left);
        inorder += node.item + " ";
        inorder(node.right);
        return this.inorder;
    }
    public String preorder(Node node) {
        if (node == null)
            return null;
        preorder += node.item + " ";
        preorder(node.left);
        preorder(node.right);
        return this.preorder;
    }

    public void isOrder(BinaryTree tree,String args) {
        // Delete all space
        for (int i = 0; i < args.length(); i++) {
            if (args.charAt(i) == ' ') {
                args = args.substring(0, i) + args.substring(i + 1);
            }
        }
        // Delete all \\n
        for (int i = 0; i < args.length(); i++) {
            if (args.charAt(i) == '\n') {
                args = args.substring(0, i) + args.substring(i + 1);
            }
        }
        // Split "T:a","TR:b",....
        String[] str = args.split(",");
        // Split :
        String Key[];
        for (int i = 0; i < str.length; i++) {
            Key = str[i].split(":");
            tree.insert(Key[0],Key[1]);
        }
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