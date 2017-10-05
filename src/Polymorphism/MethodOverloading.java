package Polymorphism;

public class MethodOverloading {


    void show()
                {

                    System.out.println("Hi...");

                }

    void show1(int a)
                {


                    System.out.println("Hello :"+a);
                }
    void show(int c,int b)
                {

                    System.out.println();

                }

    public static void main(String[] args) {

        MethodOverloading mo=new MethodOverloading();
        mo.show();

    }


    }


