package lab1;

public class Multiples {
    public static void main(String[] args) {
        multiples();
    }

    private static void multiples() {
        int count = 0;
        for (int i = 1; i < 1000; i++) {          // 小于 1000，即 1..999
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
