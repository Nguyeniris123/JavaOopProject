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

    public DeCuongChinhQuy(MonHoc monHoc, String mucTieu, String chuanDauRa, String noiDung, String giangVien) {
        super(monHoc, mucTieu, chuanDauRa, noiDung, giangVien);
    }

    public DeCuongChinhQuy(MonHoc monHoc) {
        this.monHoc = monHoc;
    }

    @Override
    public void taoDeCuong(DeCuong deCuong) {
        if (getDeCuongList1().isEmpty()) {
            System.out.println("Chua co de cuong");
            nhap1DeCuong();
            getDeCuongList1().add(deCuong);
            System.out.println("Da tao de cuong cho mon hoc " + monHoc.getTenMonHoc());
        } else {
            System.out.println("Mon hoc da co de cuong. Khong the tao them");
        }
    }

    @Override
    public void hienThiDeCuong() {
        System.out.println("DE CUONG CHINH QUY");
        this.monHoc.hienThiMonHoc();
        this.thongTinDeCuong();
        this.hienThiDsCotDiem();

        CauHinh.SC.nextLine();
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
