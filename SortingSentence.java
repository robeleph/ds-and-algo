class SortingSentence {
    public String sortSentence(String s) {
        String array[] = s.split(" ");
        String result[] = new String[array.length];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < array.length; i++){
            int len = array[i].length();
            int position = Character.getNumericValue(array[i].charAt(len - 1));
            result[position-1] = array[i].substring(0, len-1);
        }
        
        for(String str: result){
            sb.append(str+" ");
        }
        return sb.toString().substring(0, sb.length()-1);
    }
}
