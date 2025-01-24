public class PowSolution {

    public static double pow(double x, int n){
        if(n == 1){
            return x;
        }
        long N = n;
        if (N < 0) {
            N = -N;
            x = 1 / x;
        }
        System.out.println(n);

        System.out.println(x);
        if(n % 2 == 0){
            return pow(x*x,(int)(N/2));

        }else{
            return x * pow(x,(int)(N-1));
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(2,-2147483648));
    }
}