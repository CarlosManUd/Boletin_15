package boletin_15;
import personal.Personal;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin_15 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personal Andrés = new Personal("986444345","Andresiño@gmail.es");
        Academica NotAnd = new Academica(7170, "Andrés", 19, Andrés);
        NotAnd.setNota(8);
        System.out.println(NotAnd.toString());
    }
    
}