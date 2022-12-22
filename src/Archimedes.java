public class Archimedes {
    public static void main(String[] args) {

        double u = 3;

        for (int n = 6; n < 1e7; n *= 2) {
            System.out.println(n + "\t" + u);
            u = 2 * u / Math.sqrt(2 + 2 * Math.sqrt(1 - (u / n) * (u / n)));
        }
    }
}