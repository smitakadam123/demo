package Homework;

public class Matrix2D {


    public static void main(String[] args) {


        int a=5,b=6,c=7,d=8;

        //int x[]=new int[4];
        int x[]={5,6,7,8};
        int y[]={9,6,7,5};
        int z[]={3,5,6,7};

        //int p[][]=new int[3][4];

        int p[][]={
                   {5,6,7,8},
                   {9,6,7,5},
                   {3,5,6,7},
                  };

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.println(p[i][j]);
            }
            System.out.println(" " );
        }





    }
}
