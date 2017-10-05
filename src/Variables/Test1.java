package Variables;
//at the time of compilation error occure because age var is not initialized.

public class Test1 {
        public void pupAge()
        {
            int age=1;//here 1 is remove and then compile
            age = age + 7;
            System.out.println("Puppy age is : " + age);
        }

        public static void main(String args[]) {
            Test1 test = new Test1();
            test.pupAge();
        }
    }




