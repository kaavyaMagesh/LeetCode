class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int arrows=1;
        int prevStart=points[0][0];
        int prevEnd=points[0][1];

        for(int i=0;i<points.length;i++){
            int currentStart= points[i][0];
            int currentEnd= points[i][1];

            if(currentStart>prevEnd){
                arrows++;
                prevStart=currentStart;
                prevEnd=currentEnd;
            }else{
                prevStart=Math.max(prevStart,currentStart);
                prevEnd=Math.min(prevEnd,currentEnd);
            }
        }
        return arrows;
    }

}