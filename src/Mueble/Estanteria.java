/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mueble;

/**
 * Clase que almacena los objetos estantería
 * @author david
 * @version 1.0
 */
public class Estanteria extends Mueble{
    //Atributos de la clase Estantaria
    private int num_baldas;
   /**
    * Constructor de la clase estantería
    * @param ancho Define la anchura
    * @param alto Define la altura
    * @param profundo Define la profundidad
    * @param num_baldas Define el número de baldas
    */
    //Constructor de la clase Estanteria
    public Estanteria (int ancho, int alto, int profundo, int num_baldas){
        super(alto, ancho, profundo);
        this.num_baldas = num_baldas;
    }
    
    /**
     * 
     * @return numero_baldas
     */
    //Métodos de la clase Estanteria
    public int getNBaldas(){
        return this.num_baldas;
    }
    /**
     * 
     * @param num_baldas 
     */
    public void setNBaldas(int num_baldas){
        this.num_baldas = num_baldas;
    }
}
