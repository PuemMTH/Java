import java.util.ArrayList;

import binary.*;

public class Main {
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        for(int i = 0; i < list.size(); i++){
            bst.insert(list.get(i));
        }

        System.out.println(bst.root.left.left.data);
        System.out.println(bst.root.left.left.left.data);
        System.out.println(bst.root.left.left.right.data);
    }
}