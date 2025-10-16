public class Euler2 {
    public static void main(String[] args) {
        int sum = 2;
        int fiboNum1 = 1, fiboNum2 = 2, fiboNum3=0; 

        while (fiboNum3 < 4000000){
            fiboNum3 = fiboNum1 + fiboNum2;
            if(fiboNum3 % 2==0){
                sum +=fiboNum3;
            }
            fiboNum1 = fiboNum2;
            fiboNum2 = fiboNum3;
        }

        System.out.println(sum);
    }
}
