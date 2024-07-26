package EveryDayCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindIcelandTest {

    @Test
    public void testNumIslands_EmptyGrid() {
        FindIceland solution = new FindIceland();
        char[][] grid = {};
        assertEquals(0, solution.numIslands(grid), "Expected 0 islands for empty grid");
    }

    @Test
    public void testNumIslands_GridWithNoLand() {
        FindIceland solution = new FindIceland();
        char[][] grid = {
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'}
        };
        assertEquals(0, solution.numIslands(grid), "Expected 0 islands for grid with no land");
    }

    @Test
    public void testNumIslands_GridWithOneIsland() {
        FindIceland solution = new FindIceland();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(2, solution.numIslands(grid), "Expected 2 islands");
    }

    @Test
    public void testNumIslands_GridWithMultipleIslands() {
        FindIceland solution = new FindIceland();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '0', '0', '0', '1'},
                {'0', '0', '0', '1', '1'},
                {'0', '0', '0', '1', '0'}
        };
        assertEquals(2, solution.numIslands(grid), "Expected 3 islands");
    }

    @Test
    public void testNumIslands_ComplexGrid() {
        FindIceland solution = new FindIceland();
        char[][] grid = {
                {'1', '0', '1', '0', '1'},
                {'0', '1', '0', '1', '0'},
                {'1', '0', '1', '0', '1'}
        };
        assertEquals(8, solution.numIslands(grid), "Expected 9 islands for complex grid");
    }

    @Test
    public void testNumIslands_SingleElementGrid() {
        FindIceland solution = new FindIceland();
        char[][] grid = {{'1'}};
        assertEquals(1, solution.numIslands(grid), "Expected 1 island for single element grid");

        char[][] grid2 = {{'0'}};
        assertEquals(0, solution.numIslands(grid2), "Expected 0 islands for single element grid");
    }

    @Test
    public void testNumIslands_Question() {
        FindIceland solution = new FindIceland();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};

        assertEquals(3, solution.numIslands(grid), "Expected 3 islands for complex grid");
    }

    @Test
    public void testNumIslands_QuestionOne() {
        FindIceland solution = new FindIceland();
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};

        assertEquals(1, solution.numIslands(grid), "Expected 1 islands for complex grid");
    }
}
