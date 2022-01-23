import java.util.ArrayList;

public class _ArrayList2D {
    public static void main(String[] args) {
        ArrayList<String[]> list = new ArrayList<String[]>();
        list.add(new String[]{"AMBER", "1"});
        list.add(new String[]{"AYAKA", "2"});
        list.add(new String[]{"CHONGYUN", "3"});
        list.add(new String[]{"DILUC", "4"});
        list.add(new String[]{"DIONA", "5"});
        list.add(new String[]{"EULA", "6"});
        list.add(new String[]{"FISCHL", "7"});
        list.add(new String[]{"GABRIELA", "8"});
        list.add(new String[]{"HANNAH", "9"});
        list.add(new String[]{"ISABELLA", "10"});
        list.add(new String[]{"JESSICA", "11"});
        list.add(new String[]{"KARINA", "12"});
        list.add(new String[]{"LUCY", "13"});
        list.add(new String[]{"MADELINE", "14"});
        list.add(new String[]{"NANCY", "15"});
        list.add(new String[]{"OLIVIA", "16"});
        list.add(new String[]{"PATRICIA", "17"});
        list.add(new String[]{"QIAN", "18"});
        list.add(new String[]{"ROSA", "19"});
        list.add(new String[]{"SARAH", "20"});
        list.add(new String[]{"TINA", "21"});
        list.add(new String[]{"VICTORIA", "22"});
        list.add(new String[]{"WENDY", "23"});
        list.add(new String[]{"XIAO", "24"});
        list.add(new String[]{"YAN", "25"});
        list.add(new String[]{"ZHANG", "26"});
        list.add(new String[]{"ZHEN", "27"});
        list.add(new String[]{"ZHONG", "28"});
        list.add(new String[]{"ZHU", "29"});
        list.add(new String[]{"ZHUO", "30"});
        
        // System.out.println(list.get(0)[0] + " " + list.get(0)[1]);
        for (String[] strings : list) {
            System.out.println(Integer.parseInt(strings[1]) + " " + strings[0]);
        }
    }
}