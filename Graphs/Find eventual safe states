import java.util.*;

class Solution {
    
    /* Function to perform DFS traversal 
    while checking for safe nodes */
    private boolean dfsCheck(int node, int[][] adj, 
                             boolean[] vis, 
                             boolean[] pathVis, 
                             boolean[] check) {
                                 
        // Mark the node as visited
        vis[node] = true;
        
        // Add the node to current path
        pathVis[node] = true;
        
        // Mark the node as potentially unsafe
        check[node] = false;
        
        // Traverse for adjacent nodes
        for (int it : adj[node]) {
            
            // When the node is not visited
            if (!vis[it]) {
                
                /* Perform DFS recursively and if 
                a cycle is found, return false */
                if (dfsCheck(it, adj, vis, pathVis, check)) {
                    
                    /* Return true since a 
                    cycle was detected */
                    return true;
                }

            }
            
            /* Else if the node has been previously 
            visited in the same path*/
            else if (pathVis[it]) {
                
                /* Return true since a 
                cycle was detected */
                return true;
            }
        }
        
        /* If the current node neither exist 
        in a cycle nor points to a cycle, 
        it can be marked as a safe node */
        check[node] = true;
        
        // Remove the node from the current path
        pathVis[node] = false;
        
        // Return false since no cycle was found
        return false;
    }
    
    // Function to get the eventually safe nodes
    public int[] eventualSafeNodes(int V, int[][] adj) {
        
        // Visited array
        boolean[] vis = new boolean[V];
        
        // Path Visited array
        boolean[] pathVis = new boolean[V];
        
        // To keep a check of safe nodes
        boolean[] check = new boolean[V];
        
        /* Traverse the graph and 
        check for safe nodes */
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                
                // Start DFS traversal
                dfsCheck(i, adj, vis, pathVis, check);
            }
        }
        
        // To store the result
        List<Integer> temp = new ArrayList<>();
        
        // Add the safe nodes to the result
        for (int i = 0; i < V; i++) {
            if (check[i]) 
                temp.add(i);
        }
        
        // Convert List to array
        int[] ans = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            ans[i] = temp.get(i);
        }
        
        // Return the result
        return ans;
    }
    
    public static void main(String[] args) {
        int V = 7;
        int[][] adj = {
            {1, 2},
            {2, 3},
            {5},
            {0},
            {5},
            {},
            {}
        };
        
        /* Creating an instance of 
        Solution class */
        Solution sol = new Solution();
        
        /* Function call to get the eventually 
        safe nodes in the given graph */
        int[] ans = sol.eventualSafeNodes(V, adj);
        
        // Output
        System.out.println("The eventually safe nodes in the graph are:");
        for (int node : ans) {
            System.out.print(node + " ");
        }
    }
}
