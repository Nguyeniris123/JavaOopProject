/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.dh22it01;

/**
 *
 * @author NGUYEN
 */
public class MonHoc {

    private static int dem;
    private String maMonHoc;
    private String tenMonHoc;
    private String moTaMonHoc;
    private int soTinChi;
    private KhoiKienThuc khoiKienThuc;
    private QuanLiMonHoc monHocTienQuyet = new QuanLiMonHoc();
    private QuanLiMonHoc monHocTruoc = new QuanLiMonHoc();
    private QuanLyDeCuong danhSachDeCuong = new QuanLyDeCuong();

    {
        this.maMonHoc = String.format("DH22%03d", ++dem);
    }

    public MonHoc(String tenMonHoc, String moTaMonHoc, int soTinChi, KhoiKienThuc khoiKienThuc) {
        this.tenMonHoc = tenMonHoc;
        this.moTaMonHoc = moTaMonHoc;
        this.soTinChi = soTinChi;
        this.khoiKienThuc = khoiKienThuc;
    }

    public MonHoc() {

    }

    public MonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public void themMonHocTruoc(MonHoc monHoc) {
        if (this.getMonHocTruoc().getMh().size() <= 3) {
            this.getMonHocTruoc().themMonHoc(monHoc);
        }
    }
    
    public void xoaMonHocTruoc(String ma) {
        this.getMonHocTruoc().xoaMonHoc(ma);
    }

    public void themMonHocTienQuyet(MonHoc monHoc) {
        if (this.getMonHocTienQuyet().getMh().size() <= 3) {
            this.getMonHocTienQuyet().themMonHoc(monHoc);
        }
    }

    public void xoaMonHocTienQuyet(String ma) {
        this.getMonHocTienQuyet().xoaMonHoc(ma);
    }

    public void hienThiMonHoc() {
        System.out.printf("Ma mon hoc: %s\n", this.getMaMonHoc());
        System.out.printf("Ten mon hoc: %s\n", this.getTenMonHoc());
        System.out.printf("Mo ta mon hoc: %s\n", this.getMoTaMonHoc());
        System.out.printf("So tin chi: %d\n", this.getSoTinChi());
        System.out.printf("Khoi kien thuc: %s\n", this.getKhoiKienThuc());
        this.hienThiDSMonHocTruoc();
        this.hienThiDSMonHocTienQuyet();
        System.out.println("-------------");
    }

    public void hienThiDSMonHocTruoc() {
        if (!this.monHocTruoc.getMh().isEmpty()) {
            System.out.print("Danh sach mon hoc truoc: ");
            this.getMonHocTruoc().hienThiDSTenMonHoc();
        }
    }

    public void hienThiDSMonHocTienQuyet() {
        if (!this.monHocTienQuyet.getMh().isEmpty()) {
            System.out.print("Danh sach mon hoc tien quyet: ");
            this.getMonHocTienQuyet().hienThiDSTenMonHoc();
        }
    }

    public void khoiTaoDeCuongChinhQuy(GiangVien giangVien) {
        if (this.getDanhSachDeCuong().getDS().stream().anyMatch(p -> p.kiemTraLoaiDeCuong() == false) == false
                &&giangVien.getDsDeCuong().getDS().size()<=5) {
            DeCuongChinhQuy deCuong = new DeCuongChinhQuy(this,giangVien);
            deCuong.khoiTaoDeCuong();
            this.getDanhSachDeCuong().themDeCuong(deCuong);
            giangVien.getDsDeCuong().themDeCuong(deCuong);
        } else {
            System.out.println("Mon hoc nay da co de cuong he Chinh quy!");
        }
    }

    public void khoiTaoDeCuongLienThong(GiangVien giangVien) {
        if (this.getDanhSachDeCuong().getDS().stream().anyMatch(p -> p.kiemTraLoaiDeCuong() == true) == false
                &&giangVien.getDsDeCuong().getDS().size()<=5) {
            DeCuongLienThong deCuong = new DeCuongLienThong(this,giangVien);
            deCuong.khoiTaoDeCuong();
            this.getDanhSachDeCuong().themDeCuong(deCuong);
            giangVien.getDsDeCuong().themDeCuong(deCuong);
        } else {
            System.out.println("Mon hoc nay da co de cuong he lien thong!");
        }
    }

    public void hienThiDeCuongChinhQuy() {
        DeCuongChinhQuy a=(DeCuongChinhQuy) this.getDanhSachDeCuong().getDS().stream().filter(p-> p instanceof DeCuongChinhQuy ).findFirst().orElse(null);
        if(a!=null)
            a.hienThiDeCuong();
    }
    
    public void hienThiDeCuongLienThong() {
        DeCuongLienThong a=(DeCuongLienThong) this.getDanhSachDeCuong().getDS().stream().filter(p-> p instanceof DeCuongLienThong ).findFirst().orElse(null);
        if(a!=null)
            a.hienThiDeCuong();
    }

    public void suaDeCuongChinhQuy() {
        if (this.getDanhSachDeCuong().getDS().stream().anyMatch(p -> p.kiemTraLoaiDeCuong() == false) == false) {
            System.out.println("Mon hoc nay chua co de cuong he Chinh quy!");
        } else {
            System.out.println("Mon hoc nay da co de cuong he Chinh quy!");
            this.getDanhSachDeCuong().getDS().forEach(p -> {
                if (p.kiemTraLoaiDeCuong() == false) {
                    p.suaNoiDung();
                }
            });
        }
    }
    
    public void suaDeCuongLienThong() {
        if (this.getDanhSachDeCuong().getDS().stream().anyMatch(p -> p.kiemTraLoaiDeCuong() == true) == false) {
            System.out.println("Mon hoc nay chua co de cuong he Chinh quy!");
        } else {
            System.out.println("Mon hoc nay da co de cuong he Chinh quy!");
            this.getDanhSachDeCuong().getDS().forEach(p -> {
                if (p.kiemTraLoaiDeCuong() == true) {
                    p.suaNoiDung();
                }
            });
        }
    }
    
    public void themCotDiemDeCuongChinhQuy() {
        if (this.getDanhSachDeCuong().getDS().stream().anyMatch(p -> p.kiemTraLoaiDeCuong() == false) == false) {
            System.out.println("Mon hoc nay chua co de cuong he Chinh quy!");
        } else {
            System.out.println("Mon hoc nay da co de cuong he Chinh quy!");
            this.getDanhSachDeCuong().getDS().forEach(p -> {
                if (p.kiemTraLoaiDeCuong() == false) {
                    p.nhapCotDiem(new CotDiem());
                }
            });
        }
    }
    
    public void themCotDiemDeCuongLienThong() {
        if (this.getDanhSachDeCuong().getDS().stream().anyMatch(p -> p.kiemTraLoaiDeCuong() == true) == false) {
            System.out.println("Mon hoc nay chua co de cuong he Chinh quy!");
        } else {
            System.out.println("Mon hoc nay da co de cuong he Chinh quy!");
            this.getDanhSachDeCuong().getDS().forEach(p -> {
                if (p.kiemTraLoaiDeCuong() == true) {
                    p.nhapCotDiem(new CotDiem());
                }
            });
        }
    }
    
    public void xoaCotDiemDeCuongChinhQuy() {
        if (this.getDanhSachDeCuong().getDS().stream().anyMatch(p -> p.kiemTraLoaiDeCuong() == false) == false) {
            System.out.println("Mon hoc nay chua co de cuong he Chinh quy!");
        } else {
            System.out.println("Mon hoc nay da co de cuong he Chinh quy!");
            this.getDanhSachDeCuong().getDS().forEach(p -> {
                if (p.kiemTraLoaiDeCuong() == false) {
                    p.xoaCotDiem();
                }
            });
        }
    }
    
     public void xoaCotDiemDeCuongLienThong() {
        if (this.getDanhSachDeCuong().getDS().stream().anyMatch(p -> p.kiemTraLoaiDeCuong() == true) == false) {
            System.out.println("Mon hoc nay chua co de cuong he Chinh quy!");
        } else {
            System.out.println("Mon hoc nay da co de cuong he Chinh quy!");
            this.getDanhSachDeCuong().getDS().forEach(p -> {
                if (p.kiemTraLoaiDeCuong() == true) {
                    p.xoaCotDiem();
                }
            });
        }
    }
    
    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    /**
     * @return the maMonHoc
     */
    public String getMaMonHoc() {
        return maMonHoc;
    }

    /**
     * @param maMonHoc the maMonHoc to set
     */
    /**
     * @return the tenMonHoc
     */
    public String getTenMonHoc() {
        return tenMonHoc;
    }

    /**
     * @param tenMonHoc the tenMonHoc to set
     */
    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    /**
     * @return the moTaMonHoc
     */
    public String getMoTaMonHoc() {
        return moTaMonHoc;
    }

    /**
     * @param moTaMonHoc the moTaMonHoc to set
     */
    public void setMoTaMonHoc(String moTaMonHoc) {
        this.moTaMonHoc = moTaMonHoc;
    }

    /**
     * @return the soTinChi
     */
    public int getSoTinChi() {
        return soTinChi;
    }

    /**
     * @param soTinChi the soTinChi to set
     */
    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    /**
     * @return the khoiKienThuc
     */
    public KhoiKienThuc getKhoiKienThuc() {
        return khoiKienThuc;
    }

    /**
     * @param khoiKienThuc the khoiKienThuc to set
     */
    public void setKhoiKienThuc(KhoiKienThuc khoiKienThuc) {
        this.khoiKienThuc = khoiKienThuc;
    }

    /**
     * @return the monHocTienQuyet
     */
    public QuanLiMonHoc getMonHocTienQuyet() {
        return monHocTienQuyet;
    }

    /**
     * @param monHocTienQuyet the monHocTienQuyet to set
     */
    public void setMonHocTienQuyet(QuanLiMonHoc monHocTienQuyet) {
        this.monHocTienQuyet = monHocTienQuyet;
    }

    /**
     * @return the monHocTruoc
     */
    public QuanLiMonHoc getMonHocTruoc() {
        return monHocTruoc;
    }

    /**
     * @param monHocTruoc the monHocTruoc to set
     */
    public void setMonHocTruoc(QuanLiMonHoc monHocTruoc) {
        this.monHocTruoc = monHocTruoc;
    }

    /**
     * @return the danhSachDeCuong
     */
    public QuanLyDeCuong getDanhSachDeCuong() {
        return danhSachDeCuong;
    }

    /**
     * @param danhSachDeCuong the danhSachDeCuong to set
     */
    public void setDanhSachDeCuong(QuanLyDeCuong danhSachDeCuong) {
        this.danhSachDeCuong = danhSachDeCuong;
    }
   
}
