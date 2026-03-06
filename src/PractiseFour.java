public class PractiseFour {
    public static void main(String[] args) {
     System.out.println(isLeapYear(2008));
    }

    public static boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
            return false;
        } else if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return true;
    }
}
