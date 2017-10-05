//If local variables(formal arguments) and instance variables are different,
// there is no need to use this keyword like in the following program:

//Program where this keyword is not required
package keywordthis;

public class NotUsedKeyword {

        int rollno;
        String name;
        float fee;
        NotUsedKeyword(int r,String n,float f){
            rollno=r;
            name=n;
            fee=f;
        }
        void display(){System.out.println(rollno+"   "+name+"   "+fee);}
    }

    class TestThis3{
        public static void main(String args[]){
            NotUsedKeyword s1=new NotUsedKeyword(111,"sk",5000f);
            NotUsedKeyword s2=new NotUsedKeyword(112,"ks",6000f);
            s1.display();
            s2.display();
        }}



