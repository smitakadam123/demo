
//Check if input is a positive integer, negative integer, natural number and so on.
//changes if(number == int )this stat gives me error below nextInt statement.

package controlstatement;

import java.util.Scanner;

public class PositiveOrNatural {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number");

        int number=input.nextInt();

        {
            System.out.println("Number is natural and positive");
        }
    }

}
