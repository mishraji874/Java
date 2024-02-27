public class Methods {
    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        //Challenge one
        int highScorePositon = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePositon);
        highScorePositon = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePositon);
        highScorePositon = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePositon);
        highScorePositon = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePositon);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;
    }

    //Challenge
    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + "managed to get into position " + position + " on the high score table.");
    }
    public static int calculateHighScorePosition(int score) {
        if(score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}