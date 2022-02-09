class GroupThePeople {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> solution = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        
        for(int i = 0; i < groupSizes.length; i++){
            int num = groupSizes[i];
            if(map.containsKey(num)){
               if(num > map.get(num).size()){
                    map.get(num).add(i);
               }else{
                    solution.add(map.get(num));
                    map.remove(num);
                    List<Integer> newList = new LinkedList<>();
                    newList.add(i);
                    map.put(num, newList);
               }
            }else{
                List<Integer> tempList = new LinkedList<>();
                tempList.add(i);
                map.put(num, tempList);                
            }
            
        }
        for(int j : map.keySet()){
            solution.add(map.get(j));
        }
        return solution;
    }
}
