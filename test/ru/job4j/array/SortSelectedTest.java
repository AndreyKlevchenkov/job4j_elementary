package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort1() {
        int[] input = new int[]{5, 4, 3, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort2() {
        int[] input = new int[]{5, 4, 3, 2, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{0, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort3() {
        int[] input = new int[]{5, 4, 3};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort4() {
        int[] input = new int[]{5, 4, 3, 6, 7, 8, 9};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expect));
    }
}