public class FivePerLine {
    public static void fivePerLine() {
        for (int i = 1000; i <= 2000; i++) {
            System.out.print(i + " ");
            if (i%5 == 4 && i != 1000) {
                System.out.println(" ");
            }
        }
    }
}
