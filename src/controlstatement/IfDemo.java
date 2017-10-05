package controlstatement;

import java.util.Scanner;

public class IfDemo {

    int a,b;
    void result(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a no");
        a=s.nextInt();

        if(a>75){

            System.out.print("distinction");

        }
        else if(a>60){
            System.out.println("first class");
        }


    }

    public static void main(String[] args) {
        IfDemo id=new  IfDemo();
        id.result();

    }
}
