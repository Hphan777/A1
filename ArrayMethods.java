import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ArrayMethods {

    /**
     * Calculates the sum of all elements in the given float array.
     * @param arr float array that contains the elements
     * @return the sum of all the elements in a float array
     */

    public static float wholeSum(float[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    /**
     * Calculate the sum of all element based on the given lowest input and highest input.
     * @param arr float array that contains the elements 
     * @param lo lowest index in range 
     * @param hi highest index in range 
     * @return the sum of all element in a float array
     */

    public static float sum(float[] arr, int lo, int hi) {
        float sum = 0;
        for (int i = lo; i <= hi-1; i++) {
            sum += arr[i];

        }

        return sum;

    }

    /**
     * Sum is overloaded and calculates the sum of all element with parameter 
     * @param arr float array that contains the element 
     * @return the sum of all element in a float array
     */

    public static float sum(float[] arr) {
        return sum(arr, 0, arr.length);

    }

    /**
     * Calculates the mean of an element from the given lowest input and high input 
     * @param arr float array that contains the elements 
     * @param lo lowest index in range 
     * @param hi highest index in range 
     * @return the mean of elements in a float array 
     */

    public static float mean(float[] arr, int lo, int hi) {
        return sum(arr, lo, arr.length) / (hi - lo);
    }

    /**
     * Mean method is overloaded and calculates the mean of all element with one paramter
     * @param arr float array that contains the elements 
     * @return the mean of elements in a float array 
     */

    public static float mean(float[] arr) {
        return sum(arr, 0, arr.length) / (arr.length);
    }

    /**
     * Calculate the minimum number in a float array from the given lowest input and highest input 
     * @param arr float array that contains the elements 
     * @param lo lowest index in range 
     * @param hi highest index in range 
     * @return the minium number in a float array
     */

    public static float min(float[] arr, int lo, int hi) {

        float min = arr[lo];

        if (arr.length == 0) {
            min = Float.NaN;
        } else {
            for (int i = lo; i < hi; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        return min;

    }

    /**
     * Min method is overloaded and calculates the minimum number in a float array from one paramter
     * @param arr float array that contains the elements
     * @return
     */
    
    public static float min(float[] arr) {

        float min = 0;

        if (arr.length == 0) {
            min = Float.NaN;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == -9999.0f) {
                    continue;
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        return min;
    }

    /**
     * Calculate the maximum number in a float array from the given lowest input and highest input 
     * @param arr float array that contains the elements 
     * @param lo lowest index in range 
     * @param hi highest index in range 
     * @return the maximum number in a floar array
     */ 
    
    public static float max(float[] arr, int lo, int hi) {

        float max = arr[lo];

        if (arr.length == 0) {
            max = Float.NaN;
        }

        for (int i = lo; i < hi; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;

    }

    /**
     * Max method is overloaded and calculates the maximum number in a float array from one paramter
     * @param arr float array that contains the elements 
     * @return the maximum number in a float array
     */
    
    public static float max(float[] arr) {

        float max = 0;

        if (arr.length == 0) {
            max = Float.NaN;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        return max;
    }

    /**
     * Checks if each element in the given float array is equal to a specified value.
     * @param arr float array that contains the elements 
     * @param value specific value 
     * @return An array of booleans where each element indicates whether the corresponding element in the 
     * input array is equal to the specified value.
     */


    public static boolean[] isEqualTo(float[] arr, float value) {
        boolean[] output = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                output[i] = true;
            } else {
                output[i] = false;
            }
        }
        return output;

    }

    /**
     * Computes the logical NOT operation on each element of the given boolean array.
     * @param arr float array that contains the elements 
     * @return An array of booleans where each element is the logical NOT of the corresponding element in the input array.
     */

    public static boolean[] logicalNot(boolean[] arr) {
        boolean[] output = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                output[i] = false;
            } else {
                output[i] = true;
            }
        }
        return output;

    }

    /**
     * Calculates the mean (average) of elements in the given float array, excluding elements with a value of -9999.0f.
     * @param arr float array that contains the elements 
     * @return The mean (average) of elements in the array, excluding elements with a value  of -9999.0f.
     *  Returns NaN if all elements are -9999.0f or if the array is empty
     */


    public static float mean2(float[] arr) {
        float sum = 0;
        boolean[] output = new boolean[arr.length];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == -9999.0f) {
                output[i] = false;
            } else {
                output[i] = true;
                sum += arr[i];
            }
        }
        return sum / (arr.length - 1);
    }
    
    /**
     * Mean method is overloaded and Calculates the mean of valid elements in a subarray of the given float array,
     * while also updating a corresponding boolean array to mark valid elements.
     * @param arr float array that contains the elements 
     * @param output The boolean array used to mark valid elements as 'true' and invalid elements as 'false'.
     * @param lo starting index 
     * @param hi ending index 
     * @return The mean of valid elements within the specified subarray.
     */
    
    public static float mean(float[] arr,boolean[] output, int lo, int hi) {
        float sum = 0;

        for (int i = lo; i <= hi-1; i++) {
            if (arr[i] == -9999.0f) {
                output[i] = false;
            } else {
                output[i] = true;
                sum += arr[i];
            }
        }
        return sum / (hi-1-lo);
    }
    
    /**
     * Compares each element in the given float array to a specified value and returns a boolean array indicating whether each element is greater than the specified value.
     * @param arr float array that contains the elements 
     * @param input The value to compare each element of the array with.
     * @return An array of booleans where each element indicates whether the corresponding element in the input array is greater than the specified value.
     */


    public static boolean[] isGreaterThan(float[] arr, float input) {
        boolean[] output = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > input) {
                output[i] = true;
            } else {
                output[i] = false;
            }
        }
        return output;
    }
    
    /**
     * Checks if each date in the given string array is within the specified date range defined by the start 
     * and end dates (inclusive).
     * @param arr float array that contains the elements 
     * @param startDate start date 
     * @param endDate end date 
     * @return An array of booleans where each element indicates whether the corresponding date in the 
     * input array is within the specified date range (inclusive).
     */

    public static boolean[] datesBetween(String[] arr, String startDate, String endDate) {
        boolean[] output = new boolean[arr.length];
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate start = LocalDate.parse(startDate, format);
        LocalDate end = LocalDate.parse(endDate, format);

        for (int i = 0; i < arr.length; i++) {
            LocalDate date = LocalDate.parse(arr[i], format);
            output[i] = !date.isBefore(start) && !date.isAfter(end);
        }

        return output;
        

     

      

        

    }


    




    public static void main(String[] args) {

    }
}
    










//}
    

    


