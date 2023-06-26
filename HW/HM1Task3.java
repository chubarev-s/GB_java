//3) Реализовать простой калькулятор
package HW;

import java.util.Scanner;

public class HM1Task3 {
    public static void main(String[] args) {
        double res = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        double num1 = iScanner.nextDouble();
        System.out.printf("Введите операцию ' * ', ' + ', ' - ', ' / ' : \n");
        String oper = iScanner.next();
        System.out.printf("Введите второе число: ");
        double num2 = iScanner.nextDouble();
        switch (oper) {
            case "*":
                res = num1 * num2;
                break;
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "/":
                res = num1 / num2;
                break;
        }
        System.out.println("\n Ответ: ");
        System.out.println(res);
        iScanner.close();
    }
}
