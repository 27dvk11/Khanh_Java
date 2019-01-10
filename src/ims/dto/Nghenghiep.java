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
public class Nghenghiep {
    private String manghe;
    private String tennghe;

    public Nghenghiep() {
    }

    public Nghenghiep(String manghe, String tennghe) {
        this.manghe = manghe;
        this.tennghe = tennghe;
    }

    public String getManghe() {
        return manghe;
    }

    public void setManghe(String manghe) {
        this.manghe = manghe;
    }

    public String getTennghe() {
        return tennghe;
    }

    public void setTennghe(String tennghe) {
        this.tennghe = tennghe;
    }
    
}
