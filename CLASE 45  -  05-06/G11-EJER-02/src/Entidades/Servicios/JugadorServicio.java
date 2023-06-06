/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Arma;
import Entidades.Jugador;

/**
 *
 * @author Pablo
 */
public class JugadorServicio {
    
    private ArmaServicio aS;
    private Jugador j;

    public JugadorServicio() {
        aS = new ArmaServicio();
    }
    
    
    public Boolean disparo(Arma r){
        aS.mojar();
        aS.siguienteChorro();
        
        boolean disparo = (aS.mojar()) ;
            
        j.setMojado(!disparo);
        System.out.println("El jugador se mojo? "+disparo);
        return disparo;
    }
    
}
