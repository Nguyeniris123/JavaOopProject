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
import java.util.stream.Collectors;

/**
 *
 * @author NGUYEN
 */
public class QuanLiMonHoc {

    private List<MonHoc> mh = new ArrayList<>();

    public void themMonHoc(MonHoc... a) {
        this.getMh().addAll(Arrays.asList(a));
    }

    public void hienThiDsMonHoc() {
        this.mh.forEach(h -> h.hienThiMonHoc());
    }

    public List<MonHoc> timKiem(String kw) {
        return this.mh.stream().filter(h -> h.getMaMonHoc().equals(kw) || h.getTenMonHoc().contains(kw)).collect(Collectors.toList());
    }

    public List<MonHoc> hienThiDsMonHocTruoc(String id) {
        return this.mh.stream().filter(h -> h.getMaMonHoc().equals(id)).findFirst().get().getMonHocTruoc();
    }

    public List<MonHoc> hienThiDsMonHocTienQuyet(String id) {
        return this.mh.stream().filter(h -> h.getMaMonHoc().equals(id)).findFirst().get().getMonHocTienQuyet();
    }

    public void docDsMonHoc() throws FileNotFoundException {
        File f = new File("C:\\Users\\NGUYEN\\JavaOopProject\\BaiTapLon\\src\\main\\resources\\monhoc");
        BufferedReader br = new BufferedReader(new FileReader(f));
        try {
            while (true) {
                String duLieu = br.readLine();
                if (duLieu == null) {
                    break;
                }
                String[] mangDuLieu = duLieu.split(", ");
                MonHoc khoiTao = new MonHoc();
                khoiTao.setTenMonHoc(mangDuLieu[0]);
                khoiTao.setMoTaMonHoc(mangDuLieu[1]);
                khoiTao.setSoTinChi(Integer.parseInt(mangDuLieu[2]));
                int KKT = Integer.parseInt(mangDuLieu[3]);
                if (KKT == 1) {
                    khoiTao.setKhoiKienThuc(KhoiKienThuc.Co_So);
                } else if (KKT == 2) {
                    khoiTao.setKhoiKienThuc(KhoiKienThuc.Co_So_Nganh);
                } else {
                    khoiTao.setKhoiKienThuc(KhoiKienThuc.Chuyen_Nganh);
                }
               
                this.themMonHoc(khoiTao);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return the mh
     */
    public List<MonHoc> getMh() {
        return mh;
    }

    /**
     * @param mh the mh to set
     */
    public void setMh(List<MonHoc> mh) {
        this.mh = mh;
    }
}
