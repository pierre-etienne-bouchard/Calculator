/**
 * 180712 - Creation
 * Classe effectuant les calculs
 */
package entities;

import calcExceptions.CalculEstInvalide;
import java.util.ArrayList;

/**
 *
 * @author Pierre-Etienne Bouchard
 */
public class Calculateur {


     
    private ArrayList<String> historique = new ArrayList();
    
    
    /**
     * Valide que l'operation est valide.
     * Fait la conversion pour effectuer le calcul
     * Met a jour l'historique
     * @param calcul 
     */
    public void calculer(Calcul calcul) {
        
        
        double opGauche;
        String operateur = "";
        double opDroit;
        
        double resultat = 0.0;
        String strResultat="";
        
        String operation = "";
        
        try{
            
            // confirme que le calcul est valide
            validerCalculEstValide(calcul);
            
            // fait le calcul
            opGauche = Double.valueOf( calcul.getOperandeGauche() );
            opDroit = Double.valueOf( calcul.getOperandeDroit() );
            operateur = calcul.getOperateur();
            
            if(operateur.equalsIgnoreCase("+")){
                resultat = opGauche + opDroit;
            }
            if(operateur.equalsIgnoreCase("-")){
                resultat = opGauche - opDroit;
            }
            if(operateur.equalsIgnoreCase("*")){
                resultat = opGauche * opDroit;
            }
            if(operateur.equalsIgnoreCase("/")){               
                resultat = opGauche / opDroit;
            }
            
            strResultat = String.format("%.6f", resultat);
            
            // On remet le tout en String
            operation = 
                      String.valueOf(opGauche)
                    + " "
                    + operateur
                    + " "
                    + String.valueOf(opDroit)
                    + " = "
                    + strResultat;
            
            // on ajoute l'operation a l'historique
            updateHistorique(operation);
            
        }catch( CalculEstInvalide invalide ){
            
        }
    }
    
    /**
     * Ici, on test a savoir si on fait une division par zero.
     * @param calcul
     * @throws CalculEstInvalide 
     */
    private void validerCalculEstValide(Calcul calcul)  throws CalculEstInvalide{
        
         if( calcul.getOperateur().equalsIgnoreCase("\\")
                 && calcul.getOperandeDroit().equalsIgnoreCase("0") )
             throw new CalculEstInvalide();
    }

    /**
     * Met a jour l'historique et ne garde qu'un nombre fixe
     * d'operation (10)
     * @param operation 
     */
    private void updateHistorique(String operation) {
        
        if(historique.size()>=10)
            historique.remove(0);
            
        historique.add(operation);
        
    }
 

    public ArrayList<String> getHistorique() {
    
        return historique;
    }
    
    public int getSize(){
        return historique.size();
    }
    
}
