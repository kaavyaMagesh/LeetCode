class Solution {
    public int getWinner(int[] arr, int k) {
        
        Queue<Integer> queue= new LinkedList<>();

        int maxElement=arr[0];

        for(int i=1;i<arr.length;i++){
            maxElement=Math.max(maxElement,arr[i]);
            queue.offer(arr[i]);
        }

        int winnerStreak=0;
        int current=arr[0];

        while(!queue.isEmpty()){
            int opponent= queue.poll();
            if(current>opponent){
                queue.offer(opponent);
                winnerStreak++;

            }else{
                queue.offer(current);
                current=opponent;
                winnerStreak=1;
            }
            if(winnerStreak==k || current==maxElement)
            return current;
        }
        return -1;
    }
}