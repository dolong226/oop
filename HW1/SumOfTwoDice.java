public class SumOfTwoDice {
    public static void main(String[] args) {
        int NUM = 6;
        int a = 1 + (int) (Math.random() * NUM);
        int b = 1 + (int) (Math.random() * NUM);
        int sum = a + b;
        System.out.println(sum);
    }
}
