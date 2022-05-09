class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int h = height[0];
        int w = height.length - 1;
        int area = 0;
        
        int j = height.length - 1;
        int i = 0; 
        System.out.println(w + " - " + j);
        while(i < w && j > 0){
            if (height[i] < height[j]) {
                int cval = height[i] * Math.abs(j - i);
                area = area < cval ? cval : area;
                i++;
            } else{
                int cval = height[j] * Math.abs(j - i);
                area = area < cval ? cval : area;
                j--;
            }
        }
        return area;
    }
}
