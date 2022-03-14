import java.util.*;

class SpecialTraverse {
  public static List<Integer> spiralTraverse(int[][] array) {
    List<Integer> solution = new ArrayList<Integer>();
		
		int startingRow = 0;
		int endingRow = array.length - 1;
		int startingColumn = 0;
		int endingColumn = array[0].length - 1;
		
		while (startingRow <= endingRow && startingColumn <= endingColumn) {
			for (int col = startingRow; col <= endingColumn; col++) {
				solution.add(array[startingRow][col]);
			}
			for (int row = startingRow + 1; row <= endingRow; row++) {
				solution.add(array[row][endingColumn]);
			}
			for (int col = endingColumn - 1; col >= startingColumn; col--) {
				if (startingRow == endingRow) break;
				solution.add(array[endingRow][col]);
			}
			for (int row = endingRow - 1; row > startingRow; row--) {
				if (startingColumn == endingColumn) break;
				solution.add(array[row][startingColumn]);
			}
			startingRow++;
			endingRow--;
			startingColumn++;
			endingColumn--;
		}
    return solution;
  }
}
