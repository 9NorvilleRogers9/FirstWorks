package com.Task1;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Task1 task1 = new Task1();
        Scanner in = new Scanner(System.in);
        int size;
        int val=0;
        size = task1.getSize();
        while(val!=3) {
            val=in.nextInt();
            switch (val) {
                case 1: {
                    long result;
                    int array[];
                    array = task1.createArray(size);
                    System.out.println("Source array:");
                    task1.print(array);
                    result = task1.bubbleSort(array, size);
                    System.out.println(' ');
                    System.out.println("Sorted array:");
                    task1.print(array);
                    System.out.println(' ');
                    System.out.println("result:" + result);

                    break;
                }
                case 2: {
                    long result;
                    int array[];
                    array = task1.createArray(size);
                    System.out.println("Source array:");
                    task1.print(array);
                    result = task1.selectionSort(array, size);
                    System.out.println(' ');
                    System.out.println("Sorted array:");
                    task1.print(array);
                    System.out.println(' ');
                    System.out.println("result:" + result);
                    break;
                }

                case 3: {
                    val=3;
                    break;

                }


            }
        }
    }
    public int getSize()
    {
        System.out.print("Enter size:");
        Scanner in = new Scanner(System.in);
        int  size=in.nextInt();
        return size;
    }

    public int[] createArray(int size)
    {
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random()*101);
        }
        return array;
    }
    public void print(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public long bubbleSort(int array[],int size)
    {
        int tmp;
        long startTime = System.nanoTime();
        for(int i=size;i > 0; i--)
        {
            for(int j=0; j < size-1;j++)
            {
                if(array[j] > array[j+1])
                {
                    tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public long selectionSort(int array[],int size)
    {
        long startTime = System.nanoTime();
        for (int min = 0; min < size - 1; min++) {
            int least = min;
            for (int j = min + 1; j < size; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int tmp = array[min];
            array[min] = array[least];
            array[least] = tmp;
        }
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public void sortArrays()
    {

    }

}
