package com.oocl;

public class FizzBuzz {
    public FizzBuzz () {};
    public String say (int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
