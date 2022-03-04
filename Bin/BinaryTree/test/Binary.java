package test;

public class Binary {
    public Binary() {
        BinaryTree BT = new BinaryTree();
        BT.Add(50);
        BT.Add(20);
        BT.Add(70);
        BT.Add(30);
        BT.Add(110);
        BT.Add(10);
        BT.Add(15);
        BT.Add(60);
        BT.Add(90);
        BT.Add(150);
        BT.Add(5);
        BT.Add(25);
        BT.Add(35);
        BT.Add(45);
        BT.Add(55);
        BT.Add(65);
        BT.Add(75);
        BT.Add(85);
        BT.Add(95);
        BT.Add(105);
        BT.Add(115);
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
            }
            else{
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


