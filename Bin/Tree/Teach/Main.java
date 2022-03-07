import TreeTraversal.*;
public class Main {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        new _mainUI(false);
    }
}

class _mainUI {
    public _mainUI(boolean isShow) {
        if(isShow == true){
            new mainTree();
        }else if(isShow == false){
            new mainTerminal();
        }
    }
}

// Ex. args = T:a,TL:b,TLR:e,TLL:d,TLLR:h,TR:c,TRL:f,TRR:g
// del *.class && cd TreeTraversal && del *.class && cd .. && javac Main.java && java Main