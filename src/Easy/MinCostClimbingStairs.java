package Easy;public class MinCostClimbingStairs {
   //O(1) space Optimised Solution
    public int minCostClimbingStairsOpti(int[] cost) {
        int minOne = cost[0];
        int minTwo = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int currentMin = cost[i] + Math.min(minOne, minTwo);
            minOne = minTwo;
            minTwo = currentMin;
        }
        return Math.min(minOne, minTwo);
    }

    //Time Optimised Solution
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            int cost1 = cost[i - 1] + dp[i - 1];
            int cost2 = cost[i - 2] + dp[i - 2];
            dp[i] = Math.min(cost1, cost2);
        }

        return dp[n];
    }
}
