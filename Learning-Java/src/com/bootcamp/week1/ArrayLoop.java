package com.bootcamp.week1;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] numArray =  {3, 4, 5, 6, 7};
        int[] numArray1={2,4,6,8,10};

        multiplyArray(numArray);
        multiplyArray(numArray1);
    }

    public static void multiplyArray(int[] values) {
        for(int i=0;i<values.length;i++) {
            values[i]*=2;
            System.out.println("the values in the array which are doubled "+ values[i]);
        }
    }
}