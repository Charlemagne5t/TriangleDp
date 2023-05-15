package org.example;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sizeOfLastRow = triangle.get(triangle.size() - 1).size();
        int[][] dp = new int[triangle.size()][sizeOfLastRow];
        //base case
        for (int i = 0; i < sizeOfLastRow; i++) {
            dp[triangle.size() - 1][i] = triangle.get(triangle.size() - 1).get(i);
        }
        //building dp table bottom -> up
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {

                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        //result will be in dp[0][0]
        return dp[0][0];
    }
}

