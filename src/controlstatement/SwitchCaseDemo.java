package controlstatement;

public class SwitchCaseDemo {

    void show()
    {
        int number=1;
        switch(number){

            case 1:
                System.out.println("in case 1");
                break;
            case 2:
                System.out.println("in case 2");
            case 3:
                System.out.println("in case 3");
                break;
            default:
                System.out.println("not available");
        }

    }
    public static void main(String[] args) {
        SwitchCaseDemo s=new SwitchCaseDemo();
        s.show();
    }
}
