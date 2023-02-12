// TRADITIONAL SWITCH CHALLENGE
// WE'LL BE USING THE NATO ALPHABET TO REPLACE A CHARACTER OR LETTER, WITH NATO'S STANDARDIZED WORD FOR THAT LETTER

public class Main {
    public static void main(String[] args) {

        char charValue = 'C';

        switch (charValue) {
            case 'A':
                System.out.println(charValue + " is Able");
                break;
            case 'B':
                System.out.println(charValue + " is Baker");
                break;
            case 'C':
                System.out.println(charValue + " is Charlie");
                break;
            case 'D':
                System.out.println(charValue + " is Dog");
                break;
            case 'E':
                System.out.println(charValue + " is Easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found in the switch statement");
                break;
        }

    }

}
