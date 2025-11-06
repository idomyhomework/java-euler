import java.math.BigDecimal;

public class Euler5 {

    public static BigDecimal sumOfSquares(double min, double max) {
        double sum = 0;

        for (double i = min; i <= max; i++) {
            sum += Math.pow(i, 2);
        }

        BigDecimal result = BigDecimal.valueOf(sum);

        return result;
    }

    public static BigDecimal squareOfSum(double min, double max) {
        double sum = 0;

        for (double i = min; i <= max; i++) {
            sum += i;
        }

        double square = Math.pow(sum, 2);

        BigDecimal result = BigDecimal.valueOf(square);

        return result;
    }

    public static void main(String[] args) {

        System.out.println(squareOfSum(0, 100).subtract(sumOfSquares(0, 100)));

    }
}
