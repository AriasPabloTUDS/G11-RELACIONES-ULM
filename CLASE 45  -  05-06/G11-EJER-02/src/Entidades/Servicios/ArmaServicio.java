/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Arma;

/**
 *
 * @author Pablo
 */
public class ArmaServicio {
    
    private Arma revolver;
    
  

    public ArmaServicio() {
        revolver  = new Arma();
    }
    
    
    public void llenarRevolver(){
        Integer posran1 = (int) (Math.random() * 6 + 1);
        Integer posran2 = (int) (Math.random() * 6 + 1);
        
        System.out.println("pa "+posran1);
        System.out.println("ph2o "+posran2);
        
        revolver.setPasAct(posran1);
        revolver.setPosH2o(posran2);
        
    }
    
    public Boolean mojar(){
        Boolean mojar;
        if (revolver.getPasAct().equals(revolver.getPosH2o())) {
            mojar = true;
        } else mojar = false;
        
        return mojar;
    }
    
    public void mostrarPosiciones(){
        System.out.println("pa "+revolver.getPasAct());
        System.out.println("ph2o "+revolver.getPosH2o());
        
    }
    
    public void siguienteChorro(){
        if (revolver.getPasAct()==6) {
            revolver.setPasAct(1);
        }else
            revolver.setPasAct(revolver.getPasAct()+1);
        
    }
    
    
    
}
