/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.dh22it01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
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

    public MonHoc timKiem(String kw) {
        return this.mh.stream().filter(h -> h.getMaMonHoc().equals(kw) || h.getTenMonHoc().contains(kw)).findFirst().orElse(null);
    }
    
    public void xoaMonHoc(String ma) {
        this.mh.removeIf(h -> h.getMaMonHoc().equals(ma));
    }

    public MonHoc timKiem(int maMonHoc) {
        String str = Integer.toString(maMonHoc);
        char[] arr = str.toCharArray();
        return this.mh.stream().filter(p -> Character.compare(arr[0], p.getMaMonHoc().toCharArray()[p.getMaMonHoc().length() - 1]) == 0).findFirst().orElse(null);
    }

    public void hienThiDsThongTinMonHoc() {
        this.mh.forEach(h -> h.hienThiMonHoc());
    }

    public void hienThiDSTenMonHoc() {
        this.mh.forEach(
                p -> {
                    if (p == null) {
                        return;
                    }

                    if (p == this.mh.get(this.mh.size() - 1)) {
                        System.out.printf("%s(%s). \n", p.getTenMonHoc(), p.getMaMonHoc());
                    } else {
                        System.out.printf("%s(%s),", p.getTenMonHoc(), p.getMaMonHoc());
                    }
                }
        );
    }

    public void hienThiDSTenMonHoc_1() {
        this.mh.forEach(p -> System.out.printf("%s(%s)\n", p.getTenMonHoc(), p.getMaMonHoc()));

    }

    public void docDsMonHoc() throws FileNotFoundException {
        File f = new File("src\\main\\resources\\DSMonHoc.txt");
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
                switch (KKT) {
                    case 1 ->
                        khoiTao.setKhoiKienThuc(KhoiKienThuc.Co_So);
                    case 2 ->
                        khoiTao.setKhoiKienThuc(KhoiKienThuc.Co_So_Nganh);
                    default ->
                        khoiTao.setKhoiKienThuc(KhoiKienThuc.Chuyen_Nganh);
                }

                this.themMonHoc(khoiTao);
            }
            File f1 = new File("src\\main\\resources\\MonHocKemTheo.txt");
            try {

                BufferedReader br1 = Files.newBufferedReader(f1.toPath(), StandardCharsets.UTF_8);
                while (true) {
                    String duLieu = br1.readLine();
                    if (duLieu == null) {
                        break;
                    }
                    String[] mangDuLieu = duLieu.split(",");
                    MonHoc boSung = this.timKiem(mangDuLieu[0]);

                    for (int i = 1; i <= 3; i++) {
                        if (mangDuLieu[i].equals("0") == false) {
                            boSung.themMonHocTienQuyet(this.timKiem(Integer.parseInt(mangDuLieu[i])));
                        }

                    }
                    for (int i = 4; i <= 6; i++) {
                        if (mangDuLieu[i].equals("0") == false) {
                            boSung.themMonHocTruoc(this.timKiem(Integer.parseInt(mangDuLieu[i])));
                        }
                    }
                }
            } catch (IOException | NumberFormatException e) {
                // TODO: handle exception
            }

        } catch (IOException | NumberFormatException e) {

        }
    }
    
    
    public List<MonHoc> timListMonHocTienQuyet(MonHoc monHoc){
        
        return  this.mh.stream().filter(p->p.getMonHocTienQuyet().getMh().stream().anyMatch(q->q.equals(monHoc))).collect(Collectors.toList());
        
        
    }
    
    public List<MonHoc> timListMonHocTruoc(MonHoc monHoc){
        
        return  this.mh.stream().filter(p->p.getMonHocTruoc().getMh().stream().anyMatch(q->q.equals(monHoc))).collect(Collectors.toList());
        
        
    }

    
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
