class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((n1, n2) -> n2-n1);
        
        for (int i : stones) {
            maxHeap.offer(i);
        }
        
        while (maxHeap.size() > 1) {
            int n1 = maxHeap.poll();
            int n2 = maxHeap.poll();
            
            if (n1 != n2) {
                maxHeap.offer(Math.abs(n1 - n2));
            }
        }
        
        if (maxHeap.isEmpty()) return 0;
        return maxHeap.poll();
    }
}
