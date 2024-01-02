/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.dh22it01;

/**
 *
 * @author NGUYEN
 */
public class CotDiem {

    private String phuongPhapDanhGia;
    private String noiDungDanhGia;
    private int tyLe;

    public CotDiem() {

    }

    public CotDiem(String phuongPhapDanhGia, String noiDungDanhGia, int tyLe) {
        this.phuongPhapDanhGia = phuongPhapDanhGia;
        this.noiDungDanhGia = noiDungDanhGia;
        this.tyLe = tyLe;
    }

    public void nhap1CotDiem() {
        System.out.print("Phuong phap danh gia: ");
        this.phuongPhapDanhGia = CauHinh.SC.nextLine();
        
        System.out.print("Noi dung danh gia: ");
        this.noiDungDanhGia = CauHinh.SC.nextLine();
        System.out.print("Ty le: ");
        this.tyLe = Integer.parseInt(CauHinh.SC.nextLine());
    }

    public void hienThiCotDiem() {
        System.out.printf("Phuong phap danh gia: %s\n", this.phuongPhapDanhGia);
        System.out.printf("Noi dung danh gia: %s\n", this.noiDungDanhGia);
        System.out.printf("Ty le: %d\n", this.tyLe);
        System.out.println("--------------------");
    }

    /**
     * @return the phuongPhapDanhGia
     */
    public String getPhuongPhapDanhGia() {
        return phuongPhapDanhGia;
    }

    /**
     * @param phuongPhapDanhGia the phuongPhapDanhGia to set
     */
    public void setPhuongPhapDanhGia(String phuongPhapDanhGia) {
        this.phuongPhapDanhGia = phuongPhapDanhGia;
    }

    /**
     * @return the noiDungDanhGia
     */
    public String getNoiDungDanhGia() {
        return noiDungDanhGia;
    }

    /**
     * @param noiDungDanhGia the noiDungDanhGia to set
     */
    public void setNoiDungDanhGia(String noiDungDanhGia) {
        this.noiDungDanhGia = noiDungDanhGia;
    }

    /**
     * @return the tyLe
     */
    public int getTyLe() {
        return tyLe;
    }

    /**
     * @param tyLe the tyLe to set
     */
    public void setTyLe(int tyLe) {
        this.tyLe = tyLe;
    }

}
