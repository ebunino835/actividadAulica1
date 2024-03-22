package com.mycompany.barajadecartas;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Castro Maria Victoria
 */
public class Baraja {
    private List <Carta> cartas; 
    private List <Carta> monton;
    private int contadorCartasAgregadas;

    public Baraja() {
        cartas = new ArrayList<>();
        String[] palo = {"COPA","ESPADA","ORO","BASTO"};
        
        for (String palos : palo){
            for (int i = 1 ; i <= 12 ; i++){
                if (i != 8 && i != 9){
                    cartas.add(new Carta(i , palos));
                }
                
            }
           
        }   
    }
    
    public void barajar(){

    }
    public Carta siguienteCarta(){
        
        return null;
        
    }   
        
    public void cartasDisponibles(){
        //return int
    }
    public void darCartas(){
        //return int
    }
    public void cartasMonton(){
        
    }
    public void mostrarBaraja(){
        for (Carta cartitas: cartas){
            System.out.println(cartitas);
        }
    }    
}