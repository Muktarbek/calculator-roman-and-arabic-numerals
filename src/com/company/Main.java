package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String operation = "";
        String number1 = "";
        String number2 = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != '-' && text.charAt(i) != '+' && text.charAt(i) != '*' && text.charAt(i) != '/')
                number2 += String.valueOf(text.charAt(i));
            else {
                operation = String.valueOf(text.charAt(i));
                number1 = number2;
                number2 = "";
            }
        }


        try {
            if (number1.length() + number2.length() + operation.length() != text.length())
                throw new IllegalAccessException("Сиз туура эмес берип жатасыз ,синтаксис туура эмес");
            else if (ArabNumeral.checked(number1) && ArabNumeral.checked(number2))
                System.out.println(ArabNumeral.calculator(ArabNumeral.toInt(number1), operation, ArabNumeral.toInt(number2)));
            else if (RomanNumeral.chekсed(number1) && RomanNumeral.chekсed(number2)) {
                int resultArab = (int) ArabNumeral.calculator(ArabNumeral.toInt(number1), operation, ArabNumeral.toInt(number2));
                System.out.println(RomanNumeral.toRomanNumeral(resultArab));
            } else  throw new IllegalAccessException("Синтаксис туура эмес берип жатасыз");

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

