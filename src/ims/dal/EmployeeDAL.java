/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import com.mysql.jdbc.PreparedStatement;
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
import ims.gui.Employee;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phong lan
 */
public class EmployeeDAL extends Database{
    Connection conn = null;
    Statement stmt = null;
    Employees em;
    public ArrayList<Employees> readEmployee(){
        ArrayList<Employees> emList = new ArrayList<>();
        conn=  getConnection();
        try{  
            stmt = conn.createStatement();
            String sql = "SELECT manv, hotendem, ten, ngaysinh, noisinh  FROM Nhanvien";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){   
                Employees em = new Employees();
                em.setManv(rs.getString("manv"));
                em.setHo_dem(rs.getString("hotendem"));
                em.setTen(rs.getString("ten"));
                em.setNgaysinh(rs.getString("ngaysinh"));
                em.setNoisinh(rs.getString("noisinh"));
                emList.add(em);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            return emList;
        }    
    }
   
    public ArrayList<Employees> addNewEmployee(Employees em){
        try{
            conn=getConnection();
            stmt = conn.createStatement();  
            String manv = em.getManv();
            String ho_tendem = em.getHo_dem();
            String ten = em.getTen();
            String birthday = em.getNgaysinh();
            String noisinh = em.getNoisinh();
//            int gioitinh = em.getGioitinh();              
//            String macong = em.getManv();
//            String trinhdo = em.getTrinhdo();
//            int namtotnghiep = em.getNamtotnghiep();
//            String nguyenquan = em.getNguyenquan();
//            int cmnd = em.getCmnd();
//            String noicap = em.getNoicap();
//            String ngaycap = em.getNgaycap();
//            String sohochieu = em.getSohochieu();
//            String ngaycaphc = em.getNgaycaphc();
//            String ngayhethanhc = em.getNgayhethanhc();
//            String noicaphc = em.getNoicaphc();
//            String mahn = em.getMahn();
//            String matp = em.getMatp();
//            String macn = em.getMacn();
//            String madt = em.getMadt();
//            String madd = em.getMadd();
//            String maloaitp = em.getMaloaitp();
//            String makhoa = em.getMakhoa();
//            String maloai = em.getMaloai();
//            String manghe = em.getManghe();
//            String maqt = em.getMaqt();
//            String matg = em.getMatg();
//            String matd = em.getMatrinhdo();
            String sql = "INSERT INTO nhanvien (`manv`, `hotendem`, `ten`, `Ngaysinh`, `noisinh`)"
                    + "VALUES('"+manv+"','"+ho_tendem+"','"+ten+"','"+birthday+"','"+noisinh+"')";
            stmt.executeUpdate(sql);
        }catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return null;
    }
    public void deleteEmployee(String manv) {
        try {
            conn=getConnection();
            stmt = conn.createStatement(); 
            String sql = "delete from nhanvien where manv = " + manv;
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
//    public ArrayList<City> readCity(){
//        ArrayList<City> cityList = new ArrayList<>();
//        conn=  getConnection();
//        try{      
//            stmt = conn.createStatement();
//            String sql = "SELECT matp, tentp  FROM thanhpho";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){   
//                City city = new City();
//                city.setMatp(rs.getString("matp"));
//                city.setTentp(rs.getString("tentp"));
//                cityList.add(city);
//            }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally{
//            return cityList;
//        }
//    } 
    
//    public ArrayList<Dantoc> readDantoc(){
//        ArrayList<Dantoc> dantocList = new ArrayList<>();
//        conn=  getConnection();
//        try{           
//            stmt = conn.createStatement();
//            String sql = "SELECT madt, tendt  FROM dantoc";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){   
//                Dantoc dtoc = new Dantoc();
//                dtoc.setMadt(rs.getString("madt"));
//                dtoc.setTendt(rs.getString("tendt"));
//                dantocList.add(dtoc);
//            }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally{
//            return dantocList;
//        }   
//    }
//    
//    public ArrayList<Honnhan> readHonnhan(){
//        ArrayList<Honnhan> honnhanList = new ArrayList<>();
//        conn=  getConnection();
//        try{ 
//            
//            stmt = conn.createStatement();
//            String sql = "SELECT mahn, tinhtrang  FROM honnhan";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){   
//                Honnhan hnhan = new Honnhan();
//                hnhan.setMahn(rs.getString("mahn"));
//                hnhan.setTinhtrang(rs.getString("tinhtrang"));
//                honnhanList.add(hnhan);
//            }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally{
//            return honnhanList;
//        }   
//    }
//    
//    public ArrayList<Giadinh> readGiadinh(){
//        ArrayList<Giadinh> giadinhList = new ArrayList<>();
//        conn=  getConnection();
//        try{ 
//            
//            stmt = conn.createStatement();
//            String sql = "SELECT maloaitp, tenloaitp  FROM giadinh";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){   
//                Giadinh gdinh = new Giadinh();
//                gdinh.setMaloaitp(rs.getString("maloaitp"));
//                gdinh.setTenloaitp(rs.getString("tenloaitp"));
//                giadinhList.add(gdinh);
//            }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally{
//            return giadinhList;
//        }   
//    }
//    
//    public ArrayList<Quoctich> readQuoctich(){
//        ArrayList<Quoctich> quoctichList = new ArrayList<>();
//        conn=  getConnection();
//        try{ 
//            
//            stmt = conn.createStatement();
//            String sql = "SELECT maqt, tenqt  FROM quoctich";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){   
//                Quoctich qtich = new Quoctich();
//                qtich.setMaqtich(rs.getString("maqt"));
//                qtich.setQuoctich(rs.getString("tenqt"));
//                quoctichList.add(qtich);
//            }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally{
//            return quoctichList;
//        }   
//    }
//    
//    public ArrayList<Tongiao> readTongiao(){
//        ArrayList<Tongiao> tongiaoList = new ArrayList<>();
//        conn=  getConnection();
//        try{ 
//            
//            stmt = conn.createStatement();
//            String sql = "SELECT matg, tentg  FROM tongiao";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){   
//                Tongiao tgiao = new Tongiao();
//                tgiao.setMatg(rs.getString("matg"));
//                tgiao.setTentg(rs.getString("tentg"));
//                tongiaoList.add(tgiao);
//            }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally{
//            return tongiaoList;
//        }   
//    }
//    
//    public ArrayList<Trinhdodt> readTrinhdodt(){
//        ArrayList<Trinhdodt> trinhdoList = new ArrayList<>();
//        conn=  getConnection();
//        try{ 
//            
//            stmt = conn.createStatement();
//            String sql = "SELECT matrinhdo, tentrinhdo  FROM trinhdo";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){   
//                Trinhdodt tdo = new Trinhdodt();
//                tdo.setMatd(rs.getString("matrinhdo"));
//                tdo.setTentd(rs.getString("tentrinhdo"));
//                trinhdoList.add(tdo);
//            }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally{
//            return trinhdoList;
//        }   
//    }
//    
//    public ArrayList<Noidaotao> readNoidaotao(){
//        ArrayList<Noidaotao> diadiem = new ArrayList<>();
//        conn=  getConnection();
//        try{ 
//            
//            stmt = conn.createStatement();
//            String sql = "SELECT madd, tendd  FROM diadiemdt";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){   
//                Noidaotao dd = new Noidaotao();
//                dd.setMadd(rs.getString("madd"));
//                dd.setTendd(rs.getString("tendd"));
//                diadiem.add(dd);
//            }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally{
//            return diadiem;
//        }   
//    }
//    
//    public ArrayList<Khoadaotao> readKhoadaotao(){
//        ArrayList<Khoadaotao> khoadt = new ArrayList<>();
//        conn=  getConnection();
//        try{ 
//            
//            stmt = conn.createStatement();
//            String sql = "SELECT makhoa, tenkhoa  FROM khoadt";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){   
//                Khoadaotao khoa = new Khoadaotao();
//                khoa.setMakhoa(rs.getString("makhoa"));
//                khoa.setTenkhoa(rs.getString("tenkhoa"));
//                khoadt.add(khoa);
//            }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally{
//            return khoadt;
//        }   
//    }
//    
//    public ArrayList<Chuyennganh> readChuyennganh(){
//        ArrayList<Chuyennganh> chuyennganh = new ArrayList<>();
//        conn=  getConnection();
//        try{ 
//            
//            stmt = conn.createStatement();
//            String sql = "SELECT macn, tencn  FROM chuyennganh";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){   
//                Chuyennganh cn = new Chuyennganh();
//                cn.setMacn(rs.getString("macn"));
//                cn.setTencn(rs.getString("tencn"));
//                chuyennganh.add(cn);
//            }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally{
//            return chuyennganh;
//        }   
//    }
//    public ArrayList<Xeploai> readXeploai(){
//        ArrayList<Xeploai> xeploai = new ArrayList<>();
//        conn=  getConnection();
//        try{ 
//            
//            stmt = conn.createStatement();
//            String sql = "SELECT maloai, tenloai  FROM xeploai";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){   
//                Xeploai loai = new Xeploai();
//                loai.setMaloai(rs.getString("maloai"));
//                loai.setTenloai(rs.getString("tenloai"));
//                xeploai.add(loai);
//            }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally{
//            return xeploai;
//        }   
//    } 
//    public ArrayList<Nghenghiep> readNghenghiep(){
//        ArrayList<Nghenghiep> nghenghiep = new ArrayList<>();
//        conn=  getConnection();
//        try{ 
//            
//            stmt = conn.createStatement();
//            String sql = "SELECT manghe, tennghe  FROM nghenghiep";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){   
//                Nghenghiep nghe = new Nghenghiep();
//                nghe.setManghe(rs.getString("manghe"));
//                nghe.setTennghe(rs.getString("tennghe"));
//                nghenghiep.add(nghe);
//            }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally{
//            return nghenghiep;
//        }   
//    }
//    public ArrayList<Gioitinh> readGioitinh(){
//        ArrayList<Gioitinh> gtinh = new ArrayList<>();
//        conn=  getConnection();
//        try{ 
//            
//            stmt = conn.createStatement();
//            String sql = "SELECT magioitinh, gioitinh  FROM gioitinh";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){   
//                Gioitinh gt = new Gioitinh();
//                gt.setMagt(rs.getInt("magioitinh"));
//                gt.setGioitinh(rs.getString("gioitinh"));
//                gtinh.add(gt);
//            }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally{
//            return gtinh;
//        }   
//    }     
//    public Gioitinh getSex(String gioitinh) {
//        Gioitinh gt = new Gioitinh();
//        conn = getConnection();
//        try {
//            stmt = conn.createStatement();
//            String sql = "SELECT magioitinh, gioitinh FROM gioitinh WHERE gioitinh = '" + gioitinh + "'";
//            ResultSet rs = null;
//            rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                gt.setMagt(rs.getInt("magioitinh"));
//                gt.setGioitinh(rs.getString("gioitinh"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();           
//        }   finally {
//            return gt;
//        }
//    }  
//    public City getCity(String city){
//        City tp = new City();
//    
//        conn = getConnection();
//        try {
//            stmt = conn.createStatement();
//            String sql = "SELECT matp, tentp FROM thanhpho WHERE tentp = '" + city + "'";
//            ResultSet rs = null;
//            rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                tp.setMatp(rs.getString("matp"));
//                tp.setTentp(rs.getString("tentp"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();           
//        }   finally {
//            return tp;
//        }
//    }
         
    
//    public Honnhan getTinhtranghn(String tinhtrang) {
//        Honnhan hn = new Honnhan();
//        conn = getConnection();
//        try {
//            stmt = conn.createStatement();
//            String sql = "SELECT mahn, tinhtrang FROM honnhan WHERE tinhtrang = '" + tinhtrang + "'";
//            ResultSet rs = null;
//            rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                hn.setMahn(rs.getString("mahn"));
//                hn.setTinhtrang(rs.getString("tinhtrang"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();           
//        }   finally {
//            return hn;
//        }
//    }
        
    
//    public Giadinh getThanhphangd(String thanhphan) {
//        Giadinh gd = new Giadinh();
//        conn = getConnection();
//        try {
//            stmt = conn.createStatement();
//            String sql = "SELECT maloaitp, tenloaitp FROM Giadinh WHERE tenloaitp = '" + thanhphan + "'";
//            ResultSet rs = null;
//            rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                gd.setMaloaitp(rs.getString("maloaitp"));
//                gd.setTenloaitp(rs.getString("tenloaitp"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();           
//        }   finally {
//            return gd;
//        }
//    }
    
//    public Dantoc getDantoc(String dantoc) {
//        Dantoc dt = new Dantoc();
//        conn = getConnection();
//        try {
//            stmt = conn.createStatement();
//            String sql = "SELECT madt, tendt FROM Dantoc WHERE tendt = '" + dantoc + "'";
//            ResultSet rs = null;
//            rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                dt.setMadt(rs.getString("madt"));
//                dt.setTendt(rs.getString("tendt"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();           
//        }   finally {
//            return dt;
//        }
//    }
//    
//    public Tongiao getTongiao(String tongiao) {
//        Tongiao tg = new Tongiao();
//        conn = getConnection();
//        try {
//            stmt = conn.createStatement();
//            String sql = "SELECT matg, tentg FROM Tongiao WHERE tentg = '" + tongiao + "'";
//            ResultSet rs = null;
//            rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                tg.setMatg(rs.getString("matg"));
//                tg.setTentg(rs.getString("tentg"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();           
//        }   finally {
//            return tg;
//        }
//    }
//    
//    public Quoctich getQuoctich(String quoctich) {
//        Quoctich qt = new Quoctich();
//        conn = getConnection();
//        try {
//            stmt = conn.createStatement();
//            String sql = "SELECT maqt, tenqt FROM Quoctich WHERE tenqt = '" + quoctich + "'";
//            ResultSet rs = null;
//            rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                qt.setMaqtich(rs.getString("maqt"));
//                qt.setQuoctich(rs.getString("tenqt"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();           
//        }   finally {
//            return qt;
//        }
//    }
//    
//    public Trinhdodt getTrinhdodt(String trinhdo) {
//        Trinhdodt tddt = new Trinhdodt();
//        conn = getConnection();
//        try {
//            stmt = conn.createStatement();
//            String sql = "SELECT matrinhdo, tentrinhdo FROM Trinhdo WHERE tentrinhdo = '" + trinhdo + "'";
//            ResultSet rs = null;
//            rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                tddt.setMatd(rs.getString("matrinhdo"));
//                tddt.setTentd(rs.getString("tentrinhdo"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();           
//        }   finally {
//            return tddt;
//        }
//    }
//    
//    public Noidaotao getNoidaotao(String ndt) {
//        Noidaotao dd = new Noidaotao();
//        conn = getConnection();
//        try {
//            stmt = conn.createStatement();
//            String sql = "SELECT madd, tendd FROM diadiemdt WHERE tendd = '" + ndt + "'";
//            ResultSet rs = null;
//            rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                dd.setMadd(rs.getString("madd"));
//                dd.setTendd(rs.getString("tendd"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();           
//        }   finally {
//            return dd;
//        }
//    }
//    
//    public Khoadaotao getKhoa(String khoa) {
//        Khoadaotao khoadt = new Khoadaotao();
//        conn = getConnection();
//        try {
//            stmt = conn.createStatement();
//            String sql = "SELECT makhoa, tenkhoa FROM khoadt WHERE tenkhoa = '" + khoa + "'";
//            ResultSet rs = null;
//            rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                khoadt.setMakhoa(rs.getString("makhoa"));
//                khoadt.setTenkhoa(rs.getString("tenkhoa"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();           
//        }   finally {
//            return khoadt;
//        }
//    }
//    
//    public Chuyennganh getChuyennganh(String chuyennganh) {
//        Chuyennganh cnganh = new Chuyennganh();
//        conn = getConnection();
//        try {
//            stmt = conn.createStatement();
//            String sql = "SELECT macn, tencn FROM chuyennganh WHERE tencn = '" + chuyennganh + "'";
//            ResultSet rs = null;
//            rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                cnganh.setMacn(rs.getString("macn"));
//                cnganh.setTencn(rs.getString("tencn"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();           
//        }   finally {
//            return cnganh;
//        }
//    }
//    
//    public Xeploai getXeploai(String xeploai) {
//        Xeploai xloai = new Xeploai();
//        conn = getConnection();
//        try {
//            stmt = conn.createStatement();
//            String sql = "SELECT maloai, tenloai FROM xeploai WHERE tenloai = '" + xeploai + "'";
//            ResultSet rs = null;
//            rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                xloai.setMaloai(rs.getString("maloai"));
//                xloai.setTenloai(rs.getString("tenloai"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();           
//        }   finally {
//            return xloai;
//        }
//    }
//    
//    public Nghenghiep getNghenghiep(String nghenghiep) {
//        Nghenghiep nnghiep = new Nghenghiep();
//        conn = getConnection();
//        try {
//            stmt = conn.createStatement();
//            String sql = "SELECT manghe, tennghe FROM nghenghiep WHERE tennghe = '" + nghenghiep + "'";
//            ResultSet rs = null;
//            rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                nnghiep.setManghe(rs.getString("manghe"));
//                nnghiep.setTennghe(rs.getString("tennghe"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();           
//        }   finally {
//            return nnghiep;
//        }
//    }
    
    
    
    public void editEmployee(String maNV) {
        try {
            conn=getConnection();
            stmt = conn.createStatement(); 
            String macong = em.getManv();
            String ho_tendem = em.getHo_dem();
            String ten = em.getTen();
            String hovaten = em.getTen();
            int gioitinh = em.getGioitinh();
            String birthday = em.getNgaysinh();
            String noisinh = em.getNoisinh();
            String trinhdo = em.getTrinhdo();
            int namtotnghiep = em.getNamtotnghiep();
            String nguyenquan = em.getNguyenquan();
            int cmnd = em.getCmnd();
            String noicap = em.getNoicap();
            String ngaycap = em.getNgaycap();
            String sohochieu = em.getSohochieu();
            String ngaycaphc = em.getNgaycaphc();
            String ngayhethanhc = em.getNgayhethanhc();
            String noicaphc = em.getNoicaphc();
            String mahn = em.getMahn();
            String matp = em.getMatp();
            String macn = em.getMacn();
            String madt = em.getMadt();
            String madd = em.getMadd();
            String maloaitp = em.getMaloaitp();
            String makhoa = em.getMakhoa();
            String maloai = em.getMaloai();
            String manghe = em.getManghe();
            String maqt = em.getMaqt();
            String matg = em.getMatg();
            String matd = em.getMatrinhdo();
            String sql =" `nhanvien` SET `machamcong`='"+macong+"',`hotendem`='"+ho_tendem+"',`ten`=[value-4],`hovaten`=[value-5],`ngaysinh`=[value-6],`magioitinh`=[value-7],`noisinh`=[value-8],`trinhdo`=[value-9],`namtotnghiep`=[value-10],`nguyenquan`=[value-11],`cmnd`=[value-12],`noicap`=[value-13],`ngaycap`=[value-14],`sohochieu`=[value-15],`ngaycaphc`=[value-16],`ngayhethanhc`=[value-17],`noicaphc`=[value-18],`macn`=[value-19],`madt`=[value-20],`madd`=[value-21],`mahn`=[value-22],`makhoa`=[value-23],`manghe`=[value-24],`maqt`=[value-25],`matp`=[value-26],`matg`=[value-27],`matrinhdo`=[value-28],`maloai`=[value-29],`maloaitp`=[value-30] WHERE manv = "+maNV;
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    
    
}
