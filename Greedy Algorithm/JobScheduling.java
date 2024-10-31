import java.util.*;

class Solution {
    // Function to calculate maximum profit
    public int[] JobScheduling(int[][] Jobs) {
        // Sort jobs based on profit in descending order
        Arrays.sort(Jobs, (a, b) -> b[2] - a[2]);

        // Total number of jobs
        int n = Jobs.length;

        /*Initialize a hash table
        to store selected jobs.
        each element represents a
        deadline slot,
        initially unoccupied.*/
        int[] hash = new int[n];
        Arrays.fill(hash, -1);

        // Initialize count
        int cnt = 0;

        // Initialize the total profit earned
        int totalProfit = 0;

        // Iterate over each job
        for (int i = 0; i < n; i++) {
            /*Iterate over each deadline slot starting
            from the job's deadline*/
            for (int j = Jobs[i][1] - 1; j >= 0; j--) {
                /*If the current deadline
                slot is available
                (not occupied)*/
                if (hash[j] == -1) {
                    // Count of selected jobs
                    cnt++;
                    // Mark the job as selected
                    hash[j] = Jobs[i][0];
                    // Update the total profit
                    totalProfit += Jobs[i][2];
                    // Move to the next job
                    break;
                }
            }
        }

        // Return the array
        return new int[]{cnt,totalProfit};
    }

    public static void main(String[] args) {
        int[][] jobs = {{1, 4, 20}, {2, 1, 10}, {3, 1, 40}, {4, 1, 30}};

        Solution solution = new Solution();
        int[] result = solution.JobScheduling(jobs);

        // Output the result
        System.out.println("Number of Jobs: " + result[1]);
        System.out.println("Maximum Profit: " + result[0]);
    }
}
