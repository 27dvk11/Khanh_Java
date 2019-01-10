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
public class Noidaotao {
    private String madd;
    private String tendd;

    public Noidaotao() {
    }

    public Noidaotao(String madd, String tendd) {
        this.madd = madd;
        this.tendd = tendd;
    }

    public String getMadd() {
        return madd;
    }

    public void setMadd(String madd) {
        this.madd = madd;
    }

    public String getTendd() {
        return tendd;
    }

    public void setTendd(String tendd) {
        this.tendd = tendd;
    }
    
}
