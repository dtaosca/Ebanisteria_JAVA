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
public class Mesa extends Mueble{
    //Atributos de la clase Mesa
    private boolean cajonera;
    
    //Constructor de la clase Mesa
    public Mesa (int ancho, int alto, int profundo, boolean cajonera){
        super(ancho, alto, profundo);
        this.cajonera = cajonera;
    }
    
    //Métodos de la clase Mesa
    public boolean getCajonera(){
        return this.cajonera;
    }
    
    public void setCajonera(boolean cajonera){
        this.cajonera = cajonera;
    }
}
