class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        Map<Character,Character> mapping=new HashMap();
        mapping.put(')','(');
        mapping.put(']','[');
        mapping.put('}','{');
      
        for(char ch:s.toCharArray()){
            if (mapping.containsValue(ch)){
                stack.push(ch);
            }else if (mapping.containsKey(ch)){

            if(stack.isEmpty() || stack.peek()!=mapping.get(ch)){
                return false;
            }
            stack.pop();
            }else{
                return false; //invalid character
            }
        }
        return stack.isEmpty();
    }
}