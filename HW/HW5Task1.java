package HW;

import java.util.List;

/**
 * Написать простой класс Телефонный Справочник (с помощью HashMap), который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.

***Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
взаимодействие с пользователем через консоль и т.д). 
Консоль использовать только для вывода результатов проверки телефонного справочника.
 */
public class HW5Task1 {
    public static void main(String[] args) {
       
        String[] phones = listPhones();
        Phonebook book = new Phonebook();
        book.add("Васильев", "666111");
        for (String person : phones) {
            String[] Parts = person.split(" ");
            book.add(Parts[0], Parts[1]);
        }
        
        String findName = "Васильев";
        System.out.printf("Результат проверки телефонного спавочника по фамилии \"%s\": ", findName);
        List<String> listPhones = book.get(findName);
        if (listPhones == null) {
            System.out.printf("Абонент не найден.", findName);
        } else {
            System.out.println(listPhones);
        }
    }
    private static String[] listPhones() {
        String[] result = {
                "Иванов 123456",
                "Васильев 321456",
                "Петрова 234561",
                "Иванов 234432",
                "Иванов 651454",
                "Петрова 654321",
        };
        return result;
    }
}
