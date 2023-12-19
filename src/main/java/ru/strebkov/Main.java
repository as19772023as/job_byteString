package ru.strebkov;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(Arrays.toString(main.fizzBizzString(9)));


    }

    public byte[] fizzBizzString(int value){
        String result = "";
//        if (value % 3 == 0) return "Fizz".getBytes();
//        if ((value & 5) == 0) return "Bizz".getBytes();
        if (value % 3 == 0)  result += "Fizz";
        if (value % 5 == 0)  result += "Bizz";

        if(result.length() == 0) throw new IllegalArgumentException("Число не подходит");

        return result.getBytes();
    }


}