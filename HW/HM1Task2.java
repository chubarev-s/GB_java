//2) Вывести все простые числа от 1 до 1000
package HW;

public class HM1Task2 {
    public static boolean isPrime(int n) { // взято с https://en.wikipedia.org/wiki/Primality_test
        if (n <= 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }
}
