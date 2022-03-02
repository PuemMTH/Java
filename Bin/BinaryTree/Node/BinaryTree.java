package Node;
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

    public void insert(BinaryTree Tree, HashMap<String, String> map) {
        HashMap<String, String> maps = map;
        Node node = Tree.root;

        String str_key = map.get(map.keySet().toArray()[0]);
        Node cur = Tree.root;
        Node newNode = new Node(maps.get(str_key));
        // for(int i = 0; i < str_key.length(); i++) {
        //     if(str_key.equals("L")) {
        //         if(cur.left == null) {
        //             cur.left = newNode;
        //         }else {
        //             cur = cur.left;
        //         }
        //     }
        // }

        // for i in str_key:
        //     if i == 'L':
        //         if cur.left == None:
        //             cur.left = newNode
        //             newNode.parent = cur
        //         else:
        //             cur = cur.left
        //     if i == 'R':
        //         if cur.right == None:
        //             cur.right = newNode
        //             newNode.parent = cur
        //         else:
        //             cur = cur.right


        // if (maps.get("T") != null) {
        //     node = new Node(maps.get("T"));
        //     Tree.root = node;
        //     maps.remove("T");
        // }
        // for(int i = 0; i < maps.size(); i++) {
        //     // if(maps.get("TL") != null) {
        //     //     node.left = new Node(maps.get("TL"));
        //     //     maps.remove("TL");
        //     // }
        //     // if(maps.get("TR") != null) {
        //     //     node.right = new Node(maps.get("TR"));
        //     //     maps.remove("TR");
        //     // }
        //     // if(maps.get("TRR") != null) {
        //     //     node.right.right = new Node(maps.get("TRR"));
        //     //     maps.remove("TRR");
        //     // }
        //     // if(maps.get("TRL") != null) {
        //     //     node.right.left = new Node(maps.get("TRL"));
        //     //     maps.remove("TRL");
        //     // }
        //     // if(maps.get("TLR") != null) {
        //     //     node.left.right = new Node(maps.get("TLR"));
        //     //     maps.remove("TLR");
        //     // }
        //     // if(maps.get("TLL") != null) {
        //     //     node.left.left = new Node(maps.get("TLL"));
        //     //     maps.remove("TLL");
        //     // }
        //     // if(maps.get("TLLR") != null) {
        //     //     node.left.left.right = new Node(maps.get("TLLR"));
        //     //     maps.remove("TLLR");
        //     // }
        //     // ...
        // }
        // System.out.println();
        // maps.forEach(
        //     (k, v) -> {
        //         System.out.print(k + "," + v + " ");
        //     }
        // );
        // System.out.println();
    }
    public void RecursiveInsert(BinaryTree Tree, HashMap<String, String> map) {

    }
}