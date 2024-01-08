/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.dh22it01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tinylove
 */
public class QuanLyGiangVien {
    private List<GiangVien> ds;

    public QuanLyGiangVien() {
        this.ds= new ArrayList<>();
    }
    
    
    public void them(GiangVien giangVien){
        this.ds.add(giangVien);
    }
    
    public void them(GiangVien ...giangVien){
        this.ds.addAll(Arrays.asList(giangVien));
    }
    
    public GiangVien timKiem(String maGiangVien){
        return this.ds.stream().filter(p->p.getMaGiangVien().equalsIgnoreCase(maGiangVien)).findFirst().orElse(null);
    }
    
    public void nhapThongTinGiangVienTuFile() throws FileNotFoundException{
        
        File f = new File("src\\main\\resources\\DSGiangVien.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        try {
            String duLieu=br.readLine();
            String []mangDuLieu=duLieu.split(",");
            for(int i=0;i<mangDuLieu.length;i++){
                this.them(new GiangVien(mangDuLieu[i]));
                
            }
            
        }catch (Exception e) {
            e.printStackTrace();
        }
        

    }
    /**
     * @return the ds
     */
    public List<GiangVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<GiangVien> ds) {
        this.ds = ds;
    }

    
    
    
    
}
