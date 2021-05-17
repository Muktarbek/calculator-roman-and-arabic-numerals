package com.company;

public class RomanNumeral {




    public  static boolean chekсed(String input){


            if(input.equals("I")) return true;
            if(input.equals("II")) return true;
            if(input.equals("III")) return true;
            if(input.equals("IV")) return true;
            if(input.equals("V")) return true;
            if(input.equals("VI")) return true;
            if(input.equals("VII")) return true;
            if(input.equals("VIII")) return true;
            if(input.equals("XI")) return true;
            if(input.equals("X")) return true;
            return false;
        }




    public static String toRomanNumeral(int input) {
        if (input < 1 || input > 100)
            return "Invalid Roman Number Value";
        String s = "";

        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }
}
