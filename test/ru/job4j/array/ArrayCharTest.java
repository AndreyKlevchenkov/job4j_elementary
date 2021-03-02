package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }
    @Test
    public void whenNotStartWithPrefixThenTrue2() {
        char[] word = {'P', 'r', 'i', 'v', 'e', 't'};
        char[] pref = {'P', 'r', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse2() {
        char[] word = {'P', 'r', 'i', 'v', 'e', 't'};
        char[] pref = {'P', 'r', 'i', 'v', 'e', 'd'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
    @Test
    public void whenNotStartWithPrefixThenFalse3() {
        char[] word = {'P', 'r', 'i', 'v', 'e', 't'};
        char[] pref = {'P', 'r', 'v'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
    @Test
    public void whenNotStartWithPrefixThenFalse4() {
        char[] word = {'P', 'r', 'i', 'v', 'e', 't'};
        char[] pref = {'P', 'r', 'i', 'v', 'e', 't', 't'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
}