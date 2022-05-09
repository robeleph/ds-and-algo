import java.util.*;

class ClassPhotos {

  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    Collections.sort(redShirtHeights, Collections.reverseOrder());
    Collections.sort(blueShirtHeights, Collections.reverseOrder());
		String shirtColorInFirstRow = (redShirtHeights.get(0) < blueShirtHeights.get(0)) ? "RED" : "BLUE";
		
		for(int i = 0; i < redShirtHeights.size(); i++) {
			int firstRed = redShirtHeights.get(i);
			int firstBlue = blueShirtHeights.get(i);
			if(shirtColorInFirstRow == "RED"){
				if(firstRed >= firstBlue) {
					return false;
				}
			}else {
					if(firstRed <= firstBlue) {
						return false;
					}
			}
		}
		return true;
  }
}
