public class Euler3 {
    public static Boolean isPrime(int num){
        if (num==1) return false;
        if(num==2) return true;
        if(num==3) return true;
        long limit = (long) Math.sqrt(num);
        for(int i=2; i<=limit; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int largestPrime = 0;
        long inputNum = 600851475143L;

        for(int i = 2; i<inputNum/2;i++){
            if(isPrime(i)){
                if (i > largestPrime && inputNum % i == 0) {    
                    largestPrime = i;
                    i+=largestPrime;
                    System.err.println(largestPrime);
                }
            }
        }

        System.out.println(largestPrime);
        System.out.println("Execution finished");
    }
}
