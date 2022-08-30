import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        int n = 74, flag = 0;
        if(n == 0 || n == 1) flag = 1;
        for (int i = 2; i <= n/2; ++i) {
                if(n % i == 0){
                    flag = 1;
                    break;
                }
        }
        if(flag == 0) System.out.println("The given number is prime");
        else System.out.println("the given number is not prime");
    }
}
