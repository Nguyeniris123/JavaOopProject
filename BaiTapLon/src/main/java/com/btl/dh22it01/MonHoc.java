/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.dh22it01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NGUYEN
 */
public class MonHoc {

    private static int dem;
    private String maMonHoc;
    private String tenMonHoc;
    private String moTaMonHoc;
    private int soTinChi;
    private KhoiKienThuc khoiKienThuc;
    {
        this.maMonHoc=String.format("DH%03d", ++dem);
    }
    

    private List<MonHoc> monHocTruoc = new ArrayList<>(3);
    private List<MonHoc> monHocTienQuyet = new ArrayList<>(3);

    public MonHoc( String tenMonHoc, String moTaMonHoc, int soTinChi, KhoiKienThuc khoiKienThuc) {
        this.tenMonHoc = tenMonHoc;
        this.moTaMonHoc = moTaMonHoc;
        this.soTinChi = soTinChi;
        this.khoiKienThuc = khoiKienThuc;
    }
    
    public MonHoc() {
        
    }

    public MonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public void themMonHocTruoc(MonHoc monHoc) {
        if (this.monHocTruoc.size() <= 3) {
            this.monHocTruoc.add(monHoc);
        }
    }

    public void themMonHocTienQuyet(MonHoc monHoc) {
        if (this.monHocTienQuyet.size() <= 3) {
            this.monHocTienQuyet.add(monHoc);
        }
    }

    public void hienThiMonHoc() {
        System.out.printf("Ma mon hoc: %s\n", this.maMonHoc);
        System.out.printf("Ten mon hoc: %s\n", this.tenMonHoc);
        System.out.printf("Mo ta mon hoc: %s\n", this.moTaMonHoc);
        System.out.printf("So tin chi: %d\n", this.soTinChi);
        System.out.printf("Khoi kien thuc: %s\n", this.khoiKienThuc);
        System.out.printf("Danh sach mon hoc truoc: %s\n", this.monHocTruoc);
        System.out.printf("Danh sach mon hoc tien quyet: %s\n", this.monHocTienQuyet);
        System.out.println("-------------");
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the tenMonHoc
     */
    public String getTenMonHoc() {
        return tenMonHoc;
    }

    /**
     * @param tenMonHoc the tenMonHoc to set
     */
    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    /**
     * @return the moTaMonHoc
     */
    public String getMoTaMonHoc() {
        return moTaMonHoc;
    }

    /**
     * @param moTaMonHoc the moTaMonHoc to set
     */
    public void setMoTaMonHoc(String moTaMonHoc) {
        this.moTaMonHoc = moTaMonHoc;
    }

    /**
     * @return the soTinChi
     */
    public int getSoTinChi() {
        return soTinChi;
    }

    /**
     * @param soTinChi the soTinChi to set
     */
    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    /**
     * @return the khoiKienThuc
     */
    public KhoiKienThuc getKhoiKienThuc() {
        return khoiKienThuc;
    }

    /**
     * @param KKT
     */
    public void setKhoiKienThuc( KhoiKienThuc KKT) {
        this.khoiKienThuc = KKT;
    }

    /**
     * @return the monHocTruoc
     */
    public List<MonHoc> getMonHocTruoc() {
        return monHocTruoc;
    }

    /**
     * @param monHocTruoc the monHocTruoc to set
     */
    public void setMonHocTruoc(List<MonHoc> monHocTruoc) {
        this.monHocTruoc = monHocTruoc;
    }

    /**
     * @return the monHocTienQuyet
     */
    public List<MonHoc> getMonHocTienQuyet() {
        return monHocTienQuyet;
    }

    /**
     * @param monHocTienQuyet the monHocTienQuyet to set
     */
    public void setMonHocTienQuyet(List<MonHoc> monHocTienQuyet) {
        this.monHocTienQuyet = monHocTienQuyet;
    }

    /**
     * @return the maMonHoc
     */
    public String getMaMonHoc() {
        return maMonHoc;
    }

    /**
     * @param maMonHoc the maMonHoc to set
     */
    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

}
