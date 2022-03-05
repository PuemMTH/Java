package test;

public class BinarySearch {
    public BinarySearch() {
        BinaryTree BT = new BinaryTree();
        BT.Add("a");
        BT.Add("b");
        BT.Add("c");
        BT.Add("d");
        BT.Add("e");
        BT.Add("f");
        BT.Add("g");
        BT.Add("h");
        BT.Add("i");
        BT.Add("j");
        BT.Add("5");
        BT.Add("25");
        BT.Add("35");
        BT.Add("45");
        BT.Add("55");
        BT.Add("65");
        BT.Add("75");
        BT.Add("85");
        BT.Add("95");
        BT.Add("105");
        BT.Add("115");
        BT.PrintTree(BT.root," ", true);
    }
    public void test(int i){
        System.out.println("Start "+i);
        if(i == 20){
            return;
        }
        test(i+1);
        System.out.println("End "+i);
    }
}

class Node{
    public String data;
    public Node leftNode;
    public Node rightNode;
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public Node getLeftNode(){
        return leftNode;
    }
    public void setLeftNode(Node leftNode){
        this.leftNode = leftNode;
    }
    public Node getRightNode(){
        return rightNode;
    }
    public void setRightNode(Node rightNode){
        this.rightNode = rightNode;
    }
}

class BinaryTree{
    public Node root;
    public void Add(String Value){
        Node Parent = null;
        Node tmp = this.root;
        while(tmp != null){
            Parent = tmp;
            if(Value.compareTo(tmp.data) < 0){
                tmp = tmp.leftNode;
            }else if(Value.compareTo(tmp.data) > 0){
                tmp = tmp.rightNode;
            }else{
                return;
            }
        }
        Node NewNode = new Node();
        NewNode.data = Value;
        if(this.root == null){
            this.root = NewNode;
        }else{
            // if(NewNode.data > Parent.data){
            //     Parent.rightNode = NewNode;
            // }
            // else{
            //     Parent.leftNode = NewNode;
            // }
            // if(Value.compareTo(Parent.data) < 0){
            //     Parent.leftNode = NewNode;
            // }else{
            //     Parent.rightNode = NewNode;
            // }
            
        }
        return;
    }
    public void PrintTree(Node parent, String indent, boolean last){
        System.out.println(indent + "+- " + parent.data);
        indent += last ? "   " : "|  ";
        if(parent.leftNode != null && parent.rightNode != null){
            PrintTree(parent.leftNode, indent, false);
            PrintTree(parent.rightNode, indent, true);
        }
        else if(parent.leftNode != null){
            PrintTree(parent.leftNode, indent, true);
        }
        else if(parent.rightNode != null){
            PrintTree(parent.rightNode, indent, true);
        }
    }
    public Node getRoot(){
        return root;
    }
    public void setRoot(Node root){
        this.root = root;
    }
}