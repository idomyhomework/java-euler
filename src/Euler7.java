public class Euler7 {
    public static Boolean isPrime(int num) {
        if (num == 1)
            return false;
        if (num == 2)
            return true;
        if (num == 3)
            return true;
        long limit = (long) Math.sqrt(num);
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int result = 13;
        int count = 6;
        while (count != 10001){
            result++;
            if(isPrime(result)){
                count++;
            }
        }

        System.out.println(result);
    }
}
