package Constructor;

public class ConstrucorDemo {

    int a,b,c;

    ConstrucorDemo()
    {
        System.out.println("Default Constructor");

    }
    void show(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("addition"+c);
    }

    public static void main(String[] args) {
        ConstrucorDemo cd=new ConstrucorDemo();
       //cd.show();
    }

}
