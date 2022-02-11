import java.util.*;

class TournamentWinner {

    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int winnerIdx = 0;
        int maxPoint = Integer.MIN_VALUE;
        String finalWinner = "";
        for(int i = 0; i < competitions.size(); i++){
            if(results.get(i) == 0){
                winnerIdx = 1;
            }else{
                winnerIdx = 0;
            }
            String winner = competitions.get(i).get(winnerIdx);
            if(map.containsKey(winner)){
                map.put(winner, map.get(winner) + 3);
            }else{
                map.put(winner, 3);
            }
        }
        for(String str : map.keySet()){
            if(map.get(str) > maxPoint){
                maxPoint = map.get(str);
                finalWinner = str;
            }
        }
        return finalWinner;
    }
}
