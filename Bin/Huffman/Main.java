import java.util.HashMap;

import Lib.*;
public class Main {
    public static void main(String[] args) {
        Count A = new Count("Tanapat Eiam-arjParisorn PaengjamsriChalinee SaeleeNapat ChareonsilpWilawan Sangsuriwong");
        System.out.println(A.getNum());

        // System.out.println(A.toString());
        // for (HashMap.Entry<Character, Integer> key: A.getNum().entrySet()) {
        //     System.out.print(key.getKey() + ": " + key.getValue() + " ");
        // }
    }
}
