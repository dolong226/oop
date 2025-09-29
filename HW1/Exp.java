public class Exp {
    public static double computeExp(double x) {
        double exp = 1.0;
        double current = 1;
        double factorial = 1;
        for (int i = 1; i <= 20; i++) {
            current = current * x;
            factorial *= i;
            exp += current / factorial;
        }
        return exp;
    }
}
