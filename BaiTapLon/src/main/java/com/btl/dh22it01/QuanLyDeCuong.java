package com.btl.dh22it01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuanLyDeCuong {

    private List<DeCuong> DS = new ArrayList<>();

    public QuanLyDeCuong() {

    }

    public void themDeCuong(DeCuong deCuong) {
        this.DS.add(deCuong);
    }

    public void themDeCuong(DeCuong... deCuong) {
        this.DS.addAll(Arrays.asList(deCuong));
    }

    public void hienThi() {

        this.DS.forEach(d -> d.hienThiDeCuong());
    }

    public List<DeCuong> getDS() {
        return DS;
    }

    public void setDS(List<DeCuong> dS) {
        DS = dS;
    }
}
