
public class _Strings {
    public static void main(String[] args) {
        // <type> <name> = new <type>();
        // String b = new String(); --> Object ; have pointer
        // String b ; --> Array of char in memory

        String msg = "Hello world";
        // Medhod 
        System.out.println(" ");
        int len = msg.length();
        System.out.println("length of text is /" + len + "/");
        System.out.println("Substring is /" + msg.substring(0,5) + "/");
        System.out.println("LowerCase is /" + msg.toLowerCase() + "/");
        System.out.println("UpperCase is /" + msg.toUpperCase() + "/");


        // String to int 
        System.out.println(" ");
        String num0 = "123456";
        int parseInt = Integer.parseInt(num0);
        System.out.println("num is /" + parseInt + "/");


        // Int to String
        System.out.println(" ");
        int num2 = 123456;
        String toString = Integer.toString(num2);
        System.out.println("num2 is /" + toString + "/");

        Integer num3 = 123456;
        String toString2 = num3.toString();
        System.out.println("num3 is /" + toString2 + "/");

        // String Compare
        System.out.println(" ");
        String a = "Thailand", b = "Japan";
        a.compareTo(b); // เปรียบเทียบโดยใช้ ASCII ค่าที่ได้จะเป็นระยะห่วงระหว่าง เลข ASCII
        System.out.println("ASCII code of a is /" + a.compareTo(b) + "/");

        // String equals
        System.out.println(" ");
        String a1 = "Thailand", b1 = "Thailand";
        System.out.println("a1 is /" + a1.equals(b1) + "/"); // มองที่ค่าข้างใน
        System.out.println("a1 is /" + a1 == b1 + "/"); // มองที่ pointer 

        // String concatenation
        System.out.println(" ");
        String msg2 = "Hello";
        String msg3 = "World";
        String msg4 = msg2 + " " + msg3;
        System.out.println("Concatenation is /" + msg4 + "/");

    }
}