package encapsulation;


class Encp{


    int id;
    String name;
    String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}


public class GetData {


    public static void main(String[] args) {
        Encp e =new Encp();
        e.setId(1);
        e.setName("Smita");
        e.setCity("pune");
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getCity());




    }
}
