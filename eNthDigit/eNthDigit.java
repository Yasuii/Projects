import java.math.BigDecimal;
import java.util.Scanner;

class eNthDigit {
	private static double eNthDigit(int nthPlace) {
		if(nthPlace > 50) {
			System.out.println("Your upper limit is too high, try again!");
			return -1;
		}
		BigDecimal estimated_e = new BigDecimal(Math.E);
		estimated_e = estimated_e.setScale(nthPlace, BigDecimal.ROUND_HALF_EVEN);
		return estimated_e.doubleValue();
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int nthPlace = reader.nextInt();
		
		System.out.println(eNthDigit(nthPlace));
	}
}