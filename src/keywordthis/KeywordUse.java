package keywordthis;
//1) this: to refer current class instance variable

//The this keyword can be used to refer current class instance variable. If there is ambiguity between
// the instance variables and parameters,
// this keyword resolves the problem of ambiguity.

public class KeywordUse {

        int rollno;
        String name;
        float fee;
        KeywordUse(int rollno,String name,float fee)
        {
            this.rollno=rollno;
            this.name=name;
            this.fee=fee;
        }
        void display()
        {
            System.out.println(rollno+" "+name+" "+fee);
        }
    }

    class TestThis2{

        public static void main(String args[])
        {
            KeywordUse k1=new KeywordUse(111,"smita",5000f);
            KeywordUse k2=new KeywordUse(112,"sonali",6000f);
            k1.display();
            k2.display();
        }
}

