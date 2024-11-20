import java.util.*;

class Solution {
    /* Function to find the indices of previous 
    greater element for each element in the array */
    private int[] findPGE(int[] arr) {
        
        int n = arr.length; //size of array
        
        // To store the previous greater elements
        int[] ans = new int[n];
        
        // Stack to get elements in LIFO fashion
        Stack<Integer> st = new Stack<>();
        
        // Start traversing from the front
        for(int i = 0; i < n; i++) {
            
            // Get the current element
            int currEle = arr[i];
            
            /* Pop the elements in the stack until 
            the stack is not empty and the top 
            element is not the greater element */
            while(!st.isEmpty() && arr[st.peek()] <= currEle) {
                st.pop();
            }
            
            /* If the greater element is not 
            found, stack will be empty */
            if(st.isEmpty()) 
                ans[i] = -1;
                
            // Else store the answer
            else 
                ans[i] = st.peek();
            
            // Push the current index in the stack 
            st.push(i);
        }
        
        // Return the result
        return ans;
    }
    
    // Function to find the span of stock prices for each day
    public int[] stockSpan(int[] arr, int n) {
        
        // Get the indices of previous greater elements
        int[] PGE = findPGE(arr);
        
        // To store the answer
        int[] ans = new int[n];
        
        // Compute the result
        for(int i = 0; i < n; i++) {
            ans[i] = i - PGE[i];
        }
        
        // Return the result
        return ans;
    }
    
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {120, 100, 60, 80, 90, 110, 115};
        
        /* Creating an instance of 
        Solution class */
        Solution sol = new Solution(); 
        
        /* Function call to find the span 
        of stock prices for each day */
        int[] ans = sol.stockSpan(arr, n);
        
        System.out.print("The span of stock prices is: ");
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
