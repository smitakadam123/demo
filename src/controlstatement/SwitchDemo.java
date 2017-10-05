package controlstatement;

import java.util.Scanner;

public class SwitchDemo{
    Scanner sc=new Scanner(System.in);
    int i;

    void show(){

        System.out.println("Enter a no ");
        i=sc.nextInt();

     if(i%2==0){

         System.out.println("EVEN NO");
     }
     else{

         System.out.println("ODD NO");
     }
        //System.out.println(i);

    }
    public static void main(String[] args) {

        SwitchDemo sd=new SwitchDemo();
        sd.show();

    }

}
