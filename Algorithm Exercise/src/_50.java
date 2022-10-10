public class _50 {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (x == 0 || x == 1 || n == 1) {
            return x;
        } else if (n < 0) {
            return (1 / x) * myPow(1 / x, -(n + 1));
        } else if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        } else {
            return  x * myPow(x * x, n / 2);
        }
    }
}
