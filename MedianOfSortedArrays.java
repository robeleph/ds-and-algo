class MedianOfSortedArrays {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
    PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> a - b);
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        for(int i : nums1){
            insertMedian(i);
        }
        for(int i : nums2){
            insertMedian(i);
        }
        return findMedian();
        
    }
    public void insertMedian(int i){
        if(maxHeap.isEmpty() || i <= maxHeap.peek()){
            maxHeap.add(i);
        }else{
            minHeap.add(i);
        }
        if(maxHeap.size() > minHeap.size() + 1){
            minHeap.add(maxHeap.remove());
        }else if(minHeap.size() > maxHeap.size()){
            maxHeap.add(minHeap.remove());
        }
    }
    public double findMedian(){
        if(maxHeap.size() == minHeap.size()){
            double n1 = maxHeap.peek();
            double n2 = minHeap.peek();
            double res = (n1 / 2) + (n2 / 2);
            return res;
        }else{
            return maxHeap.remove();
        }
    }
}
