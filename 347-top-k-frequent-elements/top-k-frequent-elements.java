class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> dict=new HashMap<>();
        int [] ans=new int[k];
        for(int i:nums){
dict.put(i,dict.getOrDefault(i,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> entry: dict.entrySet()){

            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
 }
            for(int i=k-1;i>=0;i--){
ans[i]=pq.poll().getKey();
            }
       
return ans;

    }
}