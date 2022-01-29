package Lib;

public class Number {
    private int n;
    public Number(int n) {
        this.n = n;
    }
    public Number() {
        new Number(1);
    }
    public boolean isZero(){
        return this.n == 0;
    }
    public boolean isPositive() {
        return this.n > 0;
    }
    public boolean isNegative() {
        return this.n < 0;
    }
    public boolean isEven() {
        return this.n % 2 == 0;
    }
    public boolean isOdd() {
        return this.n % 2 == 1;
    }
    public boolean isPrime() {
        if (this.n == 1) {
            return false;
        }
        for (int i = 2; i < this.n; i++) {
            if (this.n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public double Factorial() {
        double ans = 1;
        for (int i = 1; i <= this.n; i++) {
            ans *= i;
        }
        return ans;
    }
    public double powTwo() {
        return Math.pow(this.n, 2);
    }
    public double sqrt() {
        return Math.sqrt(this.n);
    }
    public double sumOfDigits() {
        double ans = 0;
        int n_catch = this.n;
        n_catch = Math.abs(n_catch);
        while (n_catch > 0) {
            ans += n_catch % 10;
            n_catch /= 10;
        }
        return ans;
    }
    public String Reverse() {
        String ans = "";
        int n_catch = this.n;

        while (n_catch > 0) {
            // 987 % 10 = 7
            ans += n_catch % 10;
            n_catch /= 10;
        }
        return ans;
    }
    public String divisibleBy(){
        String ans = "";
        int n_catch = this.n;
        for (int i = 1; i <= n_catch; i++) {
            if (n_catch % i == 0) {
                ans += i + " ";
            }
        }
        return ans;
    }
    public String toBinary() {
        String ans = "";
        int n_catch = this.n;
        while (n_catch > 0) {
            ans = (n_catch % 2) + ans;
            n_catch /= 2;
        }
        return ans;
    }
    public int getN() {
        return this.n;
    }
    public void setN(int n) {
        this.n = n;
    }
}
