package HW;
/*
 * 1. Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернет “перевернутый” список.
 */

import java.util.*;

public class HW4Task1 {
    // метод переворота списка:
    public static LinkedList revers(LinkedList list) {
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        // создаём список
        LinkedList<Integer> linkedList = new LinkedList<>();
        // заполняем список
        for (int i = 1; i < 10; i++) {
            linkedList.add(i);
        }

        System.out.println("Заданный список: " + linkedList);
        LinkedList<Integer> reversList = revers(linkedList);
        System.out.println("Перевёрутый список: "+reversList);
    }
}
