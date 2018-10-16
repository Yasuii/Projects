package PiNthDigit;
import java.math.BigDecimal;
import java.util.Scanner;

public class PiNthDigit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int nthPlace = reader.nextInt();
        BigDecimal newPi = new BigDecimal(Math.PI);

        if(nthPlace > 50) {
            System.out.println("Limit Reached! Try again.");
        }
        else {
            newPi = newPi.setScale(nthPlace, BigDecimal.ROUND_HALF_EVEN);
        }


        System.out.println(newPi);
    }
}
