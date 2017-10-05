//changes for this prog addition is not displayed.
package pac;
import java.util.Scanner;
public class Demopac {
     int a,b,c;
     void add(){
          System.out.println("Enter two num");
          Scanner sc=new Scanner(System.in);
          a=sc.nextInt();
          b=sc.nextInt();
          c=a+b;
          c=sc.nextInt();
     }
     public static void main(String[] args) {
          Demopac dp = new Demopac();
          dp.add();
     }

}
