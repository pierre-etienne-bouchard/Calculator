/**
 * 180712 - Creation
 * Classe d'erreur en cas de calcul invalide 
 */
package calcExceptions;

/**
 *
 * @author Pierre-Etienne Bouchard
 */
public class CalculEstInvalide extends Exception{
    public CalculEstInvalide(){
        System.err.println("Le calcul ne peut etre fait car invalide");
    }
}
