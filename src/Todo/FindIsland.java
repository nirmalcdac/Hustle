package Todo;

/*

/ Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
// An island is surrounded by water and is formed by connecting adjacent lands
// horizontally or vertically. You may assume all four edges of the grid are all
// surrounded by water.
//
// Example 1:
//
// Input: grid = [
//   ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1
// Example 2:
//
// Input: grid = [
//   ["1","1","0","0","0"],
//   ["1","1","0","0","0"],
//   ["0","0","1","0","0"],
//   ["0","0","0","1","1"]
// ]
// Output: 3
* */
public class FindIsland {
    public static void main(String[] args) {
        int[][] intArray = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 1}};
        int noOfIsland = 0;
        Execute(intArray, noOfIsland);
    }

    private static void Execute(int[][] intArray, int noOfIsland) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                if (intArray[i][j] == 1) {
                    traverse(i, j, intArray);
                    noOfIsland = +1;
                }
            }
        }
        System.out.println(noOfIsland);
    }

    private static void traverse(int i, int j, int[][] intArray) {
        if (i < intArray.length && j < intArray[i].length) {
            if (intArray[i][j] == 0) {
                //Stop
            } else {
                intArray[i][j] = 0;
                traverse(i, j + 1, intArray);//Right
                traverse(i, j - 1, intArray); //Left
                traverse(i + 1, j, intArray); //Bottom
                traverse(i - 1, j, intArray); //Top
            }
        }
    }
}
