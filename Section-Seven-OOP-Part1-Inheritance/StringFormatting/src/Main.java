public class Main {
    public static void main(String[] args) {

        String bulletIt = """
                Print a Bulleted List:
                \t\u2022 First Point
                \t\u2022 Second Point""";

        System.out.println(bulletIt);

        int age = 33;
        System.out.printf("Your age is %d", age);

        String formattedString = String.format("\nYour age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }
}
