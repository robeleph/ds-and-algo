class MinimumIndex {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = Integer.MAX_VALUE;
        ArrayList<String> arlist = new ArrayList<>();
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }
        
        for(int j = 0; j < list2.length; j++){
            if(map.containsKey(list2[j])){
                if((map.get(list2[j]) + j) < count){
                    count = map.get(list2[j]) + j;
                    arlist.clear();
                    arlist.add(list2[j]);
                }if((map.get(list2[j]) + j) == count){
                    arlist.add(list2[j]);
                    count = map.get(list2[j]) + j;
                }
            }
        }
        arlist.remove(0);
        String[] result = new String[arlist.size()];
        for(int k = 0; k < arlist.size(); k++){
            result[k] = arlist.get(k);
        }

        return result;
        
    }
}
