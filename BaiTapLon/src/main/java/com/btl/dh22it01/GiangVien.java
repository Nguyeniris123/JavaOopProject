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
public class GiangVien {
    private static int dem;
    private String maGiangVien;
    private String tenGiangVien;
    private QuanLyDeCuong dsDeCuong;
    
    {
        this.setMaGiangVien(String.format("GV%03d", ++dem));
    }

    public GiangVien(String tenGiangVien) {        
        this.tenGiangVien = tenGiangVien;
        this.dsDeCuong= new QuanLyDeCuong();
    }
    
    public GiangVien() {
        
    }
    
    public void nhap1GiangVien() {        
        System.out.print("Ten giang vien: ");
        this.tenGiangVien = CauHinh.SC.nextLine();
    }
    
    public void hienThiGiangVien() {
        System.out.printf("%s - %s\n", this.getMaGiangVien(), this.tenGiangVien);
    }
    
    public void themDeCuong(DeCuong deCuong) {        
            this.dsDeCuong.themDeCuong(deCuong);
    }
    
    public boolean kiemTraGiangVien(DeCuong deCuong){
        if(deCuong==null)
            return false;
        return this.dsDeCuong.getDS().stream().anyMatch(d->d.equals(deCuong));  
    }

    /**
     * @return the tenGiangVien
     */
    public String getTenGiangVien() {
        return tenGiangVien;
    }

    /**
     * @param tenGiangVien the tenGiangVien to set
     */
    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    /**
     * @return the dsDeCuong
     */
    public QuanLyDeCuong getDsDeCuong() {
        return dsDeCuong;
    }

    /**
     * @param dsDeCuong the dsDeCuong to set
     */
    public void setDsDeCuong(QuanLyDeCuong dsDeCuong) {
        this.dsDeCuong = dsDeCuong;
    }

    /**
     * @return the maGiangVien
     */
    public String getMaGiangVien() {
        return maGiangVien;
    }

    /**
     * @param maGiangVien the maGiangVien to set
     */
    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }
}
