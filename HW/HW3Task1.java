package HW;
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение


//import java.util.Scanner;
import java.util.*; //ArrayList;



public class HW3Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите длину массива: ");   
        int size = iScanner.nextInt(); 
        int[] Arr = new int[size];
        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < size; i++) {
           // Arr.add(iScanner.nextInt()); 
           Arr[i] = iScanner.nextInt();
        }
        iScanner.close();
        ArrayList<Integer> Arr_out = new ArrayList<>(); 
        for (int i = 0; i < size; i++) {
           Arr_out.add(Arr[i]); 
           
        }
        System.out.print ("Введённый массив: ");
        System.out.println(Arr_out);
        //1) Нужно удалить из него чётные числа
            int n = 0;
            int count = 0;
            for (int j = 0; j < size; j++ ){
                //n = Arr.get(j);
                // System.out.println(n);
                if(Arr[j] % 2 != 0){
                    count++;
                }
            }
            System.out.println("нечётных эле-тов: " + count);
            int[] Arr2 = new int[count];
            for (int j = 0; j < size; j++ ){
                //n = Arr.get(j);
                if(Arr[j] % 2 != 0){
                    Arr2[n] = Arr[j];
                    n++;
                }    
            }
        
        //!!! Не заходит в цикл фор, который ниже, не могу понять почему !!!
        // int k = size - 1;
        // int n = 0;
        // for(int j = k; j == 0 ; j--) {
        //     n = Arr.get(j); 
        //     System.out.println("->" + n + "<-");
        //     System.out.println(n);
        //     if (n % 2 == 0){
        //         Arr.remove(j);
        //         System.out.println("->" + Arr);
        //         System.out.println("->" + n);
        //     }
        // }
        ArrayList<Integer> Arr_out2 = new ArrayList<>();
        for (int i = 0; i < count; i++) {
           Arr_out2.add(Arr2[i]);    
        }
        System.out.println("Массив без чётных эл-ов: " + Arr_out2);
        // 2) Найти минимальное значение
        int min = Arr[0];
        int p = 0;
        while (p < size){
            if (Arr[p] < min){
                min = Arr[p];
            }
            p++;    
        }
        System.out.println("Минимальный элемент: " + min);
        // 3) Найти максимальное значение
        int max = Arr[0];
        int k = 0;
        while (k < size){
            if (Arr[k] > max){
                max = Arr[k];
            }
            k++;    
        }
        System.out.println("Максимальный элемент: " + max);
        //4) Найти среднее значение
        int averageValue = 0;
        int f = 0; 
        while (f < size){
            averageValue= averageValue + Arr[f];
            f++;    
        }
        averageValue= averageValue / f;
        System.out.println("Среднее значение: " + averageValue);
    }   
}
