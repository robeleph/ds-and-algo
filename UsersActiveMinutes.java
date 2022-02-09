class UsersActiveMinutes {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, HashSet<Integer>> map = new HashMap();
        int[] solution = new int[k];
        for(int i = 0; i < logs.length; i++){
            int currentUser = logs[i][0];
            if(!map.containsKey(currentUser)){
                HashSet<Integer> set = new HashSet<Integer>();
                set.add(logs[i][1]);
                map.put(currentUser, set);
            }else{
                HashSet currentSet = map.get(currentUser);
                currentSet.add(logs[i][1]);
            }
        }
        for(int i: map.keySet()) {
            solution[map.get(i).size()-1]++;
        }
        return solution;
    }
}
