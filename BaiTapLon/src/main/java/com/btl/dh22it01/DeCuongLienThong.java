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
    
    
    public DeCuongLienThong(MonHoc monHoc, String mucTieu, String chuanDauRa, String noiDung, String giangVien) {
        super(monHoc, mucTieu, chuanDauRa, noiDung, giangVien);
    }

    public DeCuongLienThong(MonHoc monHoc) {
        this.monHoc = monHoc;
    }
    
    
    
    @Override
    public void taoDeCuong(DeCuong deCuong) {
            if (getDeCuongList2().isEmpty()) {
                System.out.println("Chua co de cuong");
                nhap1DeCuong();
                getDeCuongList2().add(deCuong);
                System.out.println("Da tao de cuong cho mon hoc " + monHoc.getTenMonHoc());
            } else {
                System.out.println("Mon hoc da co de cuong. Khong the tao them");
            }          
    }

    @Override
    public void hienThiDeCuong() {
        System.out.println("DE CUONG LIEN THONG");
        this.monHoc.hienThiMonHoc();
        this.thongTinDeCuong();
        this.hienThiDsCotDiem();
        
        CauHinh.SC.nextLine();
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