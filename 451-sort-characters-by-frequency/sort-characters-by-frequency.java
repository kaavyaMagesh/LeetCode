class Solution {
    public String frequencySort(String s) {
    
          HashMap<Character,Integer> dict=new HashMap<>();

for(char c: s.toCharArray()){
dict.put(c,dict.getOrDefault(c,0)+1);

}

ArrayList<Map.Entry<Character,Integer>> arr=new ArrayList<>(dict.entrySet());

Collections.sort(arr,(a,b)->b.getValue()-a.getValue());

StringBuilder sb=new StringBuilder();

for(Map.Entry <Character,Integer> entry : arr){
    int freq=entry.getValue();
    char ch=entry.getKey();
    for(int i=0;i<freq;i++){
        sb.append(ch);
    }
}
return sb.toString();
    }
    
}