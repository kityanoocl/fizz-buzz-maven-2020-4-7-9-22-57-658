package com.oocl;

public class FizzBuzz {
    public FizzBuzz () {};
    public String say (int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
