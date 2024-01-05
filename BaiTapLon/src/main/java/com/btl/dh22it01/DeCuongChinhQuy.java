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
public class DeCuongChinhQuy extends DeCuong {

    private List<DeCuong> deCuongList1 = new ArrayList<>(1);

    public DeCuongChinhQuy(MonHoc monHoc, String mucTieu, String chuanDauRa, String noiDung, GiangVien giangVien) {
        super(monHoc, mucTieu, chuanDauRa, noiDung, giangVien);
    }

    public DeCuongChinhQuy(MonHoc monHoc) {
        super(monHoc);

    }

    DeCuongChinhQuy() {

    }

    @Override
    public void khoiTaoDeCuong() {
        System.out.printf("KHOI TAO DE CUONG MON %s HE CHINH QUY\n", this.monHoc.getTenMonHoc());
        super.khoiTaoDeCuong();
    }

    @Override
    public void suaNoiDung() {       
        super.suaNoiDung(); 
        System.out.printf("DA SUA NOI DUNG DE CUONG MON %s HE CHINH QUY\n", this.monHoc.getTenMonHoc());
    }

    @Override
    public void nhapCotDiem(CotDiem cotDiem) {
        super.nhapCotDiem(cotDiem);
        System.out.printf("DA THEM COT DIEM DE CUONG MON %s HE CHINH QUY\n", this.monHoc.getTenMonHoc());
    }

    @Override
    public void xoaCotDiem() {
        super.xoaCotDiem();
    }
    
    
    
    @Override
    public void hienThiDeCuong() {
        System.out.println("DE CUONG CHINH QUY");
        this.monHoc.hienThiMonHoc();
        this.thongTinDeCuong();
        this.hienThiDsCotDiem();

        System.out.println("An ENTER de tiep tuc! ");
        CauHinh.SC.nextLine();
    }

    /**
     * @return the deCuongList1
     */
    public List<DeCuong> getDeCuongList1() {
        return deCuongList1;
    }

    /**
     * @param deCuongList1 the deCuongList1 to set
     */
    public void setDeCuongList1(List<DeCuong> deCuongList1) {
        this.deCuongList1 = deCuongList1;
    }
}
