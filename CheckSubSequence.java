import java.util.*;

class CheckSubSequence {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int arrayIdx = 0;
		int sequenceIdx = 0;
		while(arrayIdx < array.size() && sequenceIdx < sequence.size()){
			if(array.get(arrayIdx).equals(sequence.get(sequenceIdx))){
				sequenceIdx++;
			}
			arrayIdx++;
		}
    return sequenceIdx == sequence.size();
  }
}
