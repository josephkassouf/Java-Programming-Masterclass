public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        ((Movie) comedy).watchMovie();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchMovie();

        Object unknwownObject = Movie.getMovie("S", "Step Brothers");
        if (unknwownObject.getClass().getSimpleName().equals("Comedy")) {
            Comedy c = (Comedy) unknwownObject;
            c.watchComedy();
        } else if (unknwownObject instanceof Adventure) {
            ((Adventure) unknwownObject).watchAdventure();
        } else if (unknwownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
