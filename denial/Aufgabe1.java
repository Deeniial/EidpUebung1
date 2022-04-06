package com.denial;

public class Aufgabe1 {
    public static double produkt(double a, double b){
        double c;
        c = a * b;
        return c;
    }

    public static String negativ(int a){
        if (a < 0){
            return "Die Zahl ist Negativ!";
        }
        else{
            return "Die Zahl ist Positiv!"
        }
    }

    public static String unterschrift(String sign){
        return sign;
    }
}
