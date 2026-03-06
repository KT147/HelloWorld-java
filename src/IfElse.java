public class IfElse {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("Your score was below 5000");
        } else if (score >= 5000) {
            System.out.println("Your score was 5000 or more");
        } else {
            System.out.println("Your score was not 5000");
        }
    }
}
