class Solution {
    public String removeDuplicateLetters(String s) {

        // Stores the LAST index where each character appears.
        // Example:
        // s = "cbacdcbc"
        // c -> 7
        // b -> 6
        // a -> 2
        // d -> 4
        HashMap<Character, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }

        // Keeps track of characters already present in the stack.
        // Prevents duplicates.
        HashSet<Character> visited = new HashSet<>();

        // Stores our current answer.
        Stack<Character> stack = new Stack<>();

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            // If we've already placed this character in the answer,
            // skip it.
            if (visited.contains(current)) {
                continue;
            }

            // Remove larger characters from the top of the stack
            // IF:
            // 1. Stack isn't empty
            // 2. Current character is smaller (better lexicographically)
            // 3. The top character appears again later
            while (!stack.isEmpty()
                    && current < stack.peek()
                    && lastIndex.get(stack.peek()) > i) {

                // Remove from visited because it is no longer
                // in our answer.
                visited.remove(stack.pop());
            }

            // Add current character
            stack.push(current);

            // Mark it as used
            visited.add(current);
        }

        // Convert stack into a string
        StringBuilder sb = new StringBuilder();

        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}