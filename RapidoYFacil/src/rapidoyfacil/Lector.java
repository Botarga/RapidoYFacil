package rapidoyfacil;

import java.io.*;
import java.util.*;
/**
 *
 * @author botarga
 */
public class Lector {
    public static Personaje leerPersonaje(String path){
        Personaje p = null;
        List<Habilidad> habilidades = new ArrayList<>();
        List<Arma> armas = new ArrayList<>();
        List<Item> items = new ArrayList<>();
        String linea;
        String data[];
        String nombre;
        String arquetipo;
        String ocupacion;
        int experiencia;
        int nivel;
        String historia = null;

        int fuerza;
        int resistencia;
        int destreza;
        int inteligencia;
        int percepcion;
        
        try(BufferedReader bf = new BufferedReader (new FileReader(path))){
            nombre = bf.readLine();
            arquetipo = bf.readLine();
            ocupacion = bf.readLine();
            experiencia = Integer.parseInt(bf.readLine());
            nivel = Integer.parseInt(bf.readLine());
            linea = bf.readLine();
            
            if(linea.compareTo("<") != 0){
                System.out.println("Error en formato de personaje");
                return p;
            }
            do{
                linea = bf.readLine();
                if (linea.compareTo(">") != 0)
                    historia = historia + bf.readLine();
            }while(linea.compareTo(">") != 0);
            
            if((linea = bf.readLine()).compareTo("<") != 0){
                System.out.println("Error en formato de personaje");
                return p;
            }
            fuerza = Integer.parseInt(bf.readLine());
            resistencia = Integer.parseInt(bf.readLine());
            destreza = Integer.parseInt(bf.readLine());
            inteligencia = Integer.parseInt(bf.readLine());
            percepcion = Integer.parseInt(bf.readLine());
            
            //Hablidades
            do{
                linea = bf.readLine();
                if(linea.compareTo(">") != 0){
                    data = linea.split(";");
                    habilidades.add(new Habilidad(data[0], data[1]
                        , Integer.parseInt(data[2])));
                }
            }while(linea.compareTo(">") != 0);
            
            //Armas
            do{
                linea = bf.readLine();
                if(linea.compareTo(">") != 0){
                    data = linea.split(";");
                    armas.add(new Arma(data[0], new Habilidad(data[1]
                        , data[2], Integer.parseInt(data[3])), new Habilidad(data[4]
                            , data[5], Integer.parseInt(data[6]))));
                }
            }while(linea.compareTo(">") != 0);
            
            //Equipo
            do{
                linea = bf.readLine();
                if(linea.compareTo(">") != 0){
                    data = linea.split(";");
                    items.add(new Item(data[0], Integer.parseInt(data[1])));
                }
            }while(linea.compareTo(">") != 0);
            
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return p;
    }
}
