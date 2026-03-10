public class TimeConvertChallange {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(61, 60));
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;
        int convertedMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
        return hours + " hour(s) " + convertedMinutes + " minute(s) " + remainingSeconds + " second(s)";

    }
}
