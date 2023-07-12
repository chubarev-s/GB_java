package HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    HashMap<String, List<String>> td = new HashMap<>();
    
    public Phonebook() {
    }
    public Phonebook(String[] phones, String subscriber) {
        for (String person : phones) {
            String[] Parts = person.split(subscriber);
            String secName = Parts[0];
            String phone = Parts[1];
            if (td.containsKey(secName)) {
                td.get(secName).add(phone);
            } else {
                ArrayList<String> lst = new ArrayList<>();
                lst.add(phone);
                td.put(secName, lst);
            }
        }
    }

    public void add(String secName, String phone) {
        if (td.containsKey(secName)) {
            td.get(secName).add(phone);
        } else {
            ArrayList<String> lst = new ArrayList<>();
            lst.add(phone);
            td.put(secName, lst);
        }
    }

    public List<String> get(String secName) {
        if (td.containsKey(secName)) {
            return td.get(secName);
        } else {
            return null;
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String name : td.keySet()) {
            result.append(String.format("%s: %s\n", name, td.get(name).toString()));
        }
        return result.toString();
    }



}
