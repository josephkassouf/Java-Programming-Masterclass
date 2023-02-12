import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Movie adventure = new Adventure("The Transporter");
//        adventure.watchMovie();
//
//        Movie comedy = new Comedy("Step Brothers");
//        comedy.watchMovie();
//
//        Movie scienceFiction = new ScienceFiction("The Orville");
//        scienceFiction.watchMovie();
//        Movie theMovie = Movie.getMovie("Adventure", "The Transporter");
//        theMovie.watchMovie();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (A for Adventure, C for Comedy, S for Science Fiction, or Q to quit");
            String type = scanner.nextLine();
            if ("Qq".contains(type)) break;
            System.out.println("Enter Movie Title: ");
            String title = scanner.nextLine();
        }
    }

}
