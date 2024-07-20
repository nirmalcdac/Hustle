package GooglePreperation;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 0, 1, 2};
        doIt(arr);
    }

    private static void doIt(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int i = 1;
        int temp;
        while (i <= e) {
            if (arr[i] == 0) {
                temp = arr[i];
                arr[i] = arr[s];
                arr[s] = temp;
                s++;

            } else if (arr[i] == 2) {
                temp = arr[i];
                arr[i] = arr[e];
                arr[s] = temp;
                e--;
                continue;
            }
            i++;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }

}
