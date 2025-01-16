import java.util.*;

class Solution {

    /* Function to determine number of steps
    to reach from start ward to target word */
    public int wordLadderLength(String startWord, 
                                String targetWord, 
                                List<String> wordList) {
        
        /* Queue data structure to store pair:
         {"word", steps to reach "word"} */
        Queue<Pair> q = new LinkedList<>();
        
        // Add the starting word to queue
        q.add(new Pair(startWord, 1));
        
        // Add all the words to a hashset
        Set<String> st = new HashSet<>(wordList);
        
        /* Erase the starting word 
        from set (if it exists) */
        st.remove(startWord);
        
        // Until the queue is empty
        while (!q.isEmpty()){
            
            // Get the word from queue
            String word = q.peek().word;
            
            // Get the steps from queue
            int steps = q.peek().steps;
            q.poll();

            // Return steps if target word is achieved
            if (word.equals(targetWord))
                return steps;
            
            // Iterate on every character
            for (int i = 0; i < word.length(); i++) {
                // Store the original letter 
                char original = word.charAt(i);
                
                /* Replacing current character with
                letters from 'a' to 'z' to match 
                any possible word from set */
                
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char[] wordArray = word.toCharArray();
                    wordArray[i] = ch;
                    String newWord = new String(wordArray);
                    
                    // Check if it exists in the set
                    if (st.contains(newWord)) {
                         
                        // Erase the word from set 
                        st.remove(newWord);
                        
                        // Add the transition to the queue
                        q.add(new Pair(newWord, steps + 1));
                    }
                }
                
                // Update the original letter back
                word = word.substring(0, i) + original + 
                       word.substring(i + 1);
            }
        }
        
        /* If no transformation sequence 
        is found, return 0 */
        return 0;
    }

    // Custom Pair class
    static class Pair {
        String word;
        int steps;

        Pair(String word, int steps) {
            this.word = word;
            this.steps = steps;
        }
    }

    public static void main(String[] args) {

        String startWord = "der", targetWord = "dfs";
        List<String> wordList = 
        Arrays.asList("des", "der", "dfr", "dgt", "dfs");

        /* Creating an instance of 
        Solution class */
        Solution sol = new Solution();

        /* Function call to determine number of 
        steps to reach from start ward to target word */
        int ans = 
        sol.wordLadderLength(startWord, targetWord, wordList);

        // Output
        System.out.println("Word ladder length is: " + ans);
    }
}
