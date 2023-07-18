package HW;

import java.util.Objects;

public class Cat{
    // private String name;
    // private int age;
    // private String breed;
    // private String color; 

    String name;
    int age;
    String breed;
    String color; 

    // public void setName(String nameCat){
    //     this.name = nameCat;
    // }
    // public void setAge(int ageCat){
    //     this.age = ageCat;
    // }

    // public Cat(String name, int age, String breed, String color){
    //     this.name = name;
    //     this.age = age;
    //     this.breed = breede;
    //     this.color = color;

    // }
    /**
     * Переопределяем ф-цию для нормального вывода котов
     */
    @Override
    public String toString() {
        return String.format("\n Кличка: %s \n Возраст: %s \n Порода: %s \n Цвет: %s \n", name, age, breed, color);
    }
    /**
     * Для отображения двух одинаковых котов закомментить следующие два метода!
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cats = (Cat) o;
        return name == cats.name && age == cats.age && breed == cats.breed && color == cats.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed, color);
    }

}
