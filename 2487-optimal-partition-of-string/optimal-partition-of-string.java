class Solution {
    public int partitionString(String s) {
        int result=1;
        HashSet<Character> set= new HashSet<>();

        for(char ch: s.toCharArray()){
            if(set.contains(ch)){
                result++;
                set.clear();
            }
            set.add(ch);
        }
        return result;
    }
}