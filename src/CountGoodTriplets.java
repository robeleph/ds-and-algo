class CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int i = 0;
        int j = i + 1,
                k = j + 1;

        while(i < arr.length && j < arr.length && k < arr.length){
            if(Math.abs(arr[i] - arr[j]) <= a &&
                    Math.abs(arr[j] - arr[k]) <= b &&
                    Math.abs(arr[i] - arr[k]) <= c){
                count++;
            }
            if(k < arr.length){
                k++;
            }
            if(k == arr.length){
                j++;
                k = j + 1;
            }
            if(j+1 == arr.length){
                i++;
                j = i + 1;
                k = j + 1;
            }
        }
        return count;
    }
}
