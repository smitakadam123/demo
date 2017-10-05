package controlstatement;
import java.util.Scanner;

public class ArithSwitchDemo {

    int a,b,result,casenumber;
    Scanner s=new Scanner(System.in);
    void add() {


        int a, b, result;
        System.out.println("enter the value of a and b");
        a = s.nextInt();
        b = s.nextInt();
        result = a + b;
        System.out.println(result);
    }

    void mul(){


    }
    void div(){

    }
    void sub(){

    }

    void show(){

        System.out.println("enter your choice");

        casenumber=s.nextInt();

        switch(casenumber){

            case 1:

                add();
                System.out.println("addition");
                break;
        }
    }

    public static void main(String[] args) {

        ArithSwitchDemo asd=new ArithSwitchDemo();
        asd.show();

    }
}
