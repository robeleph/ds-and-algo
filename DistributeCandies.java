class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : candyType){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i : map.keySet()){
            count++;
        }
        if(count < candyType.length / 2){
            return count;
        }else if (count == candyType.length / 2){
            return count;
        }else{
            return candyType.length / 2;
        }
    }
}
