package binary;
import java.util.ArrayList;

public class BinaryTree {

    public Node root = null;
    public ArrayList<Node> nodes = new ArrayList<Node>();
    // public Node nodes[];
    // new Node[10];

    public BinaryTree(){
        // root = null;
    }

    public void insert(String keys){
        Node a = new Node(keys);
        nodes.add(a);
        if(root == null){
            root = nodes.get(0);
        }else{
            __intsert();
        }
    }
    public void __intsert(){
        int size = nodes.size();
        for(int i = 0; i < size; i++){
            // Node node,left,right;
            // node = nodes.get(i);

            if(2*i+1 < size){
                nodes.get(i).left = nodes.get(2*i+1);
                nodes.get(2*i+1).parent = nodes.get(i);
            }
            if(2*i+2 < size){
                nodes.get(i).right = nodes.get(2*i+2);
                nodes.get(2*i+2).parent = nodes.get(i);
            }
        }
    }
}
