import java.util.*;

class MinimumWaitingTime {

  public int minimumWaitingTime(int[] queries) {
		Arrays.sort(queries);
		int waitingTime = 0;
		int minWaitingTime = 0;
		int endIndex = 0;
		for(int i = 0; i < queries.length; i++){
			for(int j = 0; j < endIndex; j++){
				if(j != queries.length-1){
					waitingTime += queries[j];
				}
			}
			minWaitingTime += waitingTime;
			waitingTime = 0;
			endIndex++;
		}
    return minWaitingTime;
  }
}
