public class Primes {
    public static void main(String[] args) {
        int a, b, m=0;
        for (a=2; a<=100; a++) {
            m=0;
            for (b=2; b<a & b!=a; b++){
                if ((a % b) == 0){
                    m=+1;
                }
            }
            if (m==0) {
                System.out.println(a);
            }
        }
    }
}
