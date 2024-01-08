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
    
    public void hienThiDSTenDeCuong(){
        this.DS.forEach(d->System.out.println(d));
    }
    
    public List<DeCuong> getDS() {
        return DS;
    }
    
    public void xapXepDSDeCuong(){
        this.DS.sort((s1,s2)->{
            if(s1.getMonHoc().getSoTinChi()>s2.getMonHoc().getSoTinChi())
                return -1;
            else if(s1.getMonHoc().getSoTinChi()<s2.getMonHoc().getSoTinChi())
                return 1;
            else{
                return s1.getMonHoc().getMaMonHoc().compareTo(s2.getMonHoc().getMaMonHoc());
            }              
        });        
    }

    public void setDS(List<DeCuong> dS) {
        DS = dS;
    }
}
