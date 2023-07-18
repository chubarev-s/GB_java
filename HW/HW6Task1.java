package HW;

import java.util.*;

/**
 * Задание

Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.

Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. 
Убедитесь, что все они сохранились во множество.

Создайте метод
public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, 
только если значения во всех полях сравниваемых объектов равны.

Создайте метод
public int hashCode()
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))

Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
 */
public class HW6Task1 {
    public static void main(String[] args) {
        cats();
        
    }
    static void cats(){
        
        Cat catBarsik = new Cat();
        catBarsik.name = "Barsik";
        catBarsik.age = 4;
        catBarsik.breed = "Bengal";
        catBarsik.color = "snowshoe";
        //System.out.println(catBarsik);

        Cat catMyrzik = new Cat();
        catMyrzik.name = "Myrzik";
        catMyrzik.age = 1;
        catMyrzik.breed = "Siamese";
        catMyrzik.color = "fawn";
        //System.out.println(catMyrzik);

        Cat catYosik = new Cat();
        catYosik.name = "Yosik";
        catYosik.age = 9;
        catYosik.breed = "Siamese";
        catYosik.color = "blue patched tabby";
        //System.out.println(catYosik);

        Cat catPyshinka = new Cat();
        catPyshinka.name = "Pyshinka";
        catPyshinka.age = 6;
        catPyshinka.breed = "Sphynx";
        catPyshinka.color = "black";
        //System.out.println(catPyshinka);
        
        Cat catGinger = new Cat();
        catGinger.name = "Ginger";
        catGinger.age = 6;
        catGinger.breed = "Bengal";
        catGinger.color = "ginger";
        //System.out.println(catGinger);

        Cat dubleCatBarsik = new Cat();
        dubleCatBarsik.name = "Barsik";
        dubleCatBarsik.age = 4;
        dubleCatBarsik.breed = "Bengal";
        dubleCatBarsik.color = "snowshoe";
        //System.out.println(dubleCatBarsik);

        HashSet<Cat> hashCats = new HashSet<>();
        hashCats.add(catBarsik);
        hashCats.add(catGinger);
        hashCats.add(catMyrzik);
        hashCats.add(catPyshinka);
        hashCats.add(catYosik);
        hashCats.add(dubleCatBarsik);
        
        System.out.println(hashCats);
    }
}
