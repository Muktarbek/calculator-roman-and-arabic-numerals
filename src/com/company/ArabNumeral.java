package com.company;

public class ArabNumeral {

    public static int toInt(String input) {


        if (input.equals("1") || input.equals("I")) return 1;
        if (input.equals("2") || input.equals("II")) return 2;
        if (input.equals("3") || input.equals("III")) return 3;
        if (input.equals("4") || input.equals("IV")) return 4;
        if (input.equals("5") || input.equals("V")) return 5;
        if (input.equals("6") || input.equals("VI")) return 6;
        if (input.equals("7") || input.equals("VII")) return 7;
        if (input.equals("8") || input.equals("VIII")) return 8;
        if (input.equals("9") || input.equals("IX")) return 9;
        if (input.equals("10") || input.equals("X")) return 10;
        return 0;
    }

    public static boolean checked(String input) {


        if (input.equals("1")) return true;
        if (input.equals("2")) return true;
        if (input.equals("3")) return true;
        if (input.equals("4")) return true;
        if (input.equals("5")) return true;
        if (input.equals("6")) return true;
        if (input.equals("7")) return true;
        if (input.equals("8")) return true;
        if (input.equals("9")) return true;
        if (input.equals("10")) return true;
        return false;
    }

    public static double calculator(int value1 ,String operation ,int value2){
        if (operation.equals("+")) {
            return value1 + value2;
        }

        if (operation.equals("-")) {
            return  value1 - value2;
        }

        if (operation.equals("*")){
            return value1 * value2;
        }

        if (operation.equals("/")){
            return  (double) value1 / value2;
        }
        return 0;
    }

}