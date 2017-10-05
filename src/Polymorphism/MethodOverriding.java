package Polymorphism;

import javax.sound.midi.Soundbank;

public class MethodOverriding {


    public static void main(String[] args) {
        MethodOverloading mol=new MethodOverloading();
        Axis a=new Axis();
        Sbi s=new Sbi();
        Boi b= new Boi();


        System.out.println("");

    }

}


class Axis {
    int roi() {


        return 7;

    }
}

class Sbi{


    int roi(){

        return 8;

    }
}
class Boi{


    int roi(){

        return 9;
    }
}




