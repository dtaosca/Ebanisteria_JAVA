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
public class MesaOficina extends Mesa{
    //Atributos de la clase MesaOficina
    private String material;
    
    //Constructor de la clase MesaOficina
    public MesaOficina(int ancho, int alto, int profundo, boolean cajonera, String material){
        super(ancho,alto,profundo,cajonera);
        this.material = material;
    }
    
    //Métodos de la clase MesaOficina
    public String getMaterial(){
        return this.material;
    }
    
    public void setMaterial(String material){
        this.material = material;
    }
}
