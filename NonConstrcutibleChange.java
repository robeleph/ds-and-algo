import java.util.*;

class NonConstrcutibleChange {

  public int nonConstructibleChange(int[] coins) {
		Arrays.sort(coins);
		int currentChangeCreated = 0;
		for(int coin : coins){
			if(coin > currentChangeCreated + 1){
				return currentChangeCreated + 1;
			}
			currentChangeCreated += coin;
		}
    return currentChangeCreated + 1;
  }
}
