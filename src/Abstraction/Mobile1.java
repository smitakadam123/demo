package Abstraction;


    abstract class Abstraction {

        void call(){
            System.out.println("Calling");


        }
        abstract void msg();
        abstract  void voice();



    }
    abstract  class celephone extends Abstraction{

        void msg(){

            System.out.println("Messaging");
        }

        void  voice(){

            System.out.println("voice");
        }

        public class Mobile extends celephone{


      //  public static void main(String[] args) {

          //  Abstraction a=new Mobile1 ();
            //a.call();
            //a.msg();
           // a.voice();
        }


    }

