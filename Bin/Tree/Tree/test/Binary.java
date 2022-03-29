package test;

public class Binary {
    public Binary() {
        BinaryTree BT = new BinaryTree();
        BT.Add(726);
        BT.Add(885);
        BT.Add(768);
        BT.Add(439);
        BT.Add(266);
        BT.Add(865);
        BT.Add(28);
        BT.Add(59);
        BT.Add(206);
        BT.Add(645);
        BT.Add(888);
        BT.Add(879);
        BT.Add(546);
        BT.Add(225);
        BT.Add(348);
        BT.Add(899);
        BT.Add(286);
        BT.Add(605);
        BT.Add(408);
        BT.Add(119);
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
    public int data;
    public Node leftNode;
    public Node rightNode;
}
class BinaryTree{
    public Node root;
    public void Add(int Value){
        Node Parent = null;
        Node tmp = this.root;
        while(tmp != null){
            Parent = tmp;
            if(Value < tmp.data){
                tmp = tmp.leftNode;
            }else if(Value > tmp.data){
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
            if(NewNode.data > Parent.data){
                Parent.rightNode = NewNode;
            }else{
                Parent.leftNode = NewNode;
            }
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
}