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
public class DeCuongLienThong extends DeCuong {

    private List<DeCuong> deCuongList2 = new ArrayList<>(1);

    public DeCuongLienThong(MonHoc monHoc, String mucTieu, String chuanDauRa, String noiDung, GiangVien giangVien) {
        super(monHoc, mucTieu, chuanDauRa, noiDung, giangVien);
    }

    public DeCuongLienThong(MonHoc monHoc) {
        super(monHoc);
    }
    
    public DeCuongLienThong(){
        
    }

    @Override
	public void khoiTaoDeCuong() {		
            System.out.printf("KHOI TAO DE CUONG MON %s HE LIEN THONG\n",this.monHoc.getTenMonHoc());
            super.khoiTaoDeCuong();		
	}

    @Override
    public void suaNoiDung() {       
        super.suaNoiDung(); 
        System.out.printf("DA SUA NOI DUNG DE CUONG MON %s HE LIEN THONG\n", this.monHoc.getTenMonHoc());
    }    
    
    @Override
    public void nhapCotDiem(CotDiem cotDiem) {
        super.nhapCotDiem(cotDiem);
        System.out.printf("DA THEM COT DIEM DE CUONG MON %s HE LIEN THONG\n", this.monHoc.getTenMonHoc());
    }
    
    @Override
    public void xoaCotDiem() {
        super.xoaCotDiem();
    }
        
    @Override
    public void hienThiDeCuong() {
        System.out.println("DE CUONG LIEN THONG");
        this.monHoc.hienThiMonHoc();
        this.thongTinDeCuong();
        this.hienThiDsCotDiem();

        System.out.println("An ENTER de tiep tuc! ");
        CauHinh.SC.nextLine();
    }

    /**
     * @return the deCuongList2
     */
    public List<DeCuong> getDeCuongList2() {
        return deCuongList2;
    }

    /**
     * @param deCuongList2 the deCuongList2 to set
     */
    public void setDeCuongList2(List<DeCuong> deCuongList2) {
        this.deCuongList2 = deCuongList2;
    }
}
