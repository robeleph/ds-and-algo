class MedianFinder {

    /** initialize your data structure here. */
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    
    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a,b) -> b - a);
        minHeap = new PriorityQueue<>((a,b) -> a - b);
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || num <= maxHeap.peek()){
            maxHeap.add(num);
        }else{
            minHeap.add(num);
        }
        if(maxHeap.size() > minHeap.size() + 1){
            minHeap.add(maxHeap.poll());
        }else if (minHeap.size() > maxHeap.size()){
            maxHeap.add(minHeap.poll());
        }
        
    }
    
    public double findMedian() {
        if(maxHeap.size() == minHeap.size()){
            return maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
        }else{
            return maxHeap.peek();
        }
        
    }
}
