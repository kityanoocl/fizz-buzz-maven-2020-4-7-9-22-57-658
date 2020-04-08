package com.oocl;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {
    @Test
    public void should_return_number_when_raw_number_is_normal() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.say(1);

        assertThat(result, is("1"));
    }

    @Test
    public void should_return_Fizz_when_raw_number_is_divisible_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.say(3);

        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_Buzz_when_raw_number_is_divisible_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.say(5);

        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_FizzBuzz_when_raw_number_is_divisible_by_3_and_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.say(15);

        assertThat(result, is("FizzBuzz"));
    }
}
