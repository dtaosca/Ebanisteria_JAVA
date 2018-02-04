/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebanisteria;

/**
 *
 * @author david
 */
public class Ebanisteria {
    //Atrbutos de la clase Ebanisteria
    private String nombre;
    private String direccion;
    private String CIF;
    private String email;
    
    //Constructor de la clase Ebanisteria
    public Ebanisteria(String nombre, String direccion, String CIF, String email){
        this.nombre = nombre;
        this.direccion = direccion;
        this.CIF = CIF;
        this.email = email;
    }
    
    //Métodos de la clase Ebanisteria
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getCIF(){
        return this.CIF;
    }
    
    public void setCIF(String CIF){
        this.CIF = CIF;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void SetEmail(String email){
        this.email = email;
    }
}
