// SECONDS AND MINUTES CHALLENGE
//
// Creat two methods with the same name: getDurationString
    // First method has one parameter of type int, named seconds
    // Second method has two parameters, named minutes and seconds, both ints
    // Both methods return a string as 'XXh YYm ZZs'
//
// The first method should in turn call the second method to return its result


public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(560, 60)); // Please enter a number between 0 and 59 seconds.
        System.out.println(getDurationString(300, 30)); // 5h0m30s
        System.out.println(getDurationString(600, 32)); // 10h0m32s

    }

    public static String getDurationString(int totalSeconds) {

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        return hours + "h" + minutes + "m" + seconds + "s";

    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes >= 0 && seconds >= 0 && seconds <=59 ) {
            int totalSeconds =  (minutes * 60) + seconds;
            return getDurationString(totalSeconds);
        } else {
            return "Please enter a number between 0 and 59 seconds.";
        }

    }
}
