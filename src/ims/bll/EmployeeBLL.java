/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.Database;
import ims.dal.EmployeeDAL;
import ims.dto.Chuyennganh;
import ims.dto.City;
import ims.dto.Dantoc;
import ims.dto.Employees;
import ims.dto.Giadinh;
import ims.dto.Gioitinh;
import ims.dto.Honnhan;
import ims.dto.Khoadaotao;
import ims.dto.Nghenghiep;
import ims.dto.Noidaotao;
import ims.dto.Quoctich;
import ims.dto.Tongiao;
import ims.dto.Trinhdodt;
import ims.dto.Xeploai;
import java.util.ArrayList;

/**
 *
 * @author phong lan
 */
public class EmployeeBLL extends Database{
    EmployeeDAL dal = new EmployeeDAL(); ;
    
    public ArrayList<Employees>readEmployee(){
        ArrayList<Employees>  list =  new ArrayList<Employees>();
        list = dal.readEmployee();
        return list ;
    }
    public void  addNewEmployee(Employees em){
        dal.addNewEmployee(em);  
    }
    
    public void deleteEmployee(String manv){ 
        dal.deleteEmployee(manv);
    }     
//    public ArrayList<City> readCity(){
//        ArrayList<City>  list =  new ArrayList<City>();
//        list = dal.readCity();
//        return list;
//    }
    
//    public ArrayList<Dantoc> readDantoc(){
//        ArrayList<Dantoc>  list =  new ArrayList<Dantoc>();
//        list = dal.readDantoc();
//        return list;
//    }
//    
//    public ArrayList<Honnhan> readHonnhan(){
//        ArrayList<Honnhan>  list =  new ArrayList<Honnhan>();
//        list = dal.readHonnhan();
//        return list;
//    }
//    
//    public ArrayList<Giadinh> readGiadinh(){
//        ArrayList<Giadinh>  list =  new ArrayList<Giadinh>();
//        list = dal.readGiadinh();
//        return list;
//    }
//    
//    public ArrayList<Quoctich> readQuoctich(){
//        ArrayList<Quoctich>  list =  new ArrayList<Quoctich>();
//        list = dal.readQuoctich();
//        return list;
//    }
//    
//    public ArrayList<Tongiao> readTongiao(){
//        ArrayList<Tongiao>  list =  new ArrayList<Tongiao>();
//        list = dal.readTongiao();
//        return list;
//    }
//    
//    public ArrayList<Trinhdodt> readTrinhdo(){
//        ArrayList<Trinhdodt>  list =  new ArrayList<Trinhdodt>();
//        list = dal.readTrinhdodt();
//        return list;
//    }
//    
//    public ArrayList<Noidaotao> readNoidaotao(){
//        ArrayList<Noidaotao>  list =  new ArrayList<Noidaotao>();
//        list = dal.readNoidaotao();
//        return list;
//    }
//    
//    public ArrayList<Khoadaotao> readKhoadaotao(){
//        ArrayList<Khoadaotao>  list =  new ArrayList<Khoadaotao>();
//        list = dal.readKhoadaotao();
//        return list;
//    }
//    
//    public ArrayList<Chuyennganh> readChuyennganh(){
//        ArrayList<Chuyennganh>  list =  new ArrayList<Chuyennganh>();
//        list = dal.readChuyennganh();
//        return list;
//    }
//    
//    public ArrayList<Xeploai> readXeploai(){
//        ArrayList<Xeploai>  list =  new ArrayList<Xeploai>();
//        list = dal.readXeploai();
//        return list;
//    }
//    
//    public ArrayList<Nghenghiep> readNghenghiep(){
//        ArrayList<Nghenghiep>  list =  new ArrayList<Nghenghiep>();
//        list = dal.readNghenghiep();
//        return list;
//    }
//    
//    public ArrayList<Gioitinh> readGioitinh(){
//        ArrayList<Gioitinh>  list =  new ArrayList<Gioitinh>();
//        list = dal.readGioitinh();
//        return list;
//    }
//    
//    public Gioitinh getGioitinh(String gioitinh) {
//         Gioitinh gt = new Gioitinh();
//         gt = dal.getSex(gioitinh);
//         return gt;
//    }
    
//    public Honnhan getTinhtranghn(String tinhtrang) {
//         Honnhan hn = new Honnhan();
//         hn = dal.getTinhtranghn(tinhtrang);
//         return hn;
//    }
//    
//    public Giadinh getThanhphangd(String giadinh) {
//         Giadinh gd = new Giadinh();
//         gd = dal.getThanhphangd(giadinh);
//         return gd;
//    }
//    
//    public Dantoc getDantoc(String dantoc) {
//         Dantoc dt = new Dantoc();
//         dt = dal.getDantoc(dantoc);
//         return dt;
//    }
//    
//    public Tongiao getTongiao(String tongiao) {
//         Tongiao tg = new Tongiao();
//         tg = dal.getTongiao(tongiao);
//         return tg;
//    }
//    
//    public Quoctich getQuoctich(String quoctich) {
//         Quoctich qt = new Quoctich();
//         qt = dal.getQuoctich(quoctich);
//         return qt;
//    }
//    
//    public Trinhdodt getTrinhdodt(String trinhdo) {
//         Trinhdodt td = new Trinhdodt();
//         td = dal.getTrinhdodt(trinhdo);
//         return td;
//    }
//    
//    public Noidaotao getNoidaotao(String noidaotao) {
//         Noidaotao ndt = new Noidaotao();
//         ndt = dal.getNoidaotao(noidaotao);
//         return ndt;
//    }
//    
//    public Khoadaotao getKhoadaotao(String khoadaotao) {
//         Khoadaotao kdt = new Khoadaotao();
//         kdt = dal.getKhoa(khoadaotao);
//         return kdt;
//    }
//    
//    public Chuyennganh getChuyennganh(String chuyennganh) {
//         Chuyennganh cn = new Chuyennganh();
//         cn = dal.getChuyennganh(chuyennganh);
//         return cn;
//    }
//    
//    public Xeploai getXeploai(String xeploai) {
//         Xeploai xl = new Xeploai();
//         xl = dal.getXeploai(xeploai);
//         return xl;
//    }
//    
//    public Nghenghiep getNghenghiep(String nghenghiep) {
//         Nghenghiep nn = new Nghenghiep();
//         nn = dal.getNghenghiep(nghenghiep);
//         return nn;
//    }
//    
//    public City getCity(String city) {
//        City tp = new City();
//        tp=dal.getCity(city);
//        return tp;
//    }
    
}
