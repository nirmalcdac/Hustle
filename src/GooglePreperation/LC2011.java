package GooglePreperation;

public class LC2011 {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                result++;
            } else if (operation.equals("--X") || operation.equals("X--")) {
                result--;
            }
        }
        return result;
    }
}
