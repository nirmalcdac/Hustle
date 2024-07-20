package GooglePreperation;

public class LC346 {
    int[] arr;
    int windowSize;

    public LC346(int size) {
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 0;
        }
        windowSize = 0;
    }

    public double next(int val) {
        if (windowSize < arr.length) {
            windowSize++;
        }
        int temp = 0;
        int temp1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                arr[i] = temp;
            }
            if (i == arr.length - 1) {
                temp = val;
            }
            temp1 = arr[i];
            arr[i] = temp;
            temp = temp1;
        }
        double sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum / windowSize;
    }
}
