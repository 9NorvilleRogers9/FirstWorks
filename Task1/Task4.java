package Task4;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        Task4 task4 = new Task4();
        /*System.out.println("task4b");
        task4.task4b(50);*/
        /*System.out.println("task4b");
        task4.task4b();*/
        /*System.out.println("task4c");
        task4.task4c();*/
        /*System.out.println("task4d");
        task4.task4d();*/
        /*System.out.println("task4e");
        task4.task4e();*/
        System.out.println("task4f");
        task4.task4f();



    }

    public void task4a(int count) {
        int[] mas = new int[count];
        int j =0;

        for (int i = 1; i <= 99; i+=2) {
            mas[j] = i;
            j++;
        }

        int min, temp;

        for (int index = 0; index < mas.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < mas.length; scan++) {
                if (mas[scan] < mas[min])
                    min = scan;
            }
            temp = mas[min];
            mas[min] = mas[index];
            mas[index] = temp;
        }

        for (int i = 0; i < mas.length; i ++) {
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for (int c = mas.length -1 ; c >=0; c --) {
            System.out.print(mas[c] + " ");
        }
        System.out.println();
    }

    public void task4b()
    {
        int start=0;
        int end=10;
        int evenCount=0;
        int unvenCount=0;
        int mas[] = new int[20];

        System.out.println("Array:");
        for(int i = 0;i < 20; i++)
        {
             mas[i]=start+(int)(Math.random()*end);
             System.out.print(mas[i] + " ");
        }


        for(int i=0; i < 20;i++)
        {
            if((mas[i]%2) == 0)
            {
                evenCount+=1;
            }
            else
            {
                unvenCount++;
            }
        }
        System.out.println(" ");
        System.out.println("Even:" + evenCount);
        System.out.println("Uneven:" + unvenCount);


    }

    public void task4c() {

        int start = 0;
        int end = 100;
        int mas[] = new int[10];

        System.out.println("Source array:");
        for (int i = 0; i < 10; i++) {
            mas[i] = start + (int) (Math.random() * end);
            System.out.print(mas[i] + " ");
        }

        for (int i = 1; i < 10; i+=2)
        {
            mas[i]=0;
        }
        System.out.println(" ");
        System.out.println("New array:");

        for (int i = 0; i < 10; i++)
        {
            System.out.print(mas[i]+" ");
        }

    }

    public void task4d()
    {

        int start = -50;
        int end = 50;
        int min;
        int max;
        int mas[] = new int[15];

        System.out.println("Source array:");
        for (int i = 0; i < 15; i++) {
            mas[i] = start + (int) (Math.random() * end);
            System.out.print(mas[i] + " ");
        }
        max=mas[0];
        min=mas[0];
        int entryMin=0;
        int entryMax=0;

        for(int i=0;i < 15;i++)
        {
            if(max<mas[i])
            {
                max=mas[i];
            }
            if(min > mas[i])
            {
                min=mas[i];
            }
        }
        for(int i=0;i<15;i++)
        {
            if(mas[i]==max)
            {
                entryMax=i;
            }
            if(mas[i]==min)
            {
                entryMin=i;
            }

        }


        System.out.println(" ");
        System.out.println("Max:" + max + " "+"LastIndexMax:" + entryMax);
        System.out.println("Min:" + min +" " + "LastIndexMin:" + entryMin);


    }

    public void task4e()
    {
        int start =0;
        int end = 10;
        int mas[] = new int[10];
        int mas1[] = new int[10];
        double firstArrAverage;
        double secondArrAverage;
        int buff=0;
        int buff1=0;

        System.out.println("First array:");
        for (int i = 0; i < 10; i++) {
            mas[i] = start + (int) (Math.random() * end);
            mas1[i] = start + (int) (Math.random() * end);
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Second array:");
        for (int i = 0; i < 10; i++) {
            mas1[i] = start + (int) (Math.random() * end);
            System.out.print(mas1[i] + " ");
        }

        for(int i=0; i < 10;i++)
        {
            buff+=mas[i];
            buff1+=mas1[i];
        }

        firstArrAverage=buff/10;
        secondArrAverage=buff1/10;
        System.out.println(" ");
        System.out.println("Avg of First array:" + firstArrAverage);
        System.out.println("Avg of Second array:" + secondArrAverage);

        if(firstArrAverage > secondArrAverage)
        {
            System.out.println("First array is bigger");
        }
        else if(firstArrAverage < secondArrAverage)
        {
            System.out.println("Second array is bigger");
        }

        else
        {
            System.out.println("arrays are equal");
        }
    }
    public void task4f()
    {
        int start = -1;
        int end = 1;
        int number0=0;
        int number1=0;
        int numberMinus1=0;
        int mas[] = new int[20];
        System.out.println("Source array:");
        for (int i = 0; i < 20; i++) {
            mas[i] = (int) (Math.random() * 3)-1;
            System.out.print(mas[i] + " ");
        }

        for(int i=0;i<20;i++)
        {
            if(mas[i]==0)
            {
                number0++;
            }
            else if(mas[i]==1)
            {
                number1++;
            }
            else
            {
                numberMinus1++;
            }

        }
		if (number0 >number1 && number0 >numberMinus1)
        {
            System.out.println(" 0 is more common");
        }
        if(number1 >number0 && number1 >numberMinus1)
        {
            System.out.println(" 1 is more common");
        }
        if(numberMinus1 >number0 && numberMinus1 >number1)
        {
            System.out.println(" -1 is more common");
        }
        if(number0==number1||number0==numberMinus1)
        {
            System.out.println(" All is more common");
        }
        if(number0==number1)
        {
            System.out.println(" 0 and 1 is more common");
        }
        if(number1==numberMinus1)
        {
            System.out.println(" 1 and -1 is more common");
        }
        if(number0==numberMinus1)
        {
            System.out.println(" 0 and -1 is more common");
        }

    }


}
