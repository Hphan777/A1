import org.junit.*; 

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;




public class ArrayMethodsTest {

    @Test
    public void testWholeSum() {

        float[] arr = { 1.0f, 2.0f, 3.0f, 4.0f };
        assertEquals(10.0f, ArrayMethods.wholeSum(arr), 0.01f);
        float[] arr1 = { -7.5f, 3.2f };
        assertEquals(-4.3, ArrayMethods.wholeSum(arr1), 0.01f);
        float[] arr2 = {};
        assertEquals(0.0f, ArrayMethods.wholeSum(arr2), 0.01f);
        float[] arr3 = { 1.0f, 2.0f, 3.0f };
        assertEquals(6.0f, ArrayMethods.wholeSum(arr3), 0.01f);
        float[] arr4 = { -2.0f };
        assertEquals(-2.0f, ArrayMethods.wholeSum(arr4), 0.01f);
    }

    @Test
    public void testSum() {
        float[] arr = { 1.0f, 2.0f, 3.0f, 4.0f };
        float[] arr1 = {};
        assertEquals(5.0f, ArrayMethods.sum(arr, 1, 3), 0.01f);
        assertEquals(10.0f, ArrayMethods.sum(arr, 0, 4), 0.01f);
        assertEquals(0.0f, ArrayMethods.sum(arr, 2, 2), 0.01f);
        assertEquals(0.0f, ArrayMethods.sum(arr1), 0.01f);

    }

    @Test
    public void testMean() {
        float[] arr = { 1.0f, 2.0f, 3.0f, 4.0f };
        float[] arr2 = { 1.0f, -9999.0f, 3.0f, 2.0f };
        boolean[] output1 = { true, false, true, true };
        float[] arr3 = {};
        assertEquals(3.5f, ArrayMethods.mean(arr, 2, 4), 0.01f);
        assertEquals(2.5f, ArrayMethods.mean(arr, 0, 4), 0.01f);
        assertEquals(2.5f, ArrayMethods.mean(arr), 0.01f);
        assertEquals(2.0f, ArrayMethods.mean(arr2, output1, 0, 4), 0.01f);
        assertEquals(0.0f, ArrayMethods.mean(arr3, 0, 4), 0.01f);

    }

    @Test
    public void testMean2() {
        float[] arr1 = { 1.0f, -9999.0f, 3.0f, 2.0f };
        assertEquals(2.0f, ArrayMethods.mean2(arr1), 0.01f);

    }

    @Test
    public void testMin() {
        float[] arr = { 1.0f, 3.0f, 2.0f, 4.0f };
        float[] arr1 = {};
        assertEquals(2.0f, ArrayMethods.min(arr, 1, 4), 0.01f);
        assertEquals(1.0f, ArrayMethods.min(arr, 0, 4), 0.01f);
        assertEquals(Float.NaN, ArrayMethods.min(arr, 2, 2), 0.01f);
        assertEquals(Float.NaN, ArrayMethods.min(arr1), 0.01f);

    }

    @Test
    public void testMax() {
        float[] arr = { 1.0f, 3.0f, 2.0f, 4.0f };
        float[] arr1 = { 1.0f, 3.0f, 2.0f };
        float[] arr2 = {};
        assertEquals(4.0f, ArrayMethods.max(arr, 1, 4), 0.01f);
        assertEquals(3.0f, ArrayMethods.max(arr1, 0, 3), 0.01f);
        assertEquals(Float.NaN, ArrayMethods.max(arr, 2, 2), 0.01f);
        assertEquals(Float.NaN, ArrayMethods.max(arr2), 0.01f);

    }

    @Test
    public void testIsEqualTo() {
        float[] input = { 1.0f, 2.0f, 3.0f, 2.0f };
        boolean[] output = { false, true, false, true };
        assertArrayEquals(output, ArrayMethods.isEqualTo(input, 2.0f));
        float[] input1 = { 1.0f, -9999.0f, 3.0f, 2.0f };
        boolean[] output1 = { false, true, false, false };
        assertArrayEquals(output1, ArrayMethods.isEqualTo(input1, -9999.0f));

    }

    @Test
    public void testLogicalNot() {
        boolean[] input = { false, true, false, false };
        boolean[] output = { true, false, true, true };
        assertArrayEquals(output, ArrayMethods.logicalNot(input));
    }

    @Test
    public void testIsGreaterThan() {
        float[] input = { 1.0f, 2.0f, 3.0f, 2.5f };
        boolean[] output = { false, false, true, false };
        float[] input1 = { 1.0f, 2.0f, 4.0f, 1.0f };
        boolean[] output1 = { false, false, false, false };
        assertArrayEquals(output, ArrayMethods.isGreaterThan(input, 2.5f));
        assertArrayEquals(output1, ArrayMethods.isGreaterThan(input1, 4.0f));
    }

    @Test
    public void datesBetween() {
        String[] arr = { "20230101", "20230214", "20230704" };
        boolean[] output = { false, true, false };
        assertArrayEquals(output, ArrayMethods.datesBetween(arr, "20230201", "20230601"));

    }

    @Test
    public void testLowest() {
        float[] arr1 = { 1.0f, 3.0f, 2.0f, 4.0f };
        float[] arr2 = { 2.0f, 3.0f, 2.0f, 3.0f };
        float[] arr3 = { 4.0f, 3.0f, 2.0f, 1.0f };
        //float[] arr4 = { 4.0f, 3.0f };
        float[] output = { 1.0f, 2.0f };
        float[] output1 = { 2.0f, 2.0f, 3.0f };
        float[] output3 = { 1.0f };
        //float[] output4 = { 4.0f, 3.0f, Float.NaN};

        assertArrayEquals(output, ArrayMethods.lowest(arr1, 0, 4, 2), 0.01f);
        assertArrayEquals(output1, ArrayMethods.lowest(arr2, 0, 4, 3), 0.01f);
        assertArrayEquals(output, ArrayMethods.lowest(arr3, 2), 0.01f);
        assertArrayEquals(output3, ArrayMethods.lowest(arr3, 1), 0.01f);
        //assertArrayEquals(output4, ArrayMethods.lowest(arr4, 3), 0.01f);

    }

    @Test
    public void testHighest() {
        float[] arr1 = { 1.0f, 3.0f, 2.0f, 4.0f };
        float[] arr2 = { 2.0f, 3.0f, 2.0f, 3.0f };
        float[] arr3 = { 4.0f, 3.0f, 2.0f, 1.0f };
        //float[] arr4 = { 4.0f, 3.0f };
        float[] output = { 3.0f, 4.0f };
        float[] output1 = { 3.0f, 3.0f, 2.0f };
        float[] output3 = { 4.0f };
        //float[] output4 = { 4.0f, 3.0f, Float.NaN };

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        Arrays.sort(output1);
        Arrays.sort(output);
        Arrays.sort(output3);



        assertArrayEquals(output1, ArrayMethods.highest(arr2, 0, 4, 3), 0.01f);
        assertArrayEquals(output, ArrayMethods.highest(arr3, 2), 0.01f);
        assertArrayEquals(output3, ArrayMethods.highest(arr3, 1), 0.01f);
        //assertArrayEquals(output4, ArrayMethods.highest(arr4, 3), 0.01f);
        assertArrayEquals(output, ArrayMethods.highest(arr1, 0, 4, 2), 0.01f);


    }


}


    








    






    

