package com.oocl;

public class FizzBuzz {
    public FizzBuzz() {
    }

    public boolean isDivisibleByNumber(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

    public String say(int number) {
        String result = "";
        if (isDivisibleByNumber(number, 3)) {
            result += "Fizz";
        }

        if (isDivisibleByNumber(number, 5)) {
            result += "Buzz";
        }
        return (result.equals("")) ? String.valueOf(number) : result;
    }
}
