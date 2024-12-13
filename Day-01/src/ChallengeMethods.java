public class ChallengeMethods {
    public static void main(String[] args){
        int playerScore;
        String playerName;

        int playerPosition = calculateHighScorePosition( playerScore = 1500 );
        displayHighScorePosition(playerName = "Toch Ratana", playerPosition);

        playerPosition = calculateHighScorePosition( playerScore = 100 );
        displayHighScorePosition(playerName = "Percy", playerPosition);

        playerPosition = calculateHighScorePosition( playerScore = 500 );
        displayHighScorePosition(playerName = "Gilbert", playerPosition);


        playerPosition = calculateHighScorePosition( playerScore = 100 );
        displayHighScorePosition(playerName = "James", playerPosition);
    }
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " +  playerPosition+  " on the height score " +
                "list ");

    }

    public static int calculateHighScorePosition(int playerScore){
        int result;
        if(playerScore >= 1000){
            result = 1;
        } else if (playerScore >= 500) {
            result = 2;
        } else if (playerScore >= 100) {
            result = 3;
        }else {
            result = 4;
        }
        return result;

    }
}
