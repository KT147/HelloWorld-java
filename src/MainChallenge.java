public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        //System.out.println(highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        //System.out.println(calculateScore(gameOver, score, levelCompleted, bonus));

        int highScorePosition = caluclateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = caluclateHighScorePosition(1000);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = caluclateHighScorePosition(500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = caluclateHighScorePosition(100);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = caluclateHighScorePosition(25);
        displayHighScorePosition("Tim", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;

        }
        return finalScore;
    }


    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score list");
    }

    public static int caluclateHighScorePosition(int score) {
        int result = 4;
        if (score >= 1000) {
            result = 1;
        } else if (score >= 500) {
            result = 2;
        } else if (score >= 100) {
            result = 3;
        }
        return result;
    }
}
