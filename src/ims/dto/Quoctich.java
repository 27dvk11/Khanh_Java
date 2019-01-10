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
public class Quoctich {
    private String maqtich;
    private String quoctich;

    public Quoctich() {
    }

    public Quoctich(String maqtich, String quoctich) {
        this.maqtich = maqtich;
        this.quoctich = quoctich;
    }

    public String getMaqtich() {
        return maqtich;
    }

    public void setMaqtich(String maqtich) {
        this.maqtich = maqtich;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }
    
}
