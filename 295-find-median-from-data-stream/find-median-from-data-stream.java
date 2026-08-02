class MedianFinder {

    // Max Heap -> stores smaller half
    PriorityQueue<Integer> left;

    // Min Heap -> stores larger half
    PriorityQueue<Integer> right;

    public MedianFinder() {

        // Max Heap
        left = new PriorityQueue<>(Collections.reverseOrder());

        // Min Heap
        right = new PriorityQueue<>();
    }

    public void addNum(int num) {

        // Add to appropriate heap
        if (left.isEmpty() || num <= left.peek()) {
            left.offer(num);
        } else {
            right.offer(num);
        }

        // Balance heaps
        if (left.size() > right.size() + 1) {

            right.offer(left.poll());

        } else if (right.size() > left.size()) {

            left.offer(right.poll());
        }
    }

    public double findMedian() {

        // Even number of elements
        if (left.size() == right.size()) {

            return (left.peek() + right.peek()) / 2.0;
        }

        // Odd number of elements
        return left.peek();
    }
}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */