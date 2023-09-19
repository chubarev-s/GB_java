package Java_Interim_Cert;

import Java_Interim_Cert.controller.Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main extends Controller {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        List<String> winList = new ArrayList<>();
        String winListString = new String();
        int id;
        String name;
        int quantity;
        boolean exitSaler = true;
        boolean welcome = true;
        int countCustomer = 0;
        int countSaler = 0;
        while (welcome) {
            exitSaler = true;
            System.out.println("_______________________________________\n" +
                    "Добро пожаловать в магазин игрушек! \n" +
                    "_______________________________________\n" +
                    "Выберите режим входа: \n" +
                    "1. Покупатель (Сможете поучаствовать в розыгрыше)\n" +
                    "2. Продавец\n" + // Pass: 112233
                    "3. Покинуть магазин.");

            int n = iScanner.nextInt();
            if (n == 1) {
                countCustomer++;
                //Функционал покупателя - участника розыгрыша
                winListString = holdingLottery(countCustomer);
                winList.add(winListString);
                //savePrizeToy(winList);
                System.out.println("Ваш приз помещён в очередь, пройдите на зону выдачи!");
                n = 0;

            } else if (n == 2) {
                //Функционал продавца
            System.out.println("Введите пароль: ");
            int pass = iScanner.nextInt();
            if(pass != 112233){
                System.out.println("Неверный пароль!");
            } else {
                while (exitSaler) {
                    System.out.println("Выберете действие: \n" +
                            "1. Добавить игрушку в розыгрыш; \n" +
                            "2. Показать весь список игрушек; \n" +
                            "3. Удалить игрушку из списка розыгрыша; \n" +
                            "4. Изменить процент выпадения игрушки; \n" +
                            "5. Очистить историю выигрышей; \n" +
                            "6. Выдать выигранную игрушку; \n" +
                            "7. Выйти.");
                    int chose = iScanner.nextInt();
                    switch (chose) {
                        case 1:
                            System.out.println("Введите ID игрушки: ");
                            id = iScanner.nextInt();
                            System.out.println("Введите название игрушки: ");
                            name = iScanner.next();
                            System.out.println("Введите шанс выпадения игрушки, от 0 до 100 : ");
                            quantity = iScanner.nextInt();
                            createToys(id, name, quantity);
                            System.out.println("Игрушка добавлена в розыгрыш.");
                            break;
                        case 2:
                            getAllToys();
                            break;
                        case 3:
                            System.out.println("Введите id игрушки, которую необходимо удалить: ");
                            id = iScanner.nextInt();
                            removeToy(id);
                            System.out.println("Игрушка удалена из розыгрыша.");
                            break;
                        case 4:
                            System.out.println("Введите id игрушки, вероятность выпадания " +
                                    "которой необходимо изменить: ");
                            id = iScanner.nextInt();
                            System.out.println("Введите вероятность выпадения игрушки от 0 до 100 : ");
                            quantity = iScanner.nextInt();
                            changeQuantity(id, quantity);
                            System.out.println("Вероятность выпадения игрушки изменена.");
                            break;
                        case 5:
                            System.out.println("Вы действительно хотите очистить историю выигрышей? \n1. Да, \n2. Нет.");
                            int rez = iScanner.nextInt();
                            if (rez == 1) {
                                try {
                                    Files.delete(Paths.get("C:\\Users\\user\\Desktop\\geekbrains\\GB_java\\Java_Interim_Cert\\YouWin.txt"));
                                } catch (IOException x) {
                                    System.err.println("файл не найден");
                                }
                                System.out.println("Необходимо перезапустить программу!");
                            }
                            break;
                        case 6:
                            for (countSaler = countCustomer; countSaler > 0 ; countSaler --) {

                                savePrizeToy(winList, countSaler-1);

                            }
                            break;
                        case 7:
                            System.out.println("Выход в главное меню...");
                            exitSaler = false;
                            break;
                    }
                }
                n = 0;
            }
            } else if (n == 3) {
                welcome = false;
            } else {
                    System.out.println("Необходимо выбрать режим входа!\n");
                    n = 0;
            }

        }
    }
}
