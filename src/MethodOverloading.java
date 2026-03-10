public class MethodOverloading {
    public static void main(String[] args) {
       // System.out.println("New score is " +  calculateScore("Tim", 500));
        //System.out.println("New score is " +  calculateScore(10));
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5, 8));
    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore (int score) {
        return calculateScore("Anonymous", score);
    }

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int remainderInInches ) {
        int inches = (heightInFeet * 12) + remainderInInches;
        return convertToCentimeters(inches);
    }



}
