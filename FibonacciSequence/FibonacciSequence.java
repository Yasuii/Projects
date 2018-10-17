package FibonacciSequence;
import java.util.Scanner;

public class FibonacciSequence {
    static private int fibonacci(int nthPlace) {
        if(nthPlace == 1) {
            return 1;
        }
        return nthPlace * fibonacci(nthPlace - 1);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Nth place for the Fibonacci Sequence?");
        int nthPlace = reader.nextInt();
        System.out.println(fibonacci(nthPlace));
    }
}
