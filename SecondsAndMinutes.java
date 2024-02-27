public class SecondsAndMinutes {
    public static String getDuratioString(long minutes, long seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid Value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
    public static String getDuratonString(long seconds) {
        if(seconds < 0) {
            return "Invalid Value";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDuratioString(minutes, remainingSeconds);
    }
    public static void main(String[] args) {
        System.out.println(getDuratioString(65, 45));
        System.out.println(getDuratonString(3945L));
    }
}
