package looping;

public class Infinite {


    void show(){

        for(;;){

            System.out.println("Welcome");
        }


    }

    public static void main(String[] args) {

        Infinite fl=new Infinite();
        fl.show();
    }
}
