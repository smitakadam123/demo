package keywordthis;

public class ThisKey {

    float fee;
    int no;


    ThisKey(float fee,int no){

        this.fee=fee;
        this.no=no;
    }


    void display(){

        System.out.println(fee+" "+no);

    }
}
class Test{
    public static void main(String[] args) {


        ThisKey tk=new ThisKey(1200f,12);
        tk.display();


    }
}
