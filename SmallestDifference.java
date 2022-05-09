import java.util.*;

class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    int num1 = 0; 
		int num2 = 0;
		int min = Integer.MAX_VALUE;
		if(arrayOne.length >= arrayTwo.length){
			for(int i = 0; i < arrayOne.length; i++){
				for(int j = 0; j < arrayTwo.length; j++){
					if(i != j && absoluteDifference(arrayOne[i], arrayTwo[j]) < min){
						min = absoluteDifference(arrayOne[i], arrayTwo[j]);
						num1 = arrayOne[i];
						num2 = arrayTwo[j];
					}
				}
			}
		}else{
			for(int i = 0; i < arrayTwo.length; i++){
				for(int j = 0; j < arrayOne.length; j++){
					if(i != j && absoluteDifference(arrayTwo[i], arrayOne[j]) < min){
						min = absoluteDifference(arrayTwo[i], arrayOne[j]);
						num1 = arrayOne[j];
						num2 = arrayTwo[i];
					}
				}
			}
		}
    return new int[] {num1, num2};
  }
	public static int absoluteDifference(int num1, int num2){
		if(num1 > num2){
			return num1 - num2;
		}else{
			return num2 - num1;
		}
	}
}
