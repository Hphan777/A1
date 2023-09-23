import org.junit.*; 

import static org.junit.Assert.*;



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
        float[] arr4 = {-2.0f};
        assertEquals(-2.0f, ArrayMethods.wholeSum(arr4), 0.01f);
    }

    @Test
    public void testSum() {
        float[] arr = { 1.0f, 2.0f, 3.0f, 4.0f };
        assertEquals(5.0f, ArrayMethods.sum(arr, 1, 3), 0.01f);
        assertEquals(10.0f, ArrayMethods.sum(arr, 0, 4), 0.01f);
        assertEquals(0.0f, ArrayMethods.sum(arr, 2, 2), 0.01f);
    }

    @Test
    public void testMean() {
        float[] arr = { 1.0f, 2.0f, 3.0f, 4.0f };
        float[] arr1 = { 1.0f, -9999.0f, 3.0f, 2.0f };
        boolean[] output1 = { true, false, true, true };
        float[] arr2 = {};
        assertEquals(3.5f, ArrayMethods.mean(arr, 2, 4), 0.01f);
        assertEquals(2.5f, ArrayMethods.mean(arr, 0, 4), 0.01f);
        //assertEquals(2.5f, ArrayMethods.mean(arr, 1, 3), 0.01f);
        assertEquals(2.0f, ArrayMethods.mean(arr1, output1, 0, 4), 0.01f);
        assertEquals(0.0f, ArrayMethods.mean(arr2, 0, 4), 0.01f);

    }

    @Test
    public void testMin() {
        float[] arr = { 1.0f, 3.0f, 2.0f, 4.0f };
        //float[] arr1 = {};
        assertEquals(2.0f, ArrayMethods.min(arr, 1, 4), 0.01f);
        assertEquals(1.0f, ArrayMethods.min(arr, 0, 4), 0.01f);
        //assertEquals(Float.NaN, ArrayMethods.min(arr1,0,0),0.01f);


    }
    
    @Test
    public void testMax() {
        float[] arr = { 1.0f, 3.0f, 2.0f, 4.0f };
        float[] arr1 = { 1.0f, 3.0f, 2.0f };
        assertEquals(4.0f, ArrayMethods.max(arr, 1, 4), 0.01f);
        assertEquals(3.0f, ArrayMethods.max(arr1, 0, 3), 0.01f);

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
        assertArrayEquals(output, ArrayMethods.isGreaterThan(input, 2.5f));
    }

    
}




    






    

