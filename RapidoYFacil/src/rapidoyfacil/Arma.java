package rapidoyfacil;

/**
 *
 * @author botarga
 */
public class Arma {
    private String nombre;
    private Habilidad bonificadora;
    private Habilidad penalizadora;
    
    
    public Arma (String nombre, Habilidad bonificadora, Habilidad penalizadora){
        this.nombre = nombre;
        this.bonificadora = bonificadora;
        this.penalizadora = penalizadora;
    }
    
    @Override
    public String toString(){
        return nombre + "\n\tBonificacion: " + bonificadora + "\n\tPenalización: " 
            + penalizadora; 
    }
}
