package looping;

public class ArrayDemo {

    void oneDArray(){

        int arr[]={1,2,3,4,5};
        for(int i=0;i<5;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        ArrayDemo ad=new ArrayDemo();
        ad.oneDArray();

    }
}
