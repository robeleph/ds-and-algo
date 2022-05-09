public class MostWordsFound {
    public int mostWordsFound(String[] sentences) {
        int num = 0;
        int result = 0;
        for (int i = 0; i < sentences.length; i++){
            for(int j = 0; j < sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    num++;
                }
            }
            result = Math.max(num, result);
            num = 0;
        }
        return result + 1;
    }
}
