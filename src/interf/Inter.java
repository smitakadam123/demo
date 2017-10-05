package interf;

public interface Inter {

    void call();
    void msg();
    void music();
}
interface Second{

    void call();
    void msg();
}

class Mobile implements Second,Inter{

    @Override
    public void call() {
        System.out.println("calling");
    }

    @Override
    public void msg() {
        System.out.println("Messaing");

    }

    @Override
    public void music() {


    }

    public static void main(String[] args) {

        Inter i=new Mobile();
        Second s= new Mobile();
        s.call();
        i.call();

    }
}