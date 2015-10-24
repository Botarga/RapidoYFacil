package rapidoyfacil;

import java.util.*;

/**
 *
 * @author botarga
 */
public class Personaje {
    private String nombre;
    private String arquetipo;
    private String ocupacion;
    private int experiencia;
    private int nivel;
    
    private String historia;
    
    private int fuerza;
    private int resistencia;
    private int destreza;
    private int inteligencia;
    private int percepcion;
    
    List<Habilidad> habilidades;
    List<Arma> armas;
    List<Item> items;
    
    public Personaje(String nombre, String arquetipo, String ocupacion
            , int experiencia, int nivel, String historia, int fuerza
            , int resistencia, int destreza, int inteligencia, int percepcion
            , List<Habilidad> habilidades, List<Arma> armas, List<Item> items){
        this.nombre = nombre;
        this.arquetipo = arquetipo;
        this.ocupacion = ocupacion;
        this.experiencia = experiencia;
        this.nivel = nivel;
        this.historia = historia;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.percepcion = percepcion;
        this.habilidades = habilidades;
        this.armas = armas;
        this.items = items;
    }
}
