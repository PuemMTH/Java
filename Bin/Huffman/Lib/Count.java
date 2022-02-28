package Lib;

import java.util.HashMap;

public class Count {
    private String args = "";
    private HashMap<String, Integer> map = new HashMap<>();

    public Count(String args) {
        this.args = args;
        for(int i=0; i < args.length(); i++){
            if(map.containsKey(args.charAt(i)+"")){
                map.put(args.charAt(i)+"", map.get(args.charAt(i)+"")+1);
            }else{
                map.put(args.charAt(i)+"", 1);
            }
        }
    }

    public HashMap<String, Integer> getNum(){
        return map;
    }

    public String toString(){
        return args;
    }
}
