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
public abstract class DeCuong {
    protected MonHoc monHoc;
    protected String mucTieu;
    protected String chuanDauRa;
    protected String noiDung;
    protected String giangVien;

    protected List<CotDiem> CotDiemList = new ArrayList<>(4);

    public DeCuong(MonHoc monHoc, String mucTieu, String chuanDauRa, String noiDung,
            String giangVien) {
        this.monHoc = monHoc;
        this.mucTieu = mucTieu;
        this.chuanDauRa = chuanDauRa;
        this.noiDung = noiDung;
        this.giangVien = giangVien;
    }

    public DeCuong() {

    }

    public void nhap1DeCuong() {
        System.out.print("Muc tieu: ");
        this.mucTieu = CauHinh.SC.nextLine();
        
        System.out.print("Chuan dau ra: ");
        this.chuanDauRa = CauHinh.SC.nextLine();
        System.out.print("Noi dung: ");
        this.noiDung = CauHinh.SC.nextLine();
        System.out.print("Giang vien: ");
        this.giangVien = CauHinh.SC.nextLine();  
        int n;        
        do {
            System.out.print("Nhap so cot Diem: ");
            n = Integer.parseInt(CauHinh.SC.nextLine());
            if (n>4) 
                System.out.println("Khong hop le. Nhap lai");
        } while (n>4);
        for (int i =1;i<=n;i++) {
            System.out.println("COT DIEM THU " + i);
            this.nhapCotDiem(new CotDiem());
        }
    }

    public void nhapCotDiem(CotDiem cotDiem) {
        if (this.CotDiemList.size() <= 4) {
            cotDiem.nhap1CotDiem();
            this.CotDiemList.add(cotDiem);
        }
    }

    public void hienThiDsCotDiem() {
        this.CotDiemList.forEach(h -> h.hienThiCotDiem());
    }
    
    public void thongTinDeCuong() {
        System.out.printf("Muc tieu: %s\n", this.mucTieu);
        System.out.printf("Chuan dau ra: %s\n", this.chuanDauRa);
        System.out.printf("Noi dung: %s\n", this.noiDung);
        System.out.printf("Giang vien: %s\n", this.giangVien);
    }

    public abstract void taoDeCuong(DeCuong deCuong);
    public abstract void hienThiDeCuong();

    /**
     * @return the monHoc
     */
    public MonHoc getMonHoc() {
        return monHoc;
    }

    /**
     * @param monHoc the monHoc to set
     */
    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }

    /**
     * @return the mucTieu
     */
    public String getMucTieu() {
        return mucTieu;
    }

    /**
     * @param mucTieu the mucTieu to set
     */
    public void setMucTieu(String mucTieu) {
        this.mucTieu = mucTieu;
    }

    /**
     * @return the chuanDauRa
     */
    public String getChuanDauRa() {
        return chuanDauRa;
    }

    /**
     * @param chuanDauRa the chuanDauRa to set
     */
    public void setChuanDauRa(String chuanDauRa) {
        this.chuanDauRa = chuanDauRa;
    }

    /**
     * @return the noiDung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung the noiDung to set
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * @return the giangVien
     */
    public String getGiangVien() {
        return giangVien;
    }

    /**
     * @param giangVien the giangVien to set
     */
    public void setGiangVien(String giangVien) {
        this.giangVien = giangVien;
    }

    /**
     * @return the CotDiemList
     */
    public List<CotDiem> getCotDiemList() {
        return CotDiemList;
    }

    /**
     * @param CotDiemList the CotDiemList to set
     */
    public void setCotDiemList(List<CotDiem> CotDiemList) {
        this.CotDiemList = CotDiemList;
    }

    /**
     * @return the cotDiem
     */
}
