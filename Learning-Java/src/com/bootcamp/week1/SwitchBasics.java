package com.bootcamp.week1;

public class SwitchBasics {
    public static void main(String[] args) {
        int day = 6;

        switch (day){
            case 1 -> System.out.println("Mon");
            case 2 -> System.out.println("Tus");
            case 3 -> System.out.println("Wed");
            case 4 -> System.out.println("Thr");
            case 5 -> System.out.println("Fri");
            case 6, 7 -> {
                System.out.println("Enjoy weekend");
                System.out.println("Its a holly week");
            }
            default -> System.out.println("Invalid day");
        }

    }
}
