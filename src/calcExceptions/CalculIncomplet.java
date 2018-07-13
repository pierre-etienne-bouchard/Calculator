/**
 * 180712 - Creation
 * Classe d'erreur en cas de calcul incomplet
 */
package calcExceptions;

/**
 *
 * @author Pierre-Etienne Bouchard
 */
public class CalculIncomplet extends Exception{
    public CalculIncomplet(){
        System.err.println("Le calcul ne peut etre fait car incomplet");
    }
}

