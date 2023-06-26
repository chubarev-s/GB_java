//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package HW;

import java.util.Scanner;

/**
 * HM1Task1
 */
public class HM1Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        int s = 0;
        int pr = 1;
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        for (int i = 1; i <= n; i++) {
            pr = pr * i;
        }
        System.out.println(s);
        System.out.println(pr);

        iScanner.close();
    }
}
