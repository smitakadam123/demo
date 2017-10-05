package keyword;

public class SuperKey {

String  topic="super";
SuperKey(){
    System.out.println("in parent con");

}
void show(){
    System.out.println(topic);
}

}
class keywords extends SuperKey{

    String topic="final";
    keywords()
    {

        System.out.println("in child constructor");

    }
    void show(){
        System.out.println(topic);
        //System.out.println(super.topic);
        super.show();

    }

    public static void main(String[] args) {
        keywords k=new keywords();


    }


}
