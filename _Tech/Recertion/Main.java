class Main{
    public static void main(String[] args){
        // p(10);
        System.out.println(fac(20 ));
    }


    public static void p(int i){
        if(i==0){
            return;
        }
        System.out.println(i + " ");
        p(i-1);
        System.out.println(i + " ");
    }

    public static int fac(int i){
        if(i==1){
            return 1;
        }
        System.out.println(i + " ");
        int x = i * fac(i-1);
        return x;
    }
}
