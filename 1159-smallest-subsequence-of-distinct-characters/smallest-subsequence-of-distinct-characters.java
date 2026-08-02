class Solution {
    public String smallestSubsequence(String s) {
         HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }

Stack<Character> stack=new Stack<>();
HashSet<Character> visited=new HashSet<>();

for(int i=0;i<s.length();i++){
            char current=s.charAt(i);

            if(visited.contains(current)){
                continue;
            }

            while(!stack.isEmpty() && current<stack.peek() && map.get(stack.peek())>i){
                visited.remove(stack.pop());
            }
            stack.push(current);
            visited.add(current);


        }
        StringBuilder sb=new StringBuilder();

for(char c:stack){
sb.append(c);
}

return sb.toString();
    }
}