class KWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] == b[0] ? a[1]-b[1] : a[0] - b[0]);
        int[] result = new int[k];
        
        int index = 0;
        for (int[] row : mat){
            int sum = 0;
            for (int cell : row){
                if(cell == 1) sum += cell;
                else break;
            }
            pq.offer(new int[]{sum, index});
            index+=1;
        }
        
        int i = 0;
        while (i < k){
            result[i++] = pq.poll()[1];
        }
        
        return result;
    }
}
