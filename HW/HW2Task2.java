//2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package HW;
import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HW2Task2 {
        
        public static void main(String[] args) {
        int [] mas = {11, 3, 14, 16, 7, 32, 1, 2, 6}; 
        boolean isSorted = false;
        int buf;
        File logFile = new File("log.txt");
        try (FileWriter fileWriter = new FileWriter(logFile, true)){ 
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                    fileWriter.write(Arrays.toString(mas) + "\n");
                }
                
            }
        }
        System.out.println(Arrays.toString(mas));   
        } 
        catch(IOException ex){

        }
    
    }
      
        
}
