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
public class Honnhan {
    private String mahn;
    private String tinhtrang;

    public String getMahn() {
        return mahn;
    }

    public Honnhan() {
    }

    public void setMahn(String mahn) {
        this.mahn = mahn;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public Honnhan(String mahn, String tinhtrang) {
        this.mahn = mahn;
        this.tinhtrang = tinhtrang;
    }
    
}
