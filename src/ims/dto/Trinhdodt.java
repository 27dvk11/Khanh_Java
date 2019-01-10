/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dto;

/**
 *
 * @author phong lan
 */
public class Trinhdodt {
    private String matd;
    private String tentd;

    public Trinhdodt() {
    }

    public Trinhdodt(String matd, String tentd) {
        this.matd = matd;
        this.tentd = tentd;
    }

    public String getMatd() {
        return matd;
    }

    public void setMatd(String matd) {
        this.matd = matd;
    }

    public String getTentd() {
        return tentd;
    }

    public void setTentd(String tentd) {
        this.tentd = tentd;
    }
    
}
