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
    
    public void sapXepDSDeCuong(){
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
    
    public DeCuong traVeDeCuongChinhQuy(){
        return this.DS.stream().filter(p->p instanceof DeCuongChinhQuy).findFirst().orElse(null);
    }

    public DeCuong traVeDeCuongLienThong(){
        return this.DS.stream().filter(p->p instanceof DeCuongLienThong).findFirst().orElse(null);
    }    
    
    public double thongKeSoLuongDeCuongTheoSoTinChi(int soTinChi) {
        return this.DS.stream().filter(deCuong -> deCuong.getMonHoc().getSoTinChi() == soTinChi).count();
    }
    
    public void setDS(List<DeCuong> dS) {
        DS = dS;
    }
}
