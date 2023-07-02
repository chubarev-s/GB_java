package HW;

import java.io.*;

// 1) Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
//Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class HW2Task1 {
    public static String [] ReadLineFromFile(String way) throws Exception {
        BufferedReader buff = new BufferedReader(new FileReader(way));
        String str;
        int size = 0;
        while ((str = buff.readLine()) != null) {
            size +=1;
        }
        buff.close();
        String [] listData = new String [size];
        int i = 0;
        BufferedReader nbuf = new BufferedReader(new FileReader(way));
        while ((str = nbuf.readLine()) != null) {
            listData[i] = str;
            i += 1;
        }
        nbuf.close();
        return listData;
    }
    public static void main(String[] args) throws Exception{
        String [] list = ReadLineFromFile("C:\\Users\\user\\Desktop\\geekbrains\\GB_java\\HW\\data.txt");
        System.out.println(list[0]);
        StringBuilder resultSelect = LineInList(list[0]);
        System.out.println(resultSelect);
    }
    public static StringBuilder LineInList(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\n", "");
        System.out.println(line3);
        StringBuilder result = new StringBuilder("select * from students where ");
        String [] arrayData = line3.split(", ");
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            if(arrData[1].equals("null") == false) {
                if (i != 0) {
                    result.append(", ");
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                } else {
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                }
            }

        }
        return result;
    }
}
