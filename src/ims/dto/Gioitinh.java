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
public class Gioitinh {
    private int magt;
    private String gioitinh;

    public Gioitinh() {
    }

    public Gioitinh(int magt, String gioitinh) {
        this.magt = magt;
        this.gioitinh = gioitinh;
    }

    public int getMagt() {
        return magt;
    }

    public void setMagt(int magt) {
        this.magt = magt;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    
}
