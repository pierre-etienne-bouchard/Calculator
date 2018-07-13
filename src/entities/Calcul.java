/**
 * 180712 - Creation
 * Classe decrivant les proprietes d'un calcul
 */
package entities;

/**
 *
 * @author Pierre-Etienne Bouchard
 */
public class Calcul {

    private String operandeGauche="";
    private String operandeDroit="";
    private String operateur="";
    public boolean hasOperandeGauche;
    public boolean hasOperandeDroit;
    public boolean hasOperateur;
    
    public Calcul() {
    }
    
    public Calcul(String operandeGauche, String operandeDroit, String operateur) {
        this.operandeGauche = operandeGauche;
        this.operandeDroit = operandeDroit;
        this.operateur = operateur;
    }
 

    public String getOperandeGauche() {
        return operandeGauche;
    }

    public void setOperandeGauche(String operandeGauche) {
        this.operandeGauche = operandeGauche;
    }

    public String getOperandeDroit() {
        return operandeDroit;
    }

    public void setOperandeDroit(String operandeDroit) {
        this.operandeDroit = operandeDroit;
    }

    public String getOperateur() {
        return operateur;
    }

    public void setOperateur(String operateur) {
        this.operateur = operateur;
    }
    
    public String affichage(){
        return getOperandeGauche()
                + " " +getOperateur()
                + " " +getOperandeDroit();
    }

    /*
     * Efface les valeurs
     */
    public void clear() {
        this.setOperandeGauche("");
        this.setOperandeDroit("");
        this.setOperateur("");
        
    }

    /**
     * Ajoute le nombre en parametre a l'operande en
     * cours de construction
     * @param operande 
     */
    public void ajouterOperande(String operande) {
        
        String tmpOperande = "";
        // si l'operateur n'est pas initialise,
        if(this.getOperateur()==""){
            // on modifie l'operande de gauche.
            tmpOperande = this.getOperandeGauche()+operande;
            this.setOperandeGauche(tmpOperande);
        }else{
            // sinon, on modifie l'operande de droite.
            tmpOperande = this.getOperandeDroit()+operande;
            this.setOperandeDroit(tmpOperande);
        }
            
    }

    /**
     * Met a jour l'operateur si il y a un operande (de gauche)
     * @param string 
     */
    public void ajouterOperateur(String operateur) {
        
        if(this.getOperandeGauche() != "")
            this.setOperateur(operateur);
    }

    /**
     * 
     * @return Vrais si l'operande gauche est initialise, faux sinon
     */
    public boolean hasOperandeGauche() {
        
        if(this.getOperandeGauche()!="") 
            this.hasOperandeGauche = true;
        else
            this.hasOperandeGauche = false;
        
        return this.hasOperandeGauche;
    }

    /**
     * 
     * @return Vrais si l'operateur est initialise, faux sinon
     */
    public boolean hasOperateur() {
        
        if(this.getOperandeGauche()!="") 
            this.hasOperandeGauche = true;
        else
            this.hasOperandeGauche = false;
        
        return this.hasOperandeGauche;
    }

    /**
     * 
     * @return Vrais si l'operande droit est initialise, faux sinon
     */
    public boolean hasOperandeDroit() {
        
        if(this.getOperandeDroit()!="") 
            this.hasOperandeDroit = true;
        else
            this.hasOperandeDroit = false;
        
        return this.hasOperandeDroit;
    }
}
