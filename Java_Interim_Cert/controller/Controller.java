package Java_Interim_Cert.controller;

import Java_Interim_Cert.products.Toys;
import Java_Interim_Cert.service.DataService;
import Java_Interim_Cert.view.ToysView;

import java.io.*;
import java.util.*;

public class Controller {

    static DataService dataService = new DataService();
    final  int max = 100;
    final  int rnd = rnd(max);


    public static int rnd(int max){
        return (int)(Math.random() * ++max);
    }


    public static void createToys(Integer id, String name, Integer quantity){
        dataService.create(id, name, quantity);
    }

    public static void getAllToys(){
        List<Toys> toysList = dataService.getAllToys();
        for (Toys toys: toysList) {
            ToysView.printToysConsole(toys);
        }
    }

    public static void removeToy(Integer id){
        List<Toys> toysList = dataService.getAllToys();
        toysList.removeIf(toys -> Objects.equals(toys.getId(), id));
    }

    public static void changeQuantity(Integer id, Integer quantity){
        List<Toys> toysList = dataService.getAllToys();
        for (Toys toys: toysList) {
            if(Objects.equals(toys.getId(), id)){
                toys.setQuantity(quantity);
            }
        }
    }
    public static int[] randomQuantity(Toys toys){
        int[] randomNum = new int[100];
        int x = 0;
        for (int i = 0; i < toys.getQuantity(); i++) {
            x = rnd(99);
            if(randomNum[x] != 1) {
                randomNum[x] = 1;
            }
            else {
                x = rnd(99);
                if(randomNum[x] != 1) {
                    randomNum[x] = 1;
                }
                else {
                    x = rnd(98);
                    if (randomNum[x] != 1) {
                        randomNum[x] = 1;
                    } else {
                        randomNum[x + 1] = 1;
                    }
                }
            }

        }
        //System.out.println(Arrays.toString(randomNum));
        return  randomNum;
    }
    public static String holdingLottery(int count){
        List<Toys> toysList = dataService.getAllToys();
        return rafflePrizes(toysList, count);
    }
    public static String rafflePrizes(List<Toys> toysList, int count){
        int[] arr = new int[100];
        List<String> prizeToys = new ArrayList<>();
        System.out.println("Добрый день! Вы принимаете участие в розыгрыше игрушек! \n");
        int numTicket = rnd(99);
        System.out.printf("Ваш номер лотерейного билета: %s\n", numTicket);
        System.out.println("Посмотрите на весь список игрушек! Одна или несколько из них станут Вашими!!!\n");
        getAllToys();
        String prize = new String();
        for (Toys toys: toysList) {
            arr = randomQuantity(toys);
            if(arr[numTicket] == 1){
                System.out.println("Поздравляем! Вы выиграли игрушку: " + toys.getName());
                //prizeToys.add("Покупатель: " + count);
                prizeToys.add("Приз: " + toys.getName());
                prize = toys.getName();
            }
            else {
                System.out.println("К сожалению, Вы не выиграли игрушку:  " + toys.getName());
            }
        }
        //return prizeToys;
        return prize;
    }
    public static void savePrizeToy (List<String> prizeToys, int count){
        String string = new String();
        File saveFile = new File("C:\\Users\\user\\Desktop\\geekbrains\\GB_java\\Java_Interim_Cert\\YouWin.txt");
        try (FileWriter fileWriter = new FileWriter(saveFile, true)){
            string = prizeToys.get(count);
            fileWriter.write("Покупатель №" + count+1 + " получил свой приз: " + string + "\n");
        }
        catch(IOException ex){

        }
    }

    public static void giveGift(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\geekbrains\\GB_java\\Java_Interim_Cert\\YouWin.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
