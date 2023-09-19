package Java_Interim_Cert.service;

import Java_Interim_Cert.products.Toys;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private final List<Toys> toysList = new ArrayList<>();

    public void create(Integer id, String name, Integer quantity){
        Toys newToys = new Toys (id, name, quantity);
        toysList.add(newToys);
    }

    public List<Toys> getAllToys(){
        return toysList;
    }


}
