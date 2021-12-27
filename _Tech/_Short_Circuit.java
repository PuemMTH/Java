public class _Short_Circuit {
    public static void main(String[] args) {
        int x = 7;
        System.out.println(((x<5)? x++ : x--) + " " + x);
    }
}