/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzador;
import ebanisteria.Ebanisteria;
import Mueble.Mueble;
import Mueble.Mesa;
import Mueble.Estanteria;
import Mueble.MesaOficina;
import Mueble.MesaTaller;
/**
 *
 * @author david
 */
public class Inicio {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ebanisteria MaderasJuan = new Ebanisteria("Maderas Juan", "CalleNueva, 4", "C55661133", "MaderasJuan@gmail.com");
        Estanteria Estanteria1 = new Estanteria(45,2,25,2);
        Estanteria Estanteria2 = new Estanteria(45,2,25,4);
        MesaOficina MesaOficina1 = new MesaOficina (50, 70, 45, true, "Roble");
        MesaTaller MesaTaller1 = new MesaTaller (50, 70, 45, true, 6);
        
    }
}
