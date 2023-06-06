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
public class Arma {
    private Integer pasAct;
    private Integer posH2o;

    public Arma() {
    }

    public Integer getPasAct() {
        return pasAct;
    }

    public void setPasAct(Integer pasAct) {
        this.pasAct = pasAct;
    }

    public Integer getPosH2o() {
        return posH2o;
    }

    public void setPosH2o(Integer posH2o) {
        this.posH2o = posH2o;
    }

    @Override
    public String toString() {
        return "Arma{" + "pasAct=" + pasAct + ", posH2o=" + posH2o + '}';
    }
    
    
    
}
