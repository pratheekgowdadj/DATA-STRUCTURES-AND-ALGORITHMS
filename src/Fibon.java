import java.util.LinkedList;
import java.lang.Math;

public class Fibon {
    public static void main(String[] args) {
        int n = 54;
        System.out.println(fib(n));

    }

    static int fib(int n){
        double phi = (Math.sqrt(5) + 1) / 2;
        return (int) Math.round(Math.pow(phi,n) / Math.sqrt(5));
    }
}
