/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pablo
 */
public class Revolver {
    private Integer pasAct;
    private Integer posAgua;

    public Revolver() {
    }

    public Integer getPasAct() {
        return pasAct;
    }

    public void setPasAct(Integer pasAct) {
        this.pasAct = pasAct;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "Arma{" + "pasAct=" + pasAct + ", posH2o=" + posAgua + '}';
    }
    
    
    
}
