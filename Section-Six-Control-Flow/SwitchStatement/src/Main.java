// VALID SWITCH VALUE TYPES -> BYTE, SHORT, INT, CHAR, STRING, ENUM
// IMPORTANT -> CANNOT USE LONG, FLOAT, DOUBLE OR BOOLEAN OR THEIR WRAPPERS
//
// FALL THROUGH IN SWITCH STATEMENTS
    // ONCE A SWITCH CASE LABEL MATCHES THE SWITCH VARIABLE, NO MORE CASES CHECKED
    // ANY CODE AFTER THE CASE LABEL WHERE THERE WAS A MATCH FOUND, WILL BE EXECUTED UNTIL A BREAK STATEMENT, OR THE END OF THE SWITCH STATEMENT OCCURS
    // WITHOUT BREAK STATEMENT, EXECUTION WILL CONTINUE. ENHANCED SWITCH STATEMENT IS NOT NECESSARY.


public class Main {
    public static void main(String[] args) {

        System.out.println(getQuarters("January"));
        System.out.println(getQuarters("May"));
        System.out.println(getQuarters("August"));
        System.out.println(getQuarters("November"));

//        int value = 1;
//
//        // ENHANCED SWITCH Statement
//        switch (value) {
//
//            case 1 -> System.out.println("Value was 1");
//            case 2 -> System.out.println("Value was 2");
//            case 3, 4, 5 -> {
//                System.out.println("Was a 3, 4, 5");
//                System.out.println("Actually it was a " + value);
//            }
//            default -> System.out.println("Value was not 1, 2, 3, 4, or 5");
//
//        }

        //TRADITIONAL SWITCH STATEMENT
//        switch (value) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//            case 3: case 4: case 5:
//                System.out.println("Was a 3, 4, 5");
//                System.out.println("Actually it was a " + value);
//                break;
//            default:
//                System.out.println("Value was not 1, 2, 3, 4, or 5");
//                break;
//        }

        // IF-ELSE Statement
//        if (value == 1) System.out.println("Value was 1");
//        else if (value == 2) System.out.println("Value was 2");
//        else System.out.println("Value was not 1 or 2");

    }

    public static String getQuarters(String month) {

        switch (month) {
            case "January", "February", "March" -> {
                return "First Quarter";
            }
            case "April", "May", "June" -> {
                return "Second Quarter";
            }
            case "July", "August", "September" -> {
                return "Third Quarter";
            }
            case "October", "November", "December" -> {
                return "Fourth Quarter";
            }
            default -> {
                return "Not a month. Please try again";
            }
        }

    }

}
