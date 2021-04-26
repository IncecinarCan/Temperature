package com.example.Temperature;

public class Conversion {

    public Object Fahrenheit;

    public int getConversionTemp(String temp) {
        int Celsius;
        for (Celsius = 1; Celsius <= 40; Celsius++) ;
        Fahrenheit = ((Celsius * 9) / 5) + 32;
        if (Celsius == 0) return 0;
        else return (int) Fahrenheit;


    }

}