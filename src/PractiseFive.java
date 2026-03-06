public class PractiseFive {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.245,3.145));
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int num1 = (int) (firstNumber * 1000);
        int num2 = (int) (secondNumber * 1000);

        if (num1 == num2 ) {
            return true;
        }
        return false;
    }
}
