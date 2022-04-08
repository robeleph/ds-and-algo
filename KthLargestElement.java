class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> n1 - n2);
    final int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i : nums)
            add(i);
    }
    public int add(int val) {
        minHeap.add(val);
        if(minHeap.size() > this.k){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
