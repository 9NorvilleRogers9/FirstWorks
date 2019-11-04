package Task5;

public class Task5 {

    public static void main(String[] args)
    {
        Task5 task5 = new Task5();
        /*System.out.println("task5a");
        task5.task5a();*/
       /*System.out.println("task5b");
        task5.task5b();*/
        /*System.out.println("task5c");
        task5.task5c();*/
        System.out.println("task5d");
        task5.task5d();


    }

    public void task5a()
    {
        int sizeC=8;
        int sizeR=8;
        int mas[][]=new int[sizeR][sizeC];
        int mainDiaSum=0;
        int maunDiaPr=1;
        int sideDiaSum=0;
        int sideDiaPr=1;

        for(int i=0;i < sizeR;i++)
        {
            for(int j=0;j<sizeC;j++)
            {
                mas[i][j]=1+(int)(Math.random()*99);
            }
        }

        for(int i=0;i < sizeR;i++)
        {
            for(int j=0;j<sizeC;j++)
            {
                System.out.print(mas[i][j]+" ");
            }
            System.out.println(" ");
        }

        for(int i=0;i<sizeR;i++)

            {
                for (int j=0;j<sizeC;j++)
                {
                    if(i==j)
                    {
                        mainDiaSum += mas[i][j];
                        maunDiaPr *=mas[i][j];
                    }
                    if(j == sizeC-1-i)
                    {
                        sideDiaSum += mas[i][j];
                        sideDiaPr *=mas[i][j];
                    }
                }
            }


        System.out.println(" ");
        System.out.println("Sum of main diagonal:" + mainDiaSum +"," + "Composition:" + maunDiaPr);
        System.out.println("Sum of side diagonal:" + sideDiaSum + "," +"Composition " + sideDiaPr);

    }

    public void task5b() {
        int sizeC = 5;
        int sizeR = 8;
        int max = 0;
        int mas[][] = new int[sizeR][sizeC];

        for (int i = 0; i < sizeR; i++) {
            for (int j = 0; j < sizeC; j++) {
                mas[i][j] = -99 + (int) (Math.random() * 199);
            }
        }

        for (int i = 0; i < sizeR; i++) {
            for (int j = 0; j < sizeC; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        max = mas[0][0];

        for (int i = 0; i < sizeR; i++) {
            for (int j = 0; j < sizeC; j++) {
                if (max < mas[i][j]) {
                    max = mas[i][j];
                }
            }
        }

        System.out.println(" ");
        System.out.print("Max element:"+max);
        System.out.println(" ");

        for (int i = 0; i < sizeR; i++)
        {
            for (int j = 0; j < sizeC; j++)
            {
                if (max == mas[i][j])
                {
                   System.out.print("index:" +" "+"i:" + i +" "+"j:"+j);
                   System.out.println(" ");
                }
            }
        }

    }
    public void task5c()
    {
        int sizeC = 5;
        int sizeR = 8;
        int maxIndex=0;
        int pr=1;
        int max;
        int mas[][] = new int[sizeR][sizeC];


        for (int i = 0; i < sizeR; i++) {
            for (int j = 0; j < sizeC; j++) {
                mas[i][j] = -10 + (int) (Math.random() * 21);
            }
        }

        for (int i = 0; i < sizeR; i++) {
            for (int j = 0; j < sizeC; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        max=mas[0][0];
        for (int i = 0; i < sizeR; i++)
        {
            for (int j = 0; j < sizeC; j++)
            {
                pr*=Math.abs(mas[i][j]);
            }
            if(pr > max)
            {
                max=pr;
                maxIndex=i;
            }
            pr=1;
        }

        System.out.println(" ");
        System.out.println("Index of max row:"+maxIndex);
        System.out.print("Value of max row:"+max);
    }

    public void task5d()
    {

        int sizeC = 7;
        int sizeR = 10;
        int max;
        int tmp;
        int mas[][] = new int[sizeR][sizeC];


        for (int i = 0; i < sizeR; i++) {
            for (int j = 0; j < sizeC; j++) {
                mas[i][j] = 0 + (int) (Math.random() * 100);
            }
        }
        System.out.println("Source array:");
        for (int i = 0; i < sizeR; i++) {
            for (int j = 0; j < sizeC; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < sizeR; i++) {
            for (int j = 0; j < sizeC; j++)
            {
                for(int c=j;c>0 && mas[i][c-1]<mas[i][c];c--)
                {

                     tmp = mas[i][c-1];
                     mas[i][c-1]=mas[i][c];
                     mas[i][c]=tmp;
                }


            }
        }
        for (int i = 0; i < sizeR; i++) {
            for (int j = 0; j < sizeC; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
