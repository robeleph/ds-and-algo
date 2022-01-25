import java.util.ArrayList; // import the ArrayList class
public class MaxWordsToType {
    public int canBeTypedWords(String text, String brokenLetters) {
        ArrayList<String> list = new ArrayList<String>();
        String word = "";
        int result = 0;
        boolean checker = false;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                list.add(word);
                word = "";
            }else{
                word += text.charAt(i);
            }
        }
        list.add(word);
        if(brokenLetters.length() == 0)
            return list.size();
        for(String element : list){
            for(int k = 0; k < brokenLetters.length(); k++){
                if(element.indexOf(brokenLetters.charAt(k)) != -1){
                    checker = true;
                    break;
                }else{
                    checker = false;
                }
            }
            if(!checker){
                result++;
                checker = true;
            }
        }
        return result;
    }
}
