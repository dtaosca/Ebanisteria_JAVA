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
public class MesaTaller extends Mesa{
    //Atributos de la clase MesaOficina
    private int resistencia;
    
    //Constructor de la clase MesaOficina
    public MesaTaller(int ancho, int alto, int profundo, boolean cajonera, int resistencia){
        super(ancho,alto,profundo,cajonera);
        this.resistencia = resistencia;
    }
    
    //Métodos de la clase MesaOficina
    public int getResistencia(){
        return this.resistencia;
    }
    
    public void setResistencia(int resistencia){
        this.resistencia = resistencia;
    }
}
