class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> dict = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            dict.put(num, dict.getOrDefault(num, 0) + 1);
        }

        // Min heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> a.getValue() - b.getValue()); //rule for min heap
                //for max heap -(a, b) -> b.getValue() - a.getValue()

        // Keep only k most frequent elements
        for (Map.Entry<Integer, Integer> entry : dict.entrySet()) {

            pq.offer(entry);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] ans = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            ans[i] = pq.poll().getKey();
        }

        return ans;
    }
}