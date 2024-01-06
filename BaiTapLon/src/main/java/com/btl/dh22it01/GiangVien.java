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
    private int maGiangVien;
    private String tenGiangVien;
    
    private List<DeCuong> deCuongList = new ArrayList<>(5);

    public GiangVien(int maGiangVien, String tenGiangVien) {
        this.maGiangVien = maGiangVien;
        this.tenGiangVien = tenGiangVien;
    }
    
    public GiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }
    
  
    /**
     * @return the maGiangVien
     */
    public int getMaGiangVien() {
        return maGiangVien;
    }

    /**
     * @param maGiangVien the maGiangVien to set
     */
    public void setMaGiangVien(int maGiangVien) {
        this.maGiangVien = maGiangVien;
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
     * @return the deCuongList
     */
    public List<DeCuong> getDeCuongList() {
        return deCuongList;
    }

    /**
     * @param deCuongList the deCuongList to set
     */
    public void setDeCuongList(List<DeCuong> deCuongList) {
        this.deCuongList = deCuongList;
    }
}
