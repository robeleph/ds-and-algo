class ReverseStringII {
public String reverseStr(String s, int k) {
    
    char[] charArr = s.toCharArray();
    helper(charArr,0,k);
    
    return new String(charArr);
        
  }
  
  private void helper(char[] arr, int start, int k){
    if(start >= arr.length) return;
    // if less than 2K charactes left end is string end
    int windowEnd = Math.min(start+2*k-1, arr.length-1);
    
    // if less than k characters left reverseEnd = windowEnd
    int reverseEnd = Math.min(start+k-1,windowEnd);
    reverse(arr,start,reverseEnd);
    
    helper(arr, windowEnd+1,k);
    
  }
  
  private void reverse(char[] arr, int start, int end){
    while(start<end){
      char temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}
