public class AllPrimos {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (forPrimo(i))
                System.out.println(i + " é primo.");
        }
    }

    private static boolean forPrimo(int num) {
        for (int j = 2; j < num; j++) {
            if (num % j == 0)
                return false;
        }
        return true;
    }
}