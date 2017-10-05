package Abstraction;


    //abstract parent class
    abstract class Animal
    {
        //abstract method
        public abstract void sound();
    }
    //Dog class extends Animal class

    public class Dog extends Animal
    {

        public void sound()
        {
            System.out.println("Woof");

        }

     public class Cat extends Animal
     {


            public void sound()
            {

                System.out.println("Maow");
            }
     }
        public static void main(String args[])

        {
            Animal obj = new Dog();
            obj.sound();
        }
    }


