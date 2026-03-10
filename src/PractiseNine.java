public class PractiseNine {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            System.out.println(hours);
            long days = hours / 24;
            System.out.println(days);
            long years = days / 365;
            long remainingDays = days % years;
            System.out.println(remainingDays);
            System.out.println(years);
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d.");
        }

    }
}
