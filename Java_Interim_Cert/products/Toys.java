package Java_Interim_Cert.products;

public class Toys {
    private Integer id;
    private String name;
    private Integer quantity;


    public Toys(Integer id, String name, Integer quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public  String toString(){
        return "-----------------------------------\n" +
                "Toy: \n" +
                "id - " + id +
                "\ntoy name: " + name +
                "\ndrop chance - " + quantity + "%\n" +
                "-----------------------------------\n";
    }

}
