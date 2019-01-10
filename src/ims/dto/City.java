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
public class City {
    private String matp;
    private String tentp;

    public City() {
    }

    public City(String matp, String tentp) {
        this.matp = matp;
        this.tentp = tentp;
    }

    public String getMatp() {
        return matp;
    }

    public void setMatp(String matp) {
        this.matp = matp;
    }

    public String getTentp() {
        return tentp;
    }

    public void setTentp(String tentp) {
        this.tentp = tentp;
    }
    
}
