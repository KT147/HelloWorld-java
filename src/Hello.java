public class Hello {
    public static void main(String[] args) {

        // System.out.println("Hello, Tim");

        boolean isAlien = true;

        if (!isAlien) {
            System.out.println("It is not an alien");
            System.out.println("I'm scared of aliens");
        }

        int topScore = 800;

        if (topScore >= 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;

        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false: true;

        if (isDomestic) {
            System.out.println("This car is domestic in our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double sumOfFirstTwo = (firstValue + secondValue) * 100.00d;
        System.out.println(sumOfFirstTwo);
        double reminderSum = sumOfFirstTwo % 40.00d;
        System.out.println(reminderSum);
        boolean isZero = (reminderSum == 0.00) ? true : false;

        System.out.println(isZero);

        if (!isZero) {
            System.out.println("Got some reminder");
        }
    }
}
