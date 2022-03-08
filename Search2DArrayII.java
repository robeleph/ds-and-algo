class Search2DArrayII {
    public boolean searchMatrix(int[][] m, int t) {
	    int i = 0, j = m[0].length-1;
	    while (i >= 0 && i < m.length && j >= 0 && j < m[0].length) 
		    if (m[i][j] == t) return true;
		    else if (m[i][j] < t) i++;
		    else j--;
	    return false;
    }
}
