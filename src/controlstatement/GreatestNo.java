package controlstatement;

import java.util.Scanner;

public class GreatestNo {

    public static void main(String[] args) {



        int x, y, z;

        System.out.println("\t Enter 3 int no:");

        Scanner sc = new Scanner(System.in);


        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        if(x>y && x>z){

            System.out.println("First no is greater");
        }
        else if(y>x && y>z){


            System.out.println("Second no is greater");
        }
        else if(z>x && z>y)
        {

            System.out.println("Third no is greater");
        }
        else{

            System.out.println("Entered no is not distinct");
        }


    }
}
