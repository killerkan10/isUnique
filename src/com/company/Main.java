package com.company;

public class Main {


    boolean isUnique(String str) {

        System.out.println("start");
        System.out.println(str);

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            System.out.println(i);
            int val = str.charAt(i);
            if (char_set[val]) {
                System.out.println("Duplicate");
                return false;
            }

            char_set[val] = true;
            System.out.println("set to true");

        }
        System.out.println("no duplicate");
        return true;
    }

    public static void main(String[] args) {
        Main Unique = new Main();
        Unique.isUnique("abcdefghiklmnop");

    }
}