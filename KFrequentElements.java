class KFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
          PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new                       Comparator<Map.Entry<Integer, Integer>>(){
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer>                   b){
                return b.getValue() - a.getValue();
            }
        });
        int[] result = new int[k];
        int index = 0;
          for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            pq.offer(entry);
        }
        while(k > 0){
            result[index++] = pq.poll().getKey();
            k--;
        }
        return result;
    }
}
