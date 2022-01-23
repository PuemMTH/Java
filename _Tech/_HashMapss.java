import java.util.HashMap;

public class _HashMapss {
    public static void main(String[] args) {
        // HashMap
        HashMap<String, Integer> list = new HashMap<String, Integer>();
        list.put("AMBER", 1);
        list.put("AYAKA", 2);
        list.put("CHONGYUN", 3);
        list.put("DILUC", 4);
        list.put("DIONA", 5);
        list.put("EULA", 6);
        list.put("FISCHL", 7);
        list.put("GABRIELA", 8);
        list.put("HANNAH", 9);
        list.put("ISABELLA", 10);
        list.put("JESSICA", 11);
        list.put("KARINA", 12);
        list.put("LUCY", 13);
        list.put("MADELINE", 14);
        list.put("NANCY", 15);
        list.put("OLIVIA", 16);
        list.put("PATRICIA", 17);
        list.put("QIAN", 18);
        list.put("ROSA", 19);
        list.put("SARAH", 20);
        list.put("TINA", 21);
        list.put("VICTORIA", 22);
        list.put("WENDY", 23);
        list.put("XIAO", 24);
        list.put("YAN", 25);
        list.put("ZHANG", 26);
        list.put("ZHEN", 27);
        list.put("ZHONG", 28);
        list.put("ZHU", 29);
        list.put("ZHUO", 30);
        System.out.println(list.get("AMBER") + " " + list.get("AYAKA"));
        for (String key : list.keySet()) {
            System.out.println(list.get(key) + " " + key);
        }
    }
}
