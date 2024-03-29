// MINUTES TO YEARS AND DAYS CALCULATOR EXERCISE 10
//
// Write a method printYearsAndDays with parameter of type long named minutes.
//
// The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
//
// If the parameter is less than 0, print text "Invalid Value".
//
// Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
//
// XX represents the original value minutes.
// YY represents the calculated years.
// ZZ represents the calculated days.
//
//EXAMPLES OF INPUT/OUTPUT:
    // printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
    // printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
    // printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"

public class Main {
    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0 ) System.out.println("Invalid Value");

        long minutesPerYear = 365 * 24 * 60;
        long minutesPerDay = 24 * 60;

        long numYears = minutes / minutesPerYear;
        long numDays = (minutes % minutesPerYear) / minutesPerDay;

        System.out.println(minutes + " min = " + numYears + " y and " + numDays + " d");

    }
    
}
