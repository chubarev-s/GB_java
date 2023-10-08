package HW;
import java.util.HashMap;

public class hw4hashmap {
        private HashMap<String, String> map;
        public hw4hashmap() {

            map = new HashMap<String, String>();

        }


        @Override
        public String toString() {

            StringBuilder stringBuilder = new StringBuilder();

            for (HashMap.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                stringBuilder.append(key).append(" : ").append(value).append("\n");

            }
            return stringBuilder.toString();
        }

        public void put(String key, String value) {
            map.put(key, value);
        }

        public static void main(String[] args) {

            hw4hashmap newHashMap = new hw4hashmap();

            newHashMap.put("name", "Sergey");

            newHashMap.put("age", "27");

            newHashMap.put("country", "Russia");



            System.out.println(newHashMap.toString());

        }

}

