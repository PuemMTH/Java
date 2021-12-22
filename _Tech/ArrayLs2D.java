import java.util.ArrayList;

public class ArrayLs2D {
    public static void main(String[] args) {
        // crate 2D arrayList 
        ArrayList<Integer> list[] = new ArrayList[2];
        // add to ArrayList 2D number row 1 col 1
        list[0] = new ArrayList<Integer>();
        list[0].add(1);
        list[0].add(2);
        list[0].add(3);
        list[0].add(4);
        list[1].add(1);
        list[1].add(2);
        list[1].add(3);
        // print 2D arrayList
        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list[i].size(); j++) {
                System.out.print(list[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}
