package com.bootcamp.week1;

public class BasicStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        String str3 = str1.concat(" ").concat(str2).concat("  ");

        System.out.println(str3);

        String str5 = str3.trim().toUpperCase();
        System.out.println(str5);


        String name = "Hello BPTN";
        //check if is in another text
        System.out.println(name.contains("BPTN"));

        /*
        * String comparison
        * Refrence type
        * */

        String str8 = "Hello";
        String str9 = "hello";

        System.out.println(str8.equals(str9));
        System.out.println(str8.equalsIgnoreCase(str9));

        System.out.println(str9.replace("h", "Helll"));

        String str11 = "Hallo";
        System.out.println(str11.charAt(1));

        String str12 = "switching git branch";
        System.out.println(str12);

        String s1 = "Hi";
        String s2 = s1.substring(0,1);
        String s3 = s2.toLowerCase();
        System.out.println(s3);


    }
}
