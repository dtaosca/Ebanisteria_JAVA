/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mueble;

/**
 *
 * @author david
 */
public class Mueble {
    //Atributos de la clase mueble
    private int ancho;
    private int alto;
    private int profundo;
    
    //Constructor de la clase Mueble
    public Mueble(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    //Métodos de la clase Mueble
    public int getAncho(){
        return this.ancho;
    }
    
    public void setAncho(int ancho){
        this.ancho = ancho;
    }
    
    public int getAlto(){
        return this.alto;
    }
    
    public void setAlto (int alto){
        this.alto = alto;
    }
    
    public int getProfundo(){
        return this.profundo;
    }
    
    public void setProfundo(int profundo){
        this.profundo = profundo;
    }
}
