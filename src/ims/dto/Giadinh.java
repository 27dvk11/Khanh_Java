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
public class Giadinh {
    private String maloaitp;
    private String tenloaitp;

    public Giadinh() {
    }

    public Giadinh(String maloaitp, String tenloaitp) {
        this.maloaitp = maloaitp;
        this.tenloaitp = tenloaitp;
    }

    public String getMaloaitp() {
        return maloaitp;
    }

    public void setMaloaitp(String maloaitp) {
        this.maloaitp = maloaitp;
    }

    public String getTenloaitp() {
        return tenloaitp;
    }

    public void setTenloaitp(String tenloaitp) {
        this.tenloaitp = tenloaitp;
    }
    
}
