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
    
    public void showInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Arquetipo: " + arquetipo);
        System.out.println("Ocupacion " + ocupacion);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Nivel: " + nivel);
        
        System.out.println("Historia");
        System.out.println(historia);
        
        System.out.println("Atributos:");
        System.out.println("\tFuerza:  " + fuerza);
        System.out.println("\tResistencia: " + resistencia);
        System.out.println("\tDestreza: " + destreza);
        System.out.println("\tIntelifencia: " + inteligencia);
        System.out.println("\tPercepcion: " + percepcion);
        
        System.out.println("Habilidades");
        for(Habilidad h : habilidades)
            System.out.println(h);
        System.out.println("Arma");
        for(Arma a : armas){
            System.out.println(a);
        }
        for(Item i : items){
            System.out.println(i);
        }
    }
}
