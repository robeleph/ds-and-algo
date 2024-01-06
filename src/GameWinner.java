public class GameWinner {
    public static String predictWinner (String input) {
        char currentPlayer = 'w';
        String finalResult = "";

        while (true) {
            char playerToMove = (currentPlayer == 'w') ? 'b' : 'w';

            String updatedColors = makeMove(playerToMove, input);

            if (updatedColors.equals(input)) {
                if (currentPlayer == 'w') {
                    finalResult = "w";
                    break;
                } else {
                    finalResult = "b";
                    break;
                }
            }

            currentPlayer = (currentPlayer == 'w') ? 'b' : 'w';
        }

        return finalResult;
    }

    public static String makeMove (char playerToMove, String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentColor = input.charAt(i);
            char prevNeighbor = (i > 0) ? input.charAt(i - 1) : '-';
            char nextNeighbor = (i < input.length() - 1) ? input.charAt(i + 1) : '-';

            if (currentColor == playerToMove) {
                if (prevNeighbor == playerToMove && nextNeighbor == playerToMove) {
                    continue;
                }
            } else {
                if (prevNeighbor == playerToMove && nextNeighbor == playerToMove) {
                    continue;
                }
            }
            result.append(currentColor);
        }
        return result.toString();
    }
}
