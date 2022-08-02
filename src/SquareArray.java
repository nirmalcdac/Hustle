import java.util.Arrays;

public class SquareArray {
    public static void main(String[] args) {
        int[] intArray = new int[]{-4,-1,0,3,10};
        sortArray(intArray);
        for (int element: intArray) {
            System.out.println(element);
        }
    }

    private static void sortArray(int[] intArray) {
        for (int i=0;i<intArray.length;i++){
            intArray[i]=intArray[i]*intArray[i];
        }
        Arrays.sort(intArray);
    }
}
