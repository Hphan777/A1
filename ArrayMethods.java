public class ArrayMethods {

    /**
     * Returns the sum of all the elements in an array
     */

    public static float wholeSum(float[] arr) {
        float sum = 0f;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static float sum(float[] arr, int lo, int hi) {
        float sum = 0f;
        for (int i = lo; i <= hi-1; i++) {
            sum += arr[i];

        }

        return sum;

    }

    //method overloaded

    public static float sum(float[] arr) {
        return sum(arr, 0, arr.length-1);

    }

    public static float mean(float[] arr, int lo, int hi) {
        return sum(arr, lo, arr.length) / (hi - lo);
    }

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
    
    public static float max(float[] arr, int lo, int hi) {

        float max = arr[lo];
     
        if (arr.length ==0) {
            max= Float.NaN;
        }

        for (int i = lo; i < hi; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            
        }
        return max;
    
    }


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

    public static float mean(float[] arr, boolean[] output, int lo, int hi) {
        float sum = 0f;

        for (int i = lo; i <= hi - 1; i++) {
            if (arr[i] == -9999.0f) {
                output[i] = false;
            } else {
                output[i] = true;
                sum += arr[i];
            }
        }
        return sum / ((hi - 1) - lo);
    }

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


    




    public static void main(String[] args) {

    }
}
    










//}
    

    


