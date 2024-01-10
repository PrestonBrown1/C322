package Week1;

import java.util.Arrays;

import static Week1.Problems.problem1;


public class TestDrive {
    public static void main(String[] args) {
        //Test cases for problem 1

        int[][] nums = {{2, 3, 6, 7, 9}, {1, 3, 5, 7}, {1, 1, 1, 2}};
        int[] targets = {9, 8, 3};
        int[][] solutions = {{0, 3}, {0, 3}, {0, 3}};

        for (int i = 0; i < nums.length; i++) {
            int[] numbers = nums[i];
            int target = targets[i];
            int[] solution = solutions[i];

            int[] output = problem1(numbers, target);
            String result = "Wrong answer";
            if (solution[0] == output[0] && solution[1] == output[1]) {
                result = "Correct Answer";
            }
            System.out.println(result);
        }
    }
}
