package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void calc() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(expected, is(rsl));
    }
    @Test
    public void factorialOneTosix() {
        int rsl = Factorial.calc(6);
        int expected = 720;
        assertThat(expected, is(rsl));
    }
    @Test
    public void factorialZeroThenOne() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(expected, is(rsl));
    }
}